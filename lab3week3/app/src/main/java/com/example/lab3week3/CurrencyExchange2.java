package com.example.lab3week3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class CurrencyExchange2 extends AppCompatActivity {


    //define Variable
    EditText editText, curEditText, outputEditText;
    ActionBar actionBar;
    Intent curIntent;
//    Intent ToastIntent;
    String userName;


    // execute the convertCur method
    public void convertCur(View view) {

        Double usDollar = Double.parseDouble(String.valueOf(curEditText.getText()));
        Double candianDollar = usDollar * 1.26;
        outputEditText.setText(String.valueOf(candianDollar));

    }

    // to go to the Toast application page
    public void forward(View view) {
        Intent ToastIntent = new Intent(this, ToastActivity2.class);
        ToastIntent.putExtra("NAME", userName);
        startActivity(ToastIntent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_exchange2);

        //define title
        actionBar = getSupportActionBar();
        actionBar.setTitle("Welcome to Currency Exchange Page ");
        //get user name from login page
        curIntent = getIntent();
        userName = curIntent.getStringExtra("NAME");

        // show the user name
        editText = (EditText) findViewById(R.id.usernameEDT);
        editText.setText("Hello " + userName);

        //define instances
        curEditText = (EditText) findViewById(R.id.currencyInput);
        outputEditText = (EditText) findViewById(R.id.candiancurrencyInput);
    }
}


   