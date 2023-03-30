package com.stayfit.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class ComparsionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparsion);


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }
}

