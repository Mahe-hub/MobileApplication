package com.example.lab3week3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void changePage(View view){
        name = String.valueOf(editText1.getText());
        password = String.valueOf(editText2.getText());
        if(
                (password.length() >= 8) &&
                        (password.matches("^.*[A-Za-z0-9].*")) &&
                        (password.matches("^.*[@$!%*#?&+_-].*"))
          ){
            Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_LONG).show();
            intent = new Intent(MainActivity.this,CurrencyExchange2.class);
            intent.putExtra("NAME",name);
            startActivity(intent);

        }
        else{
            Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_LONG).show();
        }


    }

    String name,password;
    EditText editText1;
    EditText editText2;
    Button button;
    Intent intent;
    ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Define the title
        actionBar = getSupportActionBar();
        actionBar.setTitle("Login page");
        //define the variables
        editText1 = (EditText) findViewById(R.id.usernameED);
        editText2 =  (EditText) findViewById(R.id.passwordED);
        button = (Button) findViewById(R.id.btnSubmit);
    }
}