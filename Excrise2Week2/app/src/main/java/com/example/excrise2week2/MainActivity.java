package com.example.excrise2week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void keyPressed(View view)
    {
        EditText NameeditText = (EditText) findViewById(R.id.NameTextBox);
        EditText passwordText = (EditText) findViewById(R.id.PasswordTextBox);
        if(passwordText.getText().toString().length()>=8)
        {
            if(!passwordText.getText().toString().contains(""))

        }

        else
        {
            Log.i("info","Password should be at least 8 charters");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}