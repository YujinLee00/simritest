package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psy5Activity extends AppCompatActivity {

    private Button psy_fi5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psy5);

        psy_fi5 = findViewById(R.id.psy_fi5);
        psy_fi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psy5Activity.this, psyfi5Activity.class);
                startActivity(intent);
            }
        });

    }
}
