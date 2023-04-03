package com.example.fibo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class volunteer_profile extends AppCompatActivity {
    ImageView home, stories, connect, settings, edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_profile);
        getSupportActionBar().hide();
        home= findViewById(R.id.imageView32);
        stories= findViewById(R.id.imageView33);
        connect= findViewById(R.id.imageView34);
        settings= findViewById(R.id.imageView35);
        edit= findViewById(R.id.imageView14);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(volunteer_profile.this, volunteer_homepage.class);
                startActivity(intent);
                finish();
            }
        });
        stories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(volunteer_profile.this, volunteer_stories.class);
                startActivity(intent);
                finish();
            }
        });
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(volunteer_profile.this, volunteer_connect.class);
                startActivity(intent);
                finish();
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(volunteer_profile.this, volunteer_settings.class);
                startActivity(intent);
                finish();
            }
        });
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(volunteer_profile.this, volunteer_editprofile.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent= new Intent(this, volunteer_login.class);
        startActivity(intent);
        finish();
    }
}