package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psy6Activity extends AppCompatActivity {

    private Button psy_fi6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psy6);

        psy_fi6 = findViewById(R.id.psy_fi6);
        psy_fi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psy6Activity.this, psyfi6Activity.class);
                startActivity(intent);
            }
        });

    }
}
