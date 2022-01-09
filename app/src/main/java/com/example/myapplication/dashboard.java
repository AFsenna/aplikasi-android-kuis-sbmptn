package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Intent intent = getIntent();

    }

    public void kuis_saintek(View view) {
        Intent saintek = new Intent(dashboard.this, paket_kuis_activity.class);
        startActivity(saintek);
    }

    public void kuis_soshum(View view) {
        Intent soshum = new Intent(dashboard.this, paket_kuis_activity.class);
        startActivity(soshum);
    }

    public void hasil_kuis(View view) {
        Intent hasil = new Intent(dashboard.this, login.class);
        startActivity(hasil);
    }

    public void btnInfo(View view) {
        Intent login = new Intent(dashboard.this, login.class);
        startActivity(login);
    }

    public void btnHome(View view) {
        Intent login = new Intent(dashboard.this, login.class);
        startActivity(login);
    }

    public void btnUser(View view) {
        Intent login = new Intent(dashboard.this, login.class);
        startActivity(login);
    }
}