package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psyfi6Activity extends AppCompatActivity {

    private Button btn_back6;
    private Button btn_home6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psyfi6);

        btn_back6 = findViewById(R.id.btn_back6);
        btn_back6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi6Activity.this, subActivity.class);
                startActivity(intent);
            }
        });

        btn_home6 = findViewById(R.id.btn_home6);
        btn_home6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi6Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
