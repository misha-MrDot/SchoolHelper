package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlarmClock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_clock);
    }

    public void addNewTime(View v){
        Intent intent = new Intent(this, AddNewTime.class);
        startActivity(intent);
    }
    public void toEdit(View v){
        Intent intent = new Intent(this, EditTimePage.class);
        startActivity(intent);
    }
}