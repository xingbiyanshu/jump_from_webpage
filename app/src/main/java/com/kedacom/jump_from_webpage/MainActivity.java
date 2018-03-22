package com.kedacom.jump_from_webpage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 接收来自网页的数据　
        Intent intent = getIntent();
//        intent.getScheme();
//        intent.getDataString();
        Uri uri = intent.getData();
        if (null != uri){
            System.out.println("article="+uri.getQueryParameter("article"));
        }
    }
}
