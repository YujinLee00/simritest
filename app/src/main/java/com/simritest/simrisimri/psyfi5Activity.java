package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psyfi5Activity extends AppCompatActivity {

    private Button btn_back5;
    private Button btn_home5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psyfi5);

        btn_back5 = findViewById(R.id.btn_back5);
        btn_back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi5Activity.this, subActivity.class);
                startActivity(intent);
            }
        });

        btn_home5 = findViewById(R.id.btn_home5);
        btn_home5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi5Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
