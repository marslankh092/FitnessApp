package com.stayfit.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class TakeAPhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_aphoto);


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }
}

