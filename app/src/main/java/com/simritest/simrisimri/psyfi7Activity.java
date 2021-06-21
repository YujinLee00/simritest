package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psyfi7Activity extends AppCompatActivity {

    private Button btn_back7;
    private Button btn_home7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psyfi7);

        btn_back7 = findViewById(R.id.btn_back7);
        btn_back7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi7Activity.this, subActivity.class);
                startActivity(intent);
            }
        });

        btn_home7 = findViewById(R.id.btn_home7);
        btn_home7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi7Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
