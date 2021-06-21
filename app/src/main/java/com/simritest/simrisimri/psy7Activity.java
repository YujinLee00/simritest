package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psy7Activity extends AppCompatActivity {

    private Button psy_fi7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psy7);

        psy_fi7 = findViewById(R.id.psy_fi7);
        psy_fi7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psy7Activity.this, psyfi7Activity.class);
                startActivity(intent);
            }
        });

    }
}
