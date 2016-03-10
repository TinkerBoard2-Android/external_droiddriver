LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES := $(call all-java-files-under, src)

LOCAL_MODULE := droiddriver
LOCAL_MODULE_TAGS := optional
LOCAL_SDK_VERSION := 19
# Workaround for http://b/27584859
LOCAL_JAVA_LANGUAGE_VERSION := 1.8

LOCAL_JAVACFLAGS += -Xlint:deprecation -Xlint:unchecked

include $(BUILD_STATIC_JAVA_LIBRARY)

include $(CLEAR_VARS)

include $(call all-makefiles-under,$(LOCAL_PATH))
