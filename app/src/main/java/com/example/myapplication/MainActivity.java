package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addNewSchedule(View v){
        Intent intent = new Intent(this, AddScheduleInHomePage.class);
        startActivity(intent);
    }

    public void startNewActivity(View v){
        Intent intent = new Intent(this,TimeTablePage.class);
        startActivity(intent);
    }

    public void alarmClock(View v){
        Intent intent = new Intent(this, AlarmClock.class);
        startActivity(intent);
    }

    public void tools(View v){
        Intent intent = new Intent(this, Tools.class);
        startActivity(intent);
    }
}