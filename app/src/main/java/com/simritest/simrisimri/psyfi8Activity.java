package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psyfi8Activity extends AppCompatActivity {

    private Button btn_back8;
    private Button btn_home8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psyfi8);

        btn_back8 = findViewById(R.id.btn_back8);
        btn_back8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi8Activity.this, subActivity.class);
                startActivity(intent);
            }
        });

        btn_home8 = findViewById(R.id.btn_home8);
        btn_home8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi8Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
