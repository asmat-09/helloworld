package com.example.helloworld

import android.util.Log

class MyClass {
    fun msg(msg: String) {
        Log.d("TAG", "This is from library: $msg")
    }
}