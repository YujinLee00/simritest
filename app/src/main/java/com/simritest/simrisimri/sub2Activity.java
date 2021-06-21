package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sub2Activity extends AppCompatActivity {

    private Button test_1;
    private Button test_2;
    private Button test_3;
    private Button test_4;
    private Button test_5;
    private Button test_6;
    private Button test_7;
    private Button test_8;
    private Button test_9;
    private Button test_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        test_1 = findViewById(R.id.test_1);
        test_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub2Activity.this, testActivity.class);
                startActivity(intent);
            }
        });

        test_2 = findViewById(R.id.test_2);
        test_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub2Activity.this, test2Activity.class);
                startActivity(intent);
            }
        });

        test_3 = findViewById(R.id.test_3);
        test_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub2Activity.this, test3Activity.class);
                startActivity(intent);
            }
        });

        test_4 = findViewById(R.id.test_4);
        test_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub2Activity.this, test4Activity.class);
                startActivity(intent);
            }
        });

        test_5 = findViewById(R.id.test_5);
        test_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub2Activity.this, test5Activity.class);
                startActivity(intent);
            }
        });

        test_6 = findViewById(R.id.test_6);
        test_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub2Activity.this, test6Activity.class);
                startActivity(intent);
            }
        });

        test_7 = findViewById(R.id.test_7);
        test_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub2Activity.this, test7Activity.class);
                startActivity(intent);
            }
        });

        test_8 = findViewById(R.id.test_8);
        test_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub2Activity.this, test8Activity.class);
                startActivity(intent);
            }
        });

        test_9 = findViewById(R.id.test_9);
        test_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub2Activity.this, test9Activity.class);
                startActivity(intent);
            }
        });

        test_10 = findViewById(R.id.test_10);
        test_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sub2Activity.this, test10Activity.class);
                startActivity(intent);
            }
        });

    }
}
