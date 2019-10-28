#include <jni.h>
#include <android/log.h>

#define LOG_TAG  "findpic"
#define loge(...)  __android_log_print(ANDROID_LOG_FATAL, LOG_TAG, __VA_ARGS__)

#include "colors.h"

#include <map>
#include<android/bitmap.h>

using namespace jsdroid;

long font_index;
map<long, Font *> fontMap;

void getBitmapSize(JNIEnv *env, jobject bmp, int &w, int &h) {
    AndroidBitmapInfo info;
    AndroidBitmap_getInfo(env, bmp, &info);
    w = info.width;
    h = info.height;
}
//创建字体
extern "C"
JNIEXPORT jlong JNICALL
Java_com_jsdroid_colors_Font_nativeCreateFont(JNIEnv *env, jclass type, jobject img, jint color,
                                              jint offset) {


    void *colors;
    AndroidBitmapInfo info;
    AndroidBitmap_getInfo(env, img, &info);
    AndroidBitmap_lockPixels(env, img, &colors);
    Img fontImg(info.width, info.height, (RGB *) colors);
    Font *font = createFont(fontImg, *(RGB *) &color, *(RGB *) &offset);
    long id = font_index++;
    font->id = id;
    fontMap[id] = font;
    AndroidBitmap_unlockPixels(env, img);
    return id;


}

//释放字体
extern "C"
JNIEXPORT void JNICALL
Java_com_jsdroid_colors_Font_nativeReleaseFont(JNIEnv *env, jclass type, jlong id) {
    Font *font = fontMap[id];
    releaseFont(font);
    fontMap.erase(id);
}

//找字
extern "C"
JNIEXPORT jlongArray JNICALL
Java_com_jsdroid_colors_Ocr_nativeOcr(JNIEnv *env, jclass type, jobject img, jlongArray fonts_,
                                      jint color, jint offset, jfloat sim, jint distance) {
    int width, height;
    void *colors;
    AndroidBitmapInfo info;
    AndroidBitmap_getInfo(env, img, &info);
    width = info.width;
    height = info.height;
    AndroidBitmap_lockPixels(env, img, &colors);
    jlong *fonts = env->GetLongArrayElements(fonts_, NULL);
    vector<Font> v_fonts;
    int size = env->GetArrayLength(fonts_);

    for (int i = 0; i < size; ++i) {
        long id = (long) fonts[i];
        Font *f = fontMap[id];
        v_fonts.push_back(*f);
    }

    Img pic(width, height, (RGB *) colors);
    CodePic codePic(pic, *(RGB *) &color, *(RGB *) &offset);
    vector<Code> result = codePic.ocr(v_fonts, distance, sim);
    int count = (int) result.size();
    jlong *ret = new jlong[count * 3];
    for (int i = 0; i < count; ++i) {
        ret[i * 3] = result[i].font_id;
        ret[i * 3 + 1] = result[i].left;
        ret[i * 3 + 2] = result[i].top;
    }
    jlongArray arr = env->NewLongArray(count * 3);
    env->ReleaseLongArrayElements(arr, ret, 0);
    env->ReleaseLongArrayElements(fonts_, fonts, 0);
    AndroidBitmap_unlockPixels(env, img);
    return arr;
}

//扫描颜色
extern "C"
JNIEXPORT void JNICALL
Java_com_jsdroid_colors_Colors_native_1scan_1color(JNIEnv *env, jclass type, jobject bitmap,
                                                   jint color, jint offset) {
    AndroidBitmapInfo srcInfo;
    void *srcColor;
    AndroidBitmap_getInfo(env, bitmap, &srcInfo);
    AndroidBitmap_lockPixels(env, bitmap, &srcColor);
    Img img(srcInfo.width, srcInfo.height, (RGB *) srcColor);
    img.toFontMap(*(RGB *) &color, *(RGB *) &offset);
    AndroidBitmap_unlockPixels(env, bitmap);
}

//找图
extern "C"
JNIEXPORT jintArray JNICALL
Java_com_jsdroid_colors_Colors_native_1find_1pic(JNIEnv *env, jclass type, jobject big,
                                                 jobject small, jint offset, jfloat sim) {
    int bigW, bigH, smallW, smallH;
    void *bigColor;
    void *smallColor;
    jintArray retIntArr = env->NewIntArray(2);
    int ret[2];

    getBitmapSize(env, big, bigW, bigH);
    getBitmapSize(env, small, smallW, smallH);
    AndroidBitmap_lockPixels(env, big, &bigColor);
    AndroidBitmap_lockPixels(env, small, &smallColor);

    Img bigImg(bigW, bigH, (RGB *) bigColor);
    Img smallImg(smallW, smallH, (RGB *) smallColor);


    Point p;
    if (find_pic(p, bigImg, smallImg, *(RGB *) &offset, sim)) {
        ret[0] = p.x;
        ret[1] = p.y;
    } else {
        ret[0] = -1;
        ret[1] = -1;
    }
    if (big) {
        AndroidBitmap_unlockPixels(env, big);
    }
    if (small) {
        AndroidBitmap_unlockPixels(env, small);
    }
    env->SetIntArrayRegion(retIntArr, 0, 2, ret);
    return retIntArr;
}
extern "C"
JNIEXPORT jintArray JNICALL
Java_com_jsdroid_colors_Colors_native_1find_1all_1pic(JNIEnv *env, jclass type, jobject big,
                                                      jobject small, jint offset, jfloat sim) {

    int bigW, bigH, smallW, smallH;
    void *bigColor;
    void *smallColor;


    getBitmapSize(env, big, bigW, bigH);
    getBitmapSize(env, small, smallW, smallH);
    AndroidBitmap_lockPixels(env, big, &bigColor);
    AndroidBitmap_lockPixels(env, small, &smallColor);

    Img bigImg(bigW, bigH, (RGB *) bigColor);
    Img smallImg(smallW, smallH, (RGB *) smallColor);
    vector<Point> result = find_all_pic(bigImg, smallImg, *(RGB *) &offset, sim);
    int len = (int) result.size() * 2;
    jintArray retIntArr = env->NewIntArray(len);
    int ret[len];
    int p = 0;
    for (int i = 0; i < len; i = i + 2) {
        ret[i] = result[p].x;
        ret[i + 1] = result[p].y;
        ++p;
    }

    if (big) {
        AndroidBitmap_unlockPixels(env, big);
    }
    if (small) {
        AndroidBitmap_unlockPixels(env, small);
    }
    env->SetIntArrayRegion(retIntArr, 0, len, ret);
    return retIntArr;
}

extern "C"
JNIEXPORT jintArray JNICALL
Java_com_jsdroid_colors_Colors_native_1find_1multi_1color(JNIEnv *env, jclass type, jobject bitmap,
                                                          jintArray color_, jint offset,
                                                          jfloat sim) {
    jint *color = env->GetIntArrayElements(color_, NULL);
    int width, height;
    void *imgColors;
    getBitmapSize(env, bitmap, width, height);
    AndroidBitmap_lockPixels(env, bitmap, &imgColors);
    Img img(width, height, (RGB *) imgColors);
    int colorCount = env->GetArrayLength(color_);

    vector<MultiColor> colors;
    for (int i = 0; i < colorCount; i = i + 3) {
        MultiColor c;
        c.color = *(RGB *) &color[i];
        c.p.x = color[i + 1];
        c.p.y = color[i + 2];
        colors.push_back(c);
    }
    jintArray intArr = env->NewIntArray(2);
    int ints[2];
    Point ret;
    if (find_multi_color(ret, img, colors, *(RGB *) &offset, sim)) {
        ints[0] = ret.x;
        ints[1] = ret.y;
    } else {
        ints[0] = -1;
        ints[1] = -1;
    }
    env->SetIntArrayRegion(intArr, 0, 2, ints);
    AndroidBitmap_unlockPixels(env, bitmap);
    env->ReleaseIntArrayElements(color_, color, 0);
    return intArr;
}