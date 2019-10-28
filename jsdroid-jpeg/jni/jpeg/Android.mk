LOCAL_PATH := $(call my-fileDir)
include $(CLEAR_VARS)
LOCAL_MODULE := jsdroid-jpeg


LOCAL_LDLIBS    := -ljnigraphics -llog
LOCAL_SRC_FILES := \
	jpeg.cpp \

LOCAL_STATIC_LIBRARIES := \
	libjpeg-turbo \
	
include $(BUILD_SHARED_LIBRARY)

#include $(BUILD_EXECUTABLE)
