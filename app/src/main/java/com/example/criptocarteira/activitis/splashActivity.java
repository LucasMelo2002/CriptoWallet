package com.example.criptocarteira.activitis;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.criptocarteira.R;

public class splashActivity extends AppCompatActivity {

    Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashActivity.this,IntroActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }
}