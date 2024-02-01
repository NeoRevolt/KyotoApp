package com.example.KyotoApp.InfoApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.KyotoApp.R;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        setTitle("Tentang App Ini");
    }
}