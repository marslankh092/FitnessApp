package com.stayfit.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.SeekBar;

import com.airbnb.lottie.parser.ColorParser;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GridLabelRenderer;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.razerdp.widget.animatedpieview.AnimatedPieView;
import com.razerdp.widget.animatedpieview.AnimatedPieViewConfig;
import com.razerdp.widget.animatedpieview.data.SimplePieInfo;

import java.util.ArrayList;

public class HomescreenActivity extends AppCompatActivity {


    AnimatedPieView home_pie_chart_1;
    SeekBar progress_seekbar_3;
    XAxis xAxis;
    YAxis yAxis;
    LineChart progress_chart_1;
    LineData lineData;
    LineDataSet lineDataSet;
    ArrayList lineEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);



        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        home_pie_chart_1 = findViewById(R.id.home_pie_chart_1);
        progress_seekbar_3 = findViewById(R.id.progress_seekbar_3);

        progress_chart_1 = findViewById(R.id.progress_chart_1);

        AnimatedPieViewConfig pieViewConfig = new AnimatedPieViewConfig();
        pieViewConfig.addData(new SimplePieInfo(1300, Color.parseColor("#ce91eb"), "20,1"));
        pieViewConfig.addData(new SimplePieInfo(2500, Color.parseColor("#ffffff"), ""));
        pieViewConfig.addData(new SimplePieInfo(2500, Color.parseColor("#ffffff"), ""));
        pieViewConfig.addData(new SimplePieInfo(2500, Color.parseColor("#ffffff"), ""));
        pieViewConfig.duration(100);

        home_pie_chart_1.applyConfig(pieViewConfig);
        home_pie_chart_1.start();




        GraphView graph = (GraphView) findViewById(R.id.graph);
        int[] Data= {10,66,73,98,73,67,78,82,
                90,99,105,110,126,137,143,
                148,153,162,165,166,164,161,147,136};



        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>();
        for (int i=0;i<Data.length;i++) {
            series.appendData(new DataPoint(i,Data[i]),true,Data.length);
        }

        series.setColor(getResources().getColor(R.color.color1));
        series.setDrawDataPoints(false);
        graph.addSeries(series);


        graph.getViewport().setScalable(true);
        graph.getViewport().setScrollable(true);
        graph.getViewport().setScalableY(true);
        graph.getViewport().setScrollableY(true);
        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graph.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graph.getGridLabelRenderer().setGridStyle( GridLabelRenderer.GridStyle.NONE );

        series.setDrawBackground(false);
        series.setDrawBackground(true);

        progress_seekbar_3.setProgress(67);

        progress_chart_1.setBackgroundColor(Color.WHITE);
        progress_chart_1.getDescription().setEnabled(false);
        progress_chart_1.setDrawGridBackground(false);
        progress_chart_1.setPinchZoom(false);

        xAxis = progress_chart_1.getXAxis();
        XAxis.XAxisPosition position = XAxis.XAxisPosition.BOTTOM;
        xAxis.setPosition(position);
        yAxis = progress_chart_1.getAxisRight();
        progress_chart_1.getAxisRight().setEnabled(true);
        yAxis.setAxisMinimum(0);
        yAxis.setAxisMaximum(100);

        lineDataSet = new LineDataSet(lineEntries, "");
        lineData = new LineData(lineDataSet);
        progress_chart_1.setData(lineData);

    }
}

