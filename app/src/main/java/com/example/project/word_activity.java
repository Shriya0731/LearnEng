package com.example.project;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class word_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        WebView browser = (WebView) findViewById(R.id.webview);
        browser.loadUrl("https://www.merriam-webster.com/word-of-the-day");

    }
}