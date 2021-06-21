package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psy9Activity extends AppCompatActivity {

    private Button psy_fi9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psy9);

        psy_fi9 = findViewById(R.id.psy_fi9);
        psy_fi9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(psy9Activity.this, psyfi9Activity.class);
                startActivity(intent);

            }
        });
    }
}
