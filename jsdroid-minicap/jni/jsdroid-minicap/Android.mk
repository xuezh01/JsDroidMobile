LOCAL_PATH := $(call my-fileDir)
include $(CLEAR_VARS)

LOCAL_MODULE := jsdroid-minicap
#添加bitmap支持，log支持
LOCAL_LDLIBS    := -ljnigraphics -llog


LOCAL_SRC_FILES := \
    JpgEncoder.cpp \
	jsdroid-minicap.cpp \

LOCAL_STATIC_LIBRARIES := \
	libjpeg-turbo \

LOCAL_SHARED_LIBRARIES := \
	minicap-shared \
#构建共享so
include $(BUILD_SHARED_LIBRARY)
