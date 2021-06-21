package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class test2Activity extends AppCompatActivity {

    private Button btn_hs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        btn_hs = findViewById(R.id.btn_hs);
        btn_hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(test2Activity.this, testfi2Activity.class);
                startActivity(intent);
            }
        });

    }
}
