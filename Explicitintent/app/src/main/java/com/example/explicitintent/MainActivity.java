package com.example.explicitintent;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set the title bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("First Activity");

        // define vairables represent the fileds
        final EditText nameETx= (EditText) findViewById(R.id.nameEt);
        final EditText emailETx= (EditText) findViewById(R.id.emailEt);
        final EditText phoneRTx = (EditText) findViewById(R.id.phonenumberET);

        //button
        Button button = (Button) findViewById(R.id.saveBTN);

        // create listner to button
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                // take the values from filed vairables
                String namev = nameETx.getText().toString();
                String emailv= emailETx.getText().toString();
                String phonev= phoneRTx.getText().toString();

                // defint intent to put the strings values into second page
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("NAME",namev);
                intent.putExtra("Email",emailv);
                intent.putExtra("Phone",phonev);

                startActivity(intent);

            }
        });

    }
}