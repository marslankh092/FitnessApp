package com.stayfit.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.SeekBar;
import android.widget.TextView;

public class CompareResult1Activity extends AppCompatActivity {


    TextView photo_background, statistic_background;
    SeekBar progress_seekbar_1;
    RecyclerView front_facing_recyclerview, back_facing_recyclerview, left_facing_recyclerview, right_facing_recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_result1);


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        photo_background = findViewById(R.id.photo_background);
        statistic_background = findViewById(R.id.statistic_background);
        progress_seekbar_1 = findViewById(R.id.progress_seekbar_1);
        front_facing_recyclerview = findViewById(R.id.front_facing_recyclerview);
        back_facing_recyclerview = findViewById(R.id.back_facing_recyclerview);
        left_facing_recyclerview = findViewById(R.id.left_facing_recyclerview);
        right_facing_recyclerview = findViewById(R.id.right_facing_recyclerview);


        statistic_background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                photo_background.setBackgroundColor(getResources().getColor(R.color.backgroundColor));
                photo_background.setTextColor(getResources().getColor(R.color.textColor));

                statistic_background.setBackground(getResources().getDrawable(R.drawable.blue_linear_background));
                statistic_background.setTextColor(getResources().getColor(R.color.white));

            }
        });


        photo_background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                statistic_background.setBackgroundColor(getResources().getColor(R.color.backgroundColor));
                statistic_background.setTextColor(getResources().getColor(R.color.textColor));

                photo_background.setBackground(getResources().getDrawable(R.drawable.blue_linear_background));
                photo_background.setTextColor(getResources().getColor(R.color.white));

            }
        });

        progress_seekbar_1.setProgress(62);
    }
}

