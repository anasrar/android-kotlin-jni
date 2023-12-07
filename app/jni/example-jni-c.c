#include <string.h>
#include <jni.h>

JNIEXPORT jstring JNICALL 
Java_anasrin_kotlinjni_NativeC_getString(JNIEnv *env, jobject obj) {
    return (*env)->NewStringUTF(env, "String from example-jni-c.c");
}
