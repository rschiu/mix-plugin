
#include <string.h>
#include <jni.h>

// This is a trivial JNI example where we use a native method
// to return a new VM String.
jstring
Java_com_example_lib_Helper_stringFromJNI(JNIEnv* env, jobject thiz)
{
    return (*env)->NewStringUTF(env, "hello world!");
}