#include<jni.h>
#include<android/bitmap.h>
#define JNIREG_CLASS "Lcom.jsdroid.jpeg.JPEG;"
#include<android/log.h>

#define TAG "jpeg-jni" // 自定义的LOG的标识 
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG,TAG ,__VA_ARGS__) // 定义LOGD类型 
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO,TAG ,__VA_ARGS__) // 定义LOGI类型 
#define LOGW(...) __android_log_print(ANDROID_LOG_WARN,TAG ,__VA_ARGS__) // 定义LOGW类型 
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR,TAG ,__VA_ARGS__) // 定义LOGE类型 
#define LOGF(...) __android_log_print(ANDROID_LOG_FATAL,TAG ,__VA_ARGS__) // 定义LOGF类型 

#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <string.h>

#include <turbojpeg.h>
typedef u_int8_t BYTE;
static tjhandle handle = tjInitCompress();
static int pixelFormat = TJPF_RGBA;
static int jpegSubsamp = TJSAMP_420;
static int flags =  TJFLAG_FASTDCT|TJFLAG_NOREALLOC;

int maxSize(int width,int height){
	return tjBufSize(width,height,TJSAMP_420);
}

int compress(unsigned char* srcBuf,int width,int stride,int height,int jpegQual,unsigned char **jpegBuf,unsigned long *jpegSize){
	return 0 == tjCompress2(
		handle,
		srcBuf,
		width,
		stride,
		height,
		pixelFormat,
		jpegBuf,
		jpegSize,
		jpegSubsamp,
		jpegQual,
		flags);	
}

//java接口函数
//private static native int processBitmap(Bitmap bitmap,int quality);
//对应C++函数
extern "C"
JNIEXPORT jbyteArray JNICALL
Java_com_jsdroid_jpeg_JPEG_encode
(JNIEnv *env, jclass type,jobject bmpObj,jint quality){
	AndroidBitmapInfo bmpInfo;
	memset(&bmpInfo, 0, sizeof(bmpInfo));
    if(AndroidBitmap_getInfo(env,bmpObj,&bmpInfo)<0){
		LOGE("get bitmap info error.");
		return NULL;
	}
	int width = bmpInfo.width;
	int height = bmpInfo.height;
	int stride = bmpInfo.stride;
	jbyteArray bytes = NULL;
	unsigned char* dataFromBmp = NULL;
	//锁定图片数据
	if (AndroidBitmap_lockPixels(env,bmpObj,(void **)&dataFromBmp)){
		//失败
		LOGE("get pixels error.");
		return NULL;
	}
	//开辟空间
	unsigned char* encodeData = tjAlloc(maxSize(width,height));
	long size;
	//编码
	if(compress(dataFromBmp,width,stride,height,quality,&encodeData,(unsigned long*)&size)){	
		//将数据拷贝到bytes
		bytes = env->NewByteArray(size);
		env->SetByteArrayRegion(bytes, 0, size, (const jbyte*)encodeData);	
	}
	//释放空间
	tjFree(encodeData);
	//释放图片数据
	AndroidBitmap_unlockPixels(env,bmpObj);	
	return bytes;
}





extern "C"
JNIEXPORT jint JNICALL
Java_com_jsdroid_jpeg_JPEG_dealImage2(JNIEnv *env, jclass type, jobject image1, jobject image2) {
	int hasLockImagePixel1,hasLockImagePixel2;
	AndroidBitmapInfo bmpInfo1,bmpInfo2;
	unsigned char * imageBuff1 = NULL;
	unsigned char * imageBuff2 = NULL;
	int minColor = 0x33;
	int count;

	memset(&bmpInfo1, 0, sizeof(bmpInfo1));
    if(AndroidBitmap_getInfo(env,image1,&bmpInfo1)<0){
		goto end;
	}
	memset(&bmpInfo2, 0, sizeof(bmpInfo2));
    if(AndroidBitmap_getInfo(env,image2,&bmpInfo2)<0){
		goto end;
	}
	if (AndroidBitmap_lockPixels(env,image1,(void **)&imageBuff1)){
	
		goto end;
	}else{
		hasLockImagePixel1 = 1;
	}
	if (AndroidBitmap_lockPixels(env,image2,(void **)&imageBuff2)){
	
		goto end;
	}else{
		hasLockImagePixel2 = 1;
	}
	
	if(bmpInfo1.width!=bmpInfo2.width||bmpInfo1.height!=bmpInfo2.height){
		goto end;
	}
	//LOGE("width:%d height: %d stride:%d",bmpInfo1.width,bmpInfo1.height,bmpInfo1.stride);
	//LOGE("width:%d height: %d stride:%d",bmpInfo2.width,bmpInfo2.height,bmpInfo2.stride);
	int r1,g1,b1,r2,g2,b2;
	for(int i=0;i<bmpInfo1.height;i++){
        int offset1 = bmpInfo1.stride*i;
        int offset2 = bmpInfo2.stride*i;
        for(int j=0;j<bmpInfo1.width;j++){
            int pos1 = offset1+j*4;
            int pos2 = offset2+j*4;

            r2 = imageBuff2 [pos2];
            g2 = imageBuff2 [pos2+1];
            b2 = imageBuff2 [pos2+2];
            //处理颜色，让颜色不可能为0
            if(r2<minColor){
                r2=minColor;
            }
            if(g2<minColor){
                g2=minColor;
            }
            if(b2<minColor){
                b2=minColor;
            }

            r1 = imageBuff1 [pos1];
            g1 = imageBuff1 [pos1+1];
            b1 = imageBuff1 [pos1+2];

            if(r1==r2&&g1==g2&&b1==b2){
                //如果颜色相等，则去除
                imageBuff2 [pos2] = 0;//red
                imageBuff2 [pos2+1] = 0;//green
                imageBuff2 [pos2+2] = 0;//blue
                imageBuff2 [pos2+3] = 0;//alpha
            }else{
                //如果颜色不相等，则赋值到图1
                imageBuff1 [pos1] = r2;
                imageBuff1 [pos1+1] = g2;
                imageBuff1 [pos1+2] = b2;
                imageBuff1 [pos1+3] = 255;
                count++;
            }
        }
    }

	end:
	if(hasLockImagePixel1){
		AndroidBitmap_unlockPixels(env,image1);	
	}
	if(hasLockImagePixel2){
		AndroidBitmap_unlockPixels(env,image2);	
	}
	return count;
}



extern "C"
JNIEXPORT jint JNICALL
Java_com_jsdroid_jpeg_JPEG_needUpdate(JNIEnv *env, jclass type, jobject image1, jobject image2) {
	int hasLockImagePixel1,hasLockImagePixel2;
	AndroidBitmapInfo bmpInfo1,bmpInfo2;
	unsigned char * imageBuff1 = NULL;
	unsigned char * imageBuff2 = NULL;
	int minColor = 0x33;
	int count = 0;

	memset(&bmpInfo1, 0, sizeof(bmpInfo1));
    if(AndroidBitmap_getInfo(env,image1,&bmpInfo1)<0){
		goto end;
	}
	memset(&bmpInfo2, 0, sizeof(bmpInfo2));
    if(AndroidBitmap_getInfo(env,image2,&bmpInfo2)<0){
		goto end;
	}
	if (AndroidBitmap_lockPixels(env,image1,(void **)&imageBuff1)){

		goto end;
	}else{
		hasLockImagePixel1 = 1;
	}
	if (AndroidBitmap_lockPixels(env,image2,(void **)&imageBuff2)){

		goto end;
	}else{
		hasLockImagePixel2 = 1;
	}

	if(bmpInfo1.width!=bmpInfo2.width||bmpInfo1.height!=bmpInfo2.height){
		goto end;
	}
	int r1,g1,b1,r2,g2,b2;
	for(int i=0;i<bmpInfo1.height;i++){
        int offset1 = bmpInfo1.stride*i;
        int offset2 = bmpInfo2.stride*i;
        for(int j=0;j<bmpInfo1.width;j++){
            int pos1 = offset1+j*4;
            int pos2 = offset2+j*4;

            r1 = imageBuff1 [pos1];
            g1 = imageBuff1 [pos1+1];
            b1 = imageBuff1 [pos1+2];

            r2 = imageBuff2 [pos2];
            g2 = imageBuff2 [pos2+1];
            b2 = imageBuff2 [pos2+2];

            if(r1!=r2||g1!=g2||b1!=b2){
                count =1;
                goto end;
            }

        }
    }

	end:
	if(hasLockImagePixel1){
		AndroidBitmap_unlockPixels(env,image1);
	}
	if(hasLockImagePixel2){
		AndroidBitmap_unlockPixels(env,image2);
	}
	return count;
}











