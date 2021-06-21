package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psyfi9Activity extends AppCompatActivity {

    private Button btn_back9;
    private Button btn_home9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psyfi9);

        btn_back9 = findViewById(R.id.btn_back9);
        btn_back9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi9Activity.this, subActivity.class);
                startActivity(intent);
            }
        });

        btn_home9  = findViewById(R.id.btn_home9);
        btn_home9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi9Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
