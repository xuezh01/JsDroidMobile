#include<jni.h>
#include<android/log.h>

#define TAG "minicap-jni" // 自定义的LOG的标识
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG,TAG ,__VA_ARGS__) // 定义LOGD类型 
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO,TAG ,__VA_ARGS__) // 定义LOGI类型 
#define LOGW(...) __android_log_print(ANDROID_LOG_WARN,TAG ,__VA_ARGS__) // 定义LOGW类型 
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR,TAG ,__VA_ARGS__) // 定义LOGE类型 
#define LOGF(...) __android_log_print(ANDROID_LOG_FATAL,TAG ,__VA_ARGS__) // 定义LOGF类型
#include <fcntl.h>
#include <getopt.h>
#include <linux/fb.h>
#include <stdlib.h>
#include <unistd.h>
#include <signal.h>
#include <sys/socket.h>

#include <cmath>
#include <condition_variable>
#include <chrono>
#include <future>
#include <iostream>
#include <mutex>
#include <thread>

#include <Minicap.hpp>
#include<android/bitmap.h>
#include <string>
#include "JpgEncoder.hpp"


#define DEFAULT_DISPLAY_ID 0


static int init;
static void initThreadPool(){
    if(init){
        return;
    }
    // Start Android's thread pool so that it will be able to serve our requests.
    minicap_start_thread_pool();
    init = true;
}




//minicap截图监听器
class FrameWaiter: public Minicap::FrameAvailableListener {
public:
  FrameWaiter()
    : mPendingFrames(0),
      mTimeout(std::chrono::milliseconds(100)),
      mStopped(false) {
  }

  int
  waitForFrame() {
    std::unique_lock<std::mutex> lock(mMutex);

    while (!mStopped) {
      if (mCondition.wait_for(lock, mTimeout, [this]{return mPendingFrames > 0;})) {
        return mPendingFrames--;
      }
    }

    return 0;
  }

  void
  reportExtraConsumption(int count) {
    std::unique_lock<std::mutex> lock(mMutex);
    mPendingFrames -= count;
  }

  void
  onFrameAvailable() {
    std::unique_lock<std::mutex> lock(mMutex);
    mPendingFrames += 1;
    mCondition.notify_one();
  }

  void
  stop() {
    mStopped = true;
  }

  bool
  isStopped() {
    return mStopped;
  }

private:
  std::mutex mMutex;
  std::condition_variable mCondition;
  std::chrono::milliseconds mTimeout;
  int mPendingFrames;
  bool mStopped;
};


class JsDroidMinicap{
public:
    JsDroidMinicap(){
    }
    ~JsDroidMinicap(){
        gWaiter.stop();
        releaseFrame();
        releaseMinicap();
    }

    void initMinicap(){
        if(init){
            releaseFrame();
            releaseMinicap();
        }
        initThreadPool();
        LOGE("create minicap");
        minicap = minicap_create(DEFAULT_DISPLAY_ID);
        if (minicap == NULL) {
            LOGE("can't create minicap.");
            return;
        }
        Minicap::DisplayInfo realInfo;
        realInfo.width = mRealWidth;
        realInfo.height = mRealHeight;
        LOGE("set real info");
        minicap->setRealInfo(realInfo);

        Minicap::DisplayInfo desireInfo;
        desireInfo.width = mDesireWidth;
        desireInfo.height = mDesireHeight;
        desireInfo.orientation = mRotation;

        LOGE("set desire info");
        minicap->setDesiredInfo(desireInfo);


        LOGE("set waiter");
        minicap->setFrameAvailableListener(&gWaiter);

        LOGE("apply config");
        minicap->applyConfigChanges();

        encoder.reserveData(mRealWidth,mRealHeight);
        init = true;
    }

    void releaseMinicap(){
        if(!init){
            return;
        }
        minicap_free(minicap);
        init = false;
    }

    void setRealSize(int width,int height){
        mRealWidth = width;
        mRealHeight = height;
    }

    void setDesiredSize(int width,int height,int rotation){
        mDesireWidth= width;
        mDesireHeight = height;
        mRotation = rotation;
    }

    void releaseFrame(){
        if (haveFrame) {
            minicap->releaseConsumedFrame(&frame);
            haveFrame = 0;
        }
    }
    int readFrame(){
        //先释放
        releaseFrame();
        int pending = gWaiter.waitForFrame();
        if(pending>1){
            //打印跳过信息
            gWaiter.reportExtraConsumption(pending - 1);
            //跳过多余帧
            while (--pending >= 1) {
                if ((minicap->consumePendingFrame(&frame)) != 0) {
                    //error
                    return 0;
                }
                minicap->releaseConsumedFrame(&frame);
            }

        }
        if ((minicap->consumePendingFrame(&frame)) != 0) {
            //error
            return 0;
        }
        //读取到了frame
        haveFrame = true;
        return 1;
    }
    Minicap::Frame getFrame(){
        return frame;
    }

    jbyteArray readJpg(JNIEnv *env,int quality){
        if(!readFrame()){
            LOGE("can't read frame");
            return NULL;
        }
        LOGE("encode frame:%d,%d",frame.width,frame.height);
        if (!encoder.encode(&frame, quality)) {
            LOGE("can't encode frame");
            return NULL;
        }
        size_t size = encoder.getEncodedSize();
        jbyteArray bytes =NULL;
        bytes = env->NewByteArray(size);
        env->SetByteArrayRegion(bytes, 0, size, (const jbyte*)encoder.getEncodedData());
        LOGE("ok");
        return bytes;

    }

private:
    Minicap* minicap;
    Minicap::Frame frame;
    FrameWaiter gWaiter;
    JpgEncoder encoder;
    int haveFrame;
    int init;
    int mRealWidth,mRealHeight;
    int mDesireWidth,mDesireHeight,mRotation;
};

//初始化minicap
static JsDroidMinicap jsdcap;
extern "C"
JNIEXPORT void JNICALL
Java_com_jsdroid_minicap_JsDroidMiniCap_init(JNIEnv *env, jclass type) {
    LOGE("init minicap");

}
//释放minicap
extern "C"
JNIEXPORT void JNICALL
Java_com_jsdroid_minicap_JsDroidMiniCap_release(JNIEnv *env, jclass type) {
    LOGE("release minicap");
    jsdcap.releaseMinicap();
}
//设置设备屏幕大小
extern "C"
JNIEXPORT void JNICALL
Java_com_jsdroid_minicap_JsDroidMiniCap_setRealSize(JNIEnv *env, jclass type, jint width,
                                                    jint height) {
    LOGE("set real size:%d,%d",width,height);
    jsdcap.setRealSize(width,height);
}

//设置期望的图片大小
extern "C"
JNIEXPORT void JNICALL
Java_com_jsdroid_minicap_JsDroidMiniCap_setDesiredSize(JNIEnv *env, jclass type, jint width,
                                                       jint height, jint rotation) {
    LOGE("set desire size:%d,%d,%d",width,height,rotation);
    jsdcap.setDesiredSize(width,height,rotation);
    jsdcap.initMinicap();
}
//读取image，用于找图？
extern "C"
JNIEXPORT jboolean JNICALL
Java_com_jsdroid_minicap_JsDroidMiniCap_readImage(JNIEnv *env, jclass type, jobject image) {
    if(!jsdcap.readFrame()){
        return false;
    }
    //将帧信息返回
    return true;
}
//读取jpg
extern "C"
JNIEXPORT jbyteArray JNICALL
Java_com_jsdroid_minicap_JsDroidMiniCap_readJpg(JNIEnv *env, jclass type, jint quality) {

    LOGE("read jpg.");
    return jsdcap.readJpg(env,quality);
}