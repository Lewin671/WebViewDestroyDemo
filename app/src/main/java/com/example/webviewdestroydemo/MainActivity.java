package com.example.webviewdestroydemo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import java.nio.charset.Charset;

import kotlin.text.Charsets;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView.setWebContentsDebuggingEnabled(false);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new Bridge(), "__bridge__");
        webView.setWebViewClient(new WebViewClient() {

        });
        webView.loadDataWithBaseURL(null, Constants.HTML, "text/html", Charsets.UTF_8.displayName(), null);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(() -> {
            Log.e(Constants.TAG, "before destroying webview");
            webView.destroy();
            Log.e(Constants.TAG, "after destroying webview");
        }, 3000);
        setContentView(webView);
    }
}