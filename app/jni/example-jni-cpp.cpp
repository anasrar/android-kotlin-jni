#include <string.h>
#include <jni.h>

extern "C" JNIEXPORT jstring JNICALL 
Java_anasrin_kotlinjni_NativeCpp_getString(JNIEnv *env, jobject obj) {
    return env->NewStringUTF("String from example-jni-cpp.cpp");
}
