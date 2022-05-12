package com.example.lab2week2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Formpage extends AppCompatActivity {



    ActionBar actionBar;
    Intent getIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_page);

        //define title
        actionBar= getSupportActionBar();
        actionBar.setTitle("Registration Form ");
        getIntent= getIntent();
    }
}
