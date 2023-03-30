package com.stayfit.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {


    ImageView profile_back, profile_details;
    CircleImageView user_image;
    TextView user_name, user_fat_loose_type, user_height, user_weight, user_age;


    Button user_profile_edit_buttons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        user_image = findViewById(R.id.user_image);
        user_name = findViewById(R.id.user_name);
        profile_details = findViewById(R.id.profile_details);
        profile_back = findViewById(R.id.profile_back);
        user_fat_loose_type = findViewById(R.id.user_fat_loose_type);
        user_profile_edit_buttons = findViewById(R.id.user_profile_edit_buttons);
        user_height = findViewById(R.id.user_height);
        user_weight = findViewById(R.id.user_weight);






        user_age = findViewById(R.id.user_age);

        profile_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        profile_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }
}

