package com.example.fibo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class volunteer_signup extends AppCompatActivity {
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_signup);
        getSupportActionBar().hide();
        signup= findViewById(R.id.buttonSignUp);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(volunteer_signup.this, "Data Inserted Successfully!!", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(volunteer_signup.this, volunteer_login.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent= new Intent(volunteer_signup.this, volunteer_login.class);
        startActivity(intent);
        finish();
    }
}