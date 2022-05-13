package com.example.lab3week3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ToastActivity2 extends AppCompatActivity {

//    //define variables
    String userName;
    TextView numEdt,usernameText;
    ActionBar actionBar;
    int number =3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast2);
        //define instances
        numEdt = (TextView) findViewById(R.id.numberET);
        usernameText = (TextView) findViewById(R.id.usernameTxt);
        Button calculatorBTn = (Button) findViewById(R.id.calculatorBtn);
        // Set Title
        actionBar = getSupportActionBar();
        actionBar.setTitle("Toast page");

        Intent  userIntent = getIntent();
        userName = userIntent.getStringExtra("NAME");
        usernameText.setText(String.valueOf(userName));
    }

    public void toastNum(View view){
        numEdt.setText(String.valueOf(number));
    }

    public void incrementNum(View view){
        number ++;
        numEdt.setText(String.valueOf(number));
    }

    public void decrementNum(View view){
        number --;
        numEdt.setText(String.valueOf(number));
    }


    public void openCalculator(View view) {
        Intent intent = new Intent(ToastActivity2.this,CalculatorActivity.class);
        startActivity(intent);
    }
}
