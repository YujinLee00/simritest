package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psyfi2Activity extends AppCompatActivity {

    private Button btn_back2;
    private Button btn_home2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psyfi2);

        btn_back2 = findViewById(R.id.btn_back2);
        btn_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi2Activity.this, subActivity.class);
                startActivity(intent);
            }
        });

        btn_home2 = findViewById(R.id.btn_home2);
        btn_home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
