package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //3detik ganti activity
    private int waktuLoad = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent login = new Intent(MainActivity.this,activity_second.class);
                finish();
                startActivity(login);
            }
        },waktuLoad);
    }

//    public void Pindah(View view) {
//        Intent intent = new Intent(MainActivity.this, activity_second.class);
//        startActivity(intent);
//    }
}