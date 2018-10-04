package com.example.garettpascual_folster.jchsmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DONT TOUCH ANY OF THIS //

        WebView webViewer = (WebView)findViewById(R.id.webViewer);
        webViewer.getSettings().setJavaScriptEnabled(true);
        webViewer.setWebChromeClient(new WebChromeClient());
        webViewer.loadUrl("file:///android_asset/www/index.html");
    }
}
