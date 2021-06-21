package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class testfi9Activity extends AppCompatActivity {

    private Button btn_list;
    private Button bk_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testfi9);

        btn_list = findViewById(R.id.btn_list);
        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(testfi9Activity.this, sub2Activity.class);
                startActivity(intent);
            }
        });

        bk_home = findViewById(R.id.bk_home);
        bk_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(testfi9Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
