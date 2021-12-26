package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Loginyuk(View view) {
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);

        String nama = username.getText().toString();
        String pass = password.getText().toString();

        Intent next = new Intent(login.this, dashboard.class);
        next.putExtra("username",nama);
        next.putExtra("password",pass);
        startActivity(next);
    }

    public void Daftaryuk(View view) {
        Intent register = new Intent(login.this, register.class);
        startActivity(register);
    }

    public void phone(View view) {
        String number = "082285132960";
        Intent telpon = new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",number,null));
        startActivity(telpon);
    }
}