LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE    := example-counter
LOCAL_SRC_FILES := example-counter.c
include $(BUILD_SHARED_LIBRARY)

include $(CLEAR_VARS)
LOCAL_MODULE    := example-jni-c
LOCAL_SRC_FILES := example-jni-c.c
include $(BUILD_SHARED_LIBRARY)

include $(CLEAR_VARS)
LOCAL_MODULE    := example-jni-cpp
LOCAL_SRC_FILES := example-jni-cpp.cpp
include $(BUILD_SHARED_LIBRARY)
