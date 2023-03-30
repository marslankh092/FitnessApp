package com.stayfit.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.SeekBar;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class CompareResult2Activity extends AppCompatActivity {

    TextView photo_background_1, statistic_background_1;
    SeekBar weight_seekbar, height_seekbar, mass_seekbar, abs_seekbar;
    XAxis xAxis;
    YAxis yAxis;
    LineChart progress_chart;
    LineData lineData;
    LineDataSet lineDataSet;
    ArrayList lineEntries;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_result2);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        photo_background_1 = findViewById(R.id.photo_background_1);
        statistic_background_1 = findViewById(R.id.statistic_background_1);
        weight_seekbar = findViewById(R.id.weight_seekbar);
        height_seekbar = findViewById(R.id.height_seekbar);
        mass_seekbar = findViewById(R.id.mass_seekbar);
        abs_seekbar = findViewById(R.id.abs_seekbar);
        progress_chart = findViewById(R.id.progress_chart);

        progress_chart.setBackgroundColor(Color.WHITE);
        progress_chart.getDescription().setEnabled(false);
        progress_chart.setDrawGridBackground(false);
        progress_chart.setPinchZoom(false);

        xAxis = progress_chart.getXAxis();
        XAxis.XAxisPosition position = XAxis.XAxisPosition.BOTTOM;
        xAxis.setPosition(position);
        yAxis = progress_chart.getAxisRight();
        progress_chart.getAxisRight().setEnabled(true);
        yAxis.setAxisMinimum(0);
        yAxis.setAxisMaximum(100);

        lineDataSet = new LineDataSet(lineEntries, "");
        lineData = new LineData(lineDataSet);
        progress_chart.setData(lineData);

        statistic_background_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                photo_background_1.setBackgroundColor(getResources().getColor(R.color.backgroundColor));
                photo_background_1.setTextColor(getResources().getColor(R.color.textColor));

                statistic_background_1.setBackground(getResources().getDrawable(R.drawable.blue_linear_background));
                statistic_background_1.setTextColor(getResources().getColor(R.color.white));

            }
        });

        photo_background_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                statistic_background_1.setBackgroundColor(getResources().getColor(R.color.backgroundColor));
                statistic_background_1.setTextColor(getResources().getColor(R.color.textColor));

                photo_background_1.setBackground(getResources().getDrawable(R.drawable.blue_linear_background));
                photo_background_1.setTextColor(getResources().getColor(R.color.white));

            }
        });

        weight_seekbar.setProgress(33);
        height_seekbar.setProgress(88);
        mass_seekbar.setProgress(57);
        abs_seekbar.setProgress(89);

    }


}










