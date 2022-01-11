package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class tentang_aplikasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_aplikasi);
    }

    public void btnBack(View view) {
        Intent btnBack = new Intent(tentang_aplikasi.this,dashboard.class);
        startActivity(btnBack);
    }

    public void btnTwitter(View view) {
        Intent btnTwitter = new Intent();
        btnTwitter.setAction(Intent.ACTION_VIEW);
        btnTwitter.addCategory(Intent.CATEGORY_BROWSABLE);
        btnTwitter.setData(Uri.parse("https://twitter.com/"));
        startActivity(btnTwitter);
    }

    public void btnIg(View view) {
        Intent btnIg = new Intent();
        btnIg.setAction(Intent.ACTION_VIEW);
        btnIg.addCategory(Intent.CATEGORY_BROWSABLE);
        btnIg.setData(Uri.parse("https://www.instagram.com/fsnnq/"));
        startActivity(btnIg);
    }

    public void btnFb(View view) {
        Intent btnFb = new Intent();
        btnFb.setAction(Intent.ACTION_VIEW);
        btnFb.addCategory(Intent.CATEGORY_BROWSABLE);
        btnFb.setData(Uri.parse("https://www.facebook.com/inisenna/"));
        startActivity(btnFb);
    }
}