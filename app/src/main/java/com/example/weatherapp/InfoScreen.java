package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

public class InfoScreen extends AppCompatActivity {
    private HorizontalScrollView horizontalScrollView;
    private ImageView btnPrevious, btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_screen);
        getSupportActionBar().hide();
        HorizontalScrollView horizontalScrollView;
        horizontalScrollView = findViewById(R.id.horizontalScroll);
        btnPrevious = findViewById(R.id.btnPrevious);
        btnNext = findViewById(R.id.btnNext);

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                horizontalScrollView.arrowScroll(View.FOCUS_LEFT);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                horizontalScrollView.arrowScroll(View.FOCUS_RIGHT);
            }
        });
    }
}