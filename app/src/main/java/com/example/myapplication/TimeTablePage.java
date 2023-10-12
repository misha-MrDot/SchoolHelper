package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TimeTablePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table_page);
    }

    public void Homepage(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void addWidgetInDisplay(View view){
        Intent intent = new Intent(this, ErrorActivity.class);
        startActivity(intent);
    }

    public void addNewTimeTablePage(View v){
        Intent intent = new Intent(this, AddNewTimeTablePage.class);
        startActivity(intent);
    }
}