#include <jni.h>

JNIEXPORT jint JNICALL 
Java_anasrin_kotlinjni_Counter_increment(JNIEnv *env, jobject obj) {
    jclass cls = (*env)->GetObjectClass(env, obj);
    jfieldID fieldValue = (*env)->GetFieldID(env, cls, "value", "I");
    jint value = (*env)->GetIntField(env, obj, fieldValue);
    value += 1;
    (*env)->SetIntField(env, obj, fieldValue, value);
    return value;
}

JNIEXPORT jint JNICALL 
Java_anasrin_kotlinjni_Counter_decrement(JNIEnv *env, jobject obj) {
    jclass cls = (*env)->GetObjectClass(env, obj);
    jfieldID fieldValue = (*env)->GetFieldID(env, cls, "value", "I");
    jint value = (*env)->GetIntField(env, obj, fieldValue);
    value -= 1;
    (*env)->SetIntField(env, obj, fieldValue, value);
    return value;
}
