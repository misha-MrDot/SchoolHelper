package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddScheduleInHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_schedule_in_home_page);
    }
    public void Homepage(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void addWidgetInDisplay(View view){
        Intent intent = new Intent(this, ErrorActivity.class);
        startActivity(intent);
    }
}