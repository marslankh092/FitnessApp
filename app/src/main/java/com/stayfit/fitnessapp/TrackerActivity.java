package com.stayfit.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.SeekBar;

public class TrackerActivity extends AppCompatActivity {

    SeekBar tracker_seekbar_1, tracker_seekbar_2, tracker_seekbar_3, tracker_seekbar_4, tracker_seekbar_5, tracker_seekbar_6, tracker_seekbar_7;
    RecyclerView latest_activity_recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        tracker_seekbar_1 = findViewById(R.id.tracker_seekbar_1);
        tracker_seekbar_2 = findViewById(R.id.tracker_seekbar_2);
        tracker_seekbar_3 = findViewById(R.id.tracker_seekbar_3);
        tracker_seekbar_4 = findViewById(R.id.tracker_seekbar_4);
        tracker_seekbar_5 = findViewById(R.id.tracker_seekbar_5);
        tracker_seekbar_6 = findViewById(R.id.tracker_seekbar_6);
        tracker_seekbar_7 = findViewById(R.id.tracker_seekbar_7);
        latest_activity_recyclerview = findViewById(R.id.latest_activity_recyclerview);;

        tracker_seekbar_1.setProgress(25);
        tracker_seekbar_2.setProgress(43);
        tracker_seekbar_3.setProgress(13);
        tracker_seekbar_4.setProgress(61);
        tracker_seekbar_5.setProgress(89);
        tracker_seekbar_6.setProgress(73);
        tracker_seekbar_7.setProgress(94);

    }
}


