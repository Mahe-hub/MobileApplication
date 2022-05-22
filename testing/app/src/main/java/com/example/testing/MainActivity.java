package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTex;
    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       editTex =(EditText) findViewById(R.id.input);
       button = (Button) findViewById(R.id.change);
       textView =(TextView) findViewById(R.id.textviewChange);
    }

    public void ChangeText(View view){
        textView.setText(editTex.getText());
    }
}