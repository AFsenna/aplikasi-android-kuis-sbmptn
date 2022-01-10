package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kuis_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
    }

    public void btnSubmit(View view) {
        Intent btnSubmit = new Intent(kuis_activity.this, kuis_selesai.class);
        startActivity(btnSubmit);
    }
}