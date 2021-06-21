package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psyfi4Activity extends AppCompatActivity {

    private Button btn_back4;
    private Button btn_home4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psyfi4);

        btn_back4 = findViewById(R.id.btn_back5);
        btn_back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi4Activity.this, subActivity.class);
                startActivity(intent);
            }
        });

        btn_home4 = findViewById(R.id.btn_home5);
        btn_home4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi4Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
