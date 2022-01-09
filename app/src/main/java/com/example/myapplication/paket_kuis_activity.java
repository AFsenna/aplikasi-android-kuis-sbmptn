package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class paket_kuis_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_kuis);
    }

    public void btnBack(View view) {
        Intent btnBack = new Intent(paket_kuis_activity.this,dashboard.class);
        startActivity(btnBack);

    }
}