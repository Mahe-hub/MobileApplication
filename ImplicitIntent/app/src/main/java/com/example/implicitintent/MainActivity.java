package com.example.implicitintent;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void buttonPressed(View view){
        // define object from intent class to go to the link
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}