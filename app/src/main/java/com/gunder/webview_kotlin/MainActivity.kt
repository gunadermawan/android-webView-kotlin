package com.gunder.webview_kotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private var webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        membuat full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        webView = findViewById(R.id.wV1)
        webView!!.webViewClient = WebViewClient()
        webView!!.loadUrl("https://www.kai.id/")
        var webSettings = webView!!.settings
        webSettings.javaScriptEnabled = true
//        untuk mengaktifkan fitur dri bs yang belom muncul
        webSettings.domStorageEnabled = true
    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()){
            webView!!.goBack()
        } else{
            super.onBackPressed()
        }
    }
}
