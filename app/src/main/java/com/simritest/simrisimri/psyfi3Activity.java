package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psyfi3Activity extends AppCompatActivity {

    private Button btn_home3;
    private Button btn_back3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psyfi3);

        btn_home3 = findViewById(R.id.btn_back2);
        btn_home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi3Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn_back3 = findViewById(R.id.btn_back3);
        btn_back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi3Activity.this, subActivity.class);
                startActivity(intent);
            }
        });

    }
}
