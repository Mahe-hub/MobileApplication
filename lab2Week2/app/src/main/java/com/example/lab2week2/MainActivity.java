package com.example.lab2week2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void keyPressed(View view){

        // get the name & password from the edittext
        String name = String.valueOf(nameEditText.getText());
        String passwd = String.valueOf(passwdEditText.getText());

        // check the password
        if(  (passwd.length() >= 8) &&
                (passwd.matches("^.*[A-Za-z0-9].*")) &&
                (passwd.matches("^.*[@$!%*#?&+_-].*"))

          ){
            Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_LONG).show();
          intent= new Intent(MainActivity.this,Formpage.class);
          startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_LONG).show();
        }

    }


    // Define Variables
    ActionBar actionBar;
    EditText nameEditText,passwdEditText;
    Button btnLog;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // define title to the page
        actionBar = getSupportActionBar();
        actionBar.setTitle("Login Page");

        // create the instance
        nameEditText = (EditText) findViewById(R.id.nameEditText);
        passwdEditText= (EditText)  findViewById(R.id.passwdEditText);
        btnLog = (Button) findViewById(R.id.btnLogin);
    }
}