package com.example.firstappatluminar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    Handler handler;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash);

        imageView = findViewById(R.id.imageView);
        Animation rotate = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.rotate);
        imageView.startAnimation(rotate);

//        Thread obj = new Thread(){
//            @Override
//            public void run() {
//                try{
//
//
//                    sleep(3000);
//                }catch (Exception e){
//
//                }
//                Intent intent  = new Intent(SplashActivity.this,MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//
//        };
//        obj.start();

        handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent  = new Intent(SplashActivity.this, LogIn.class);
               startActivity(intent);
                finish();
            }
        },3000);
    }

}