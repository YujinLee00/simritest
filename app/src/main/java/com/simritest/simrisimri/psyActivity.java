package com.simritest.simrisimri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class psyActivity extends AppCompatActivity {

    private Button psy_fi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psy);

        psy_fi = findViewById(R.id.psy_fi);
        psy_fi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(psyActivity.this, psyfiActivity.class);
                startActivity(intent);
            }
        });

    }
}
