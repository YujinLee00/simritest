package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psy10Activity extends AppCompatActivity {

    private Button psy_fi10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psy10);

        psy_fi10 = findViewById(R.id.psy_fi10);
        psy_fi10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psy10Activity.this, psyfi10Activity.class);
                startActivity(intent);
            }
        });

    }
}
