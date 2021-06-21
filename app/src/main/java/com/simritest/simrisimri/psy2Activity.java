package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psy2Activity extends AppCompatActivity {

    private Button psy_fi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psy2);

        psy_fi2 = findViewById(R.id.psy_fi2);
        psy_fi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psy2Activity.this, psyfi2Activity.class);
                startActivity(intent);
            }
        });
    }
}
