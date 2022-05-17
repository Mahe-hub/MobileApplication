package com.example.midtermq1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    //define variables
    TextView output;
    Button previousBtn;
    Intent outputIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //define instances
        output = (TextView) findViewById(R.id.output);
        previousBtn =(Button) findViewById(R.id.previous);
        //Show the random value
        outputIntent = getIntent();
        String numValue = outputIntent.getStringExtra("NUMBER");
        output.setText(numValue);



    }

    //add method
    public void previous(View view){
        Intent previousIntent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(previousIntent);
    }

}