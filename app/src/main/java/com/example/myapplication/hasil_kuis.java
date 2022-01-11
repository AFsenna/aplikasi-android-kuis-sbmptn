package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hasil_kuis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis);
    }

    public void btnBack(View view) {
        Intent btnBack = new Intent(hasil_kuis.this,dashboard.class);
        startActivity(btnBack);
    }
}