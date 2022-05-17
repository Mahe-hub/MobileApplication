package com.example.midtermq1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.*;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    //define variables
    TextView numTextView;
    Button toastBtn,countBtn,randomBtn;
    int number;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define instances
        numTextView = (TextView) findViewById(R.id.number);
        toastBtn = (Button) findViewById(R.id.toast);
        countBtn =(Button) findViewById(R.id.count);
        randomBtn =(Button) findViewById(R.id.random);
        Random rand;
        rand = new Random();
        number = rand.nextInt(16);
    }

    // define methods
    public void toastNum(View view){
        numTextView.setText(String.valueOf(number));
    }

    public void countNum(View view){
        number++;
    }

    public void RandomNum(View view){
        Intent inputIntent = new Intent(MainActivity.this,MainActivity2.class);
        inputIntent.putExtra("NUMBER",String.valueOf(number));
        startActivity(inputIntent);
    }


}