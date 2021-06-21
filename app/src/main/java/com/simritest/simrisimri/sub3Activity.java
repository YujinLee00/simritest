package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sub3Activity extends AppCompatActivity {

    private Button love_1;
    private Button love_2;
    private Button love_3;
    private Button love_4;
    private Button love_5;
    private Button love_6;
    private Button love_7;
    private Button love_8;
    private Button love_9;
    private Button love_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);

        love_1 = findViewById(R.id.love_1);
        love_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub3Activity.this, loveActivity.class);
                startActivity(intent);
            }
        });

        love_2 = findViewById(R.id.love_2);
        love_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub3Activity.this, love2Activity.class);
                startActivity(intent);
            }
        });

        love_3 = findViewById(R.id.love_3);
        love_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub3Activity.this, love3Activity.class);
                startActivity(intent);
            }
        });

        love_4 = findViewById(R.id.love_4);
        love_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub3Activity.this, love4Activity.class);
                startActivity(intent);
            }
        });

        love_5 = findViewById(R.id.love_5);
        love_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub3Activity.this, love5Activity.class);
                startActivity(intent);
            }
        });

        love_6 = findViewById(R.id.love_6);
        love_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub3Activity.this, love6Activity.class);
                startActivity(intent);
            }
        });

        love_7 = findViewById(R.id.love_7);
        love_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub3Activity.this, love7Activity.class);
                startActivity(intent);
            }
            });
        love_8 = findViewById(R.id.love_8);
        love_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub3Activity.this, love8Activity.class);
                startActivity(intent);
            }
        });

        love_9 = findViewById(R.id.love_9);
        love_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub3Activity.this, love9Activity.class);
                startActivity(intent);
            }
        });

        love_10 = findViewById(R.id.love_10);
        love_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub3Activity.this, love10Activity.class);
                startActivity(intent);
            }
        });
    }

}
