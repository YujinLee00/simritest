package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psyfi10Activity extends AppCompatActivity {

    private Button btn_back10;
    private Button btn_home10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psyfi10);

        btn_back10 = findViewById(R.id.btn_back10);
        btn_back10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi10Activity.this, subActivity.class);
                startActivity(intent);
            }
        });

        btn_home10 = findViewById(R.id.btn_home10);
        btn_home10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyfi10Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
