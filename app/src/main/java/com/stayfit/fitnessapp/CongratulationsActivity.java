package com.stayfit.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class CongratulationsActivity extends AppCompatActivity {

    Button congratulations_back_buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulations);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);



        congratulations_back_buttons = findViewById(R.id.congratulations_back_buttons);


        congratulations_back_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CongratulationsActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}

