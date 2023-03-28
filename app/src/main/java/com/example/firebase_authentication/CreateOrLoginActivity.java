package com.example.firebase_authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class CreateOrLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_or_login);
    }
    public void LogIn (View view) {
        Intent intent = new Intent(CreateOrLoginActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void SignUp (View view) {
        Intent intent = new Intent(CreateOrLoginActivity.this, CreateActivity.class);
        startActivity(intent);
    }
}