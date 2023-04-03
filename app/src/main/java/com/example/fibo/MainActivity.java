package com.example.fibo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button volunteer, organization;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        volunteer=findViewById(R.id.volunteer);
        organization=findViewById(R.id.organization);
        volunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, volunteer_login.class);
                startActivity(intent);
            }
        });
        organization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent= new Intent(MainActivity.this, volunteer_login.class);
//                startActivity(intent);
//                finish();
                Toast.makeText(MainActivity.this, "Coming soon!", Toast.LENGTH_SHORT).show();
            }
        });



    }
}