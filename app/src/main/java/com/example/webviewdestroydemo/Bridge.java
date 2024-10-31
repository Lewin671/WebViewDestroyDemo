package com.example.webviewdestroydemo;

import android.annotation.SuppressLint;
import android.util.Log;
import android.webkit.JavascriptInterface;

import java.util.concurrent.atomic.AtomicInteger;

public class Bridge {
    private static final AtomicInteger i = new AtomicInteger(0);

    @SuppressLint("JavascriptInterface")
    @JavascriptInterface
    public void nativeCall(String msg) {
        Log.e(Constants.TAG, "message " + i.addAndGet(1) + ": " + msg);
    }
}
