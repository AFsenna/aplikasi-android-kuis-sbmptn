package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class activity_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void Loginyuk(View view) {
    }

    public void Daftaryuk(View view) {
        Intent register = new Intent(activity_second.this, register.class);
        startActivity(register);
    }

    public void phone(View view) {
        String number = "082285132960";
        Intent telpon = new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",number,null));
        startActivity(telpon);
    }
}