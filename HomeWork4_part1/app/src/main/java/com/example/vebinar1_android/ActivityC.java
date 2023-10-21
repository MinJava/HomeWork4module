package com.example.vebinar1_android;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityC extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Button btActAfromC = findViewById(R.id.opActivityA_fromC);

        btActAfromC.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityC.this, ActivityA.class);
            startActivity(intent);
        });

        Button btActDfromC = findViewById(R.id.opActivityD_fromC);

        btActDfromC.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityC.this, ActivityD.class);
            finishAffinity();
            startActivity(intent);
        });

        Button btclActC = findViewById(R.id.clActivityC);

        btclActC.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityC.this, ActivityB.class);
            startActivity(intent);
        });

        Button btclstack = findViewById(R.id.close_stack);

        btclstack.setOnClickListener(view -> finishAffinity());
    }
}

