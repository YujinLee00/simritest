package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subActivity extends AppCompatActivity {

    private Button psy_1;
    private Button psy_2;
    private Button psy_3;
    private Button psy_4;
    private Button psy_5;
    private Button psy_6;
    private Button psy_7;
    private Button psy_8;
    private Button psy_9;
    private Button psy_10;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        psy_1 = findViewById(R.id.psy_1);
        psy_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subActivity.this, psyActivity.class);
                startActivity(intent);
            }
        });

        psy_2 = findViewById(R.id.psy_2);
        psy_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subActivity.this, psy2Activity.class);
                startActivity(intent);
            }
        });

        psy_3 = findViewById(R.id.psy_3);
        psy_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subActivity.this, psy3Activity.class);
                startActivity(intent);
            }
        });

        psy_4 = findViewById(R.id.psy_4);
        psy_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subActivity.this, psy4Activity.class);
                startActivity(intent);
            }
        });

        psy_5 = findViewById(R.id.psy_5);
        psy_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subActivity.this, psy5Activity.class);
                startActivity(intent);
            }
        });

        psy_6 = findViewById(R.id.psy_6);
        psy_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subActivity.this, psy6Activity.class);
                startActivity(intent);
            }
        });

        psy_7 = findViewById(R.id.psy_7);
        psy_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subActivity.this, psy7Activity.class);
                startActivity(intent);
            }
        });

        psy_8 = findViewById(R.id.psy_8);
        psy_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subActivity.this, psy8Activity.class);
                startActivity(intent);
            }
        });

        psy_9 = findViewById(R.id.psy_9);
        psy_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subActivity.this, psy9Activity.class);
                startActivity(intent);
            }
        });

        psy_10 = findViewById(R.id.psy_10);
        psy_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subActivity.this, psy10Activity.class);
                startActivity(intent);
            }
        });
    }
}
