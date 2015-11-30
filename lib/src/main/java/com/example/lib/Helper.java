package com.example.lib;

public class Helper {
    public String getString() {
        return stringFromJNI();
    }
    // A native method that is implemented by the 'hello-jni' native library.
    public native String  stringFromJNI();


}