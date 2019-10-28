#include "jni.h"
#include<sys/types.h>
#include<sys/stat.h>

extern "C"
JNIEXPORT jint JNICALL
Java_com_jsdroid_os_Os_mkfifo(JNIEnv *env, jclass clazz, jstring path, jint mode) {
    const char *mpath = env->GetStringUTFChars(path, 0);
    if (mpath == NULL) {
        return -1;
    }
    int ret = mkfifo(mpath, (mode_t) mode);
    env->ReleaseStringUTFChars(path, mpath);
    return ret;
}