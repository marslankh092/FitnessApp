package com.stayfit.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class NotificationsActivity extends AppCompatActivity {



    ImageView notifications_back, notifications_details;
    RecyclerView show_notifications_recyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        notifications_back = findViewById(R.id.notifications_back);
        notifications_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(NotificationsActivity.this, CongratulationsActivity.class);
                startActivity(intent);


            }
        });

        show_notifications_recyclerview = findViewById(R.id.show_notifications_recyclerview);




        notifications_details = findViewById(R.id.notifications_details);
        notifications_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

    }
}






