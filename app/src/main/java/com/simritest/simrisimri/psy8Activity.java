package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psy8Activity extends AppCompatActivity {

    private Button psy_fi8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psy8);

        psy_fi8 = findViewById(R.id.psy_fi8);
        psy_fi8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psy8Activity.this, psyfi8Activity.class);
                startActivity(intent);
            }
        });

    }
}
