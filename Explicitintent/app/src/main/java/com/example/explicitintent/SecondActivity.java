package com.example.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // set title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Second Activity ");

        // to get the value
        Intent intent = getIntent();

        // define vairable to save the values from the first page
        String nameG = intent.getStringExtra("NAME");
        String emailG = intent.getStringExtra("Email");
        String phoneG = intent.getStringExtra("Phone");

        EditText resultT = (EditText) findViewById(R.id.resultEt);
        resultT.setText("Name="+nameG+"\nEmail="+emailG+"\nPhone="+phoneG);
    }
}

