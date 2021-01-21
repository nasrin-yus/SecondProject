package com.example.secondproject;

import android.net.Uri;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //webView
        WebView web = findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);

        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://www.futureme.org/");

        //btndrawer
        DrawerLayout drawer=findViewById(R.id.Drawer);
        Button btnOpenDrawer=findViewById(R.id.btnOpenDrawer);
        btnOpenDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.openDrawer(GravityCompat.START);
            }
        });
        //video
        String url = "https://www.youtube.com/watch?v=PCbNLIdx-Pg";
        VideoView video = findViewById(R.id.video);
        video.setVideoURI(Uri.parse(url));
        video.setMediaController(new MediaController(MainActivity.this));
        video.start();
        //btnToast
        Button btnToast=findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome Friends", Toast.LENGTH_SHORT).show();
            }
        });

    }

}