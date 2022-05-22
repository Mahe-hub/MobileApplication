package com.example.exrecise3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String counter;
    TextView number;
    int count = 3;

    public void show(View view) {
        counter= count+"";
        number = (TextView) findViewById(R.id.textView2);
        number.setText(counter);
    }

    public void decrease(View view) {
        count--;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




}