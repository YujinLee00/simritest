package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lovefi2Activity extends AppCompatActivity {

    private Button btn_daum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lovefi2);

        btn_daum = findViewById(R.id.btn_daum);
        btn_daum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lovefi2Activity.this, love_fi2Activity.class);
                startActivity(intent);
            }
        });
    }
}
