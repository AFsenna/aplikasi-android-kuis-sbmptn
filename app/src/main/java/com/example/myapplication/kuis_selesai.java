package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kuis_selesai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_selesai);
    }

    public void btnBack(View view) {
        Intent btnBack = new Intent(kuis_selesai.this,dashboard.class);
        startActivity(btnBack);
    }
}