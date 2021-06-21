package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psy4Activity extends AppCompatActivity {

    private Button psy_fi4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psy4);

        psy_fi4 = findViewById(R.id.psy_fi4);
        psy_fi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psy4Activity.this, psyfi4Activity.class);
                startActivity(intent);
            }
        });

    }
}
