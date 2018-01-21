package com.example.zeiss.zeissapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;


public class Main2Activity extends AppCompatActivity {

    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);

        //String data = getIntent().getExtras().getString("key");
//        db.insertTemp(regId);

        webview = findViewById(R.id.webview);

        webview.loadUrl("http://simranfarheen.com/raspberrypi.html");
        webview.getSettings().setBuiltInZoomControls(true);
      /*Cursor r= db.getData(1);
       TextView display=(TextView)findViewById(R.id.showData);
       String show= r.getString(r.getColumnIndex(DatabaseHandler.TEMP_READINGS_VALUE));
       display.setText(show);
   */

    }

    public void down(View view){
        webview.scrollTo(webview.getScrollX(), webview.getScrollY()+30);
    }

    public void up(View view){
        webview.scrollTo(webview.getScrollX(), webview.getScrollY()-30);
    }

    public void left(View view){
        webview.scrollTo(webview.getScrollX()-30, webview.getScrollY());
    }

    public void right(View view){
        webview.scrollTo(webview.getScrollX()+30, webview.getScrollY());
    }
}
