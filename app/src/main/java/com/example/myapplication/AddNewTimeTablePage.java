package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddNewTimeTablePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_time_table_page);
    }
    public void HomepageTimeTable(View v){
        Intent intent = new Intent(this, TimeTablePage.class);
        startActivity(intent);
    }
}