package com.example.firstappatluminar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread obj = new Thread(){
            @Override
            public void run() {
                try{


                    sleep(2000);
                }catch (Exception e){

                }
                Intent intent  = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }

        };
        obj.start();
    }

}