package com.example.duanmau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ThongKeAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_ke);
        getSupportActionBar().setTitle("Doanh thu");
    }
}