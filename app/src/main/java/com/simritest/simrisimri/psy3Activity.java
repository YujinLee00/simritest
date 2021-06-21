package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psy3Activity extends AppCompatActivity {

    private Button psy_fi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psy3);

        psy_fi3 = findViewById(R.id.psy_fi3);
        psy_fi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psy3Activity.this, psyfi3Activity.class);
                startActivity(intent);
            }
        });

    }
}
