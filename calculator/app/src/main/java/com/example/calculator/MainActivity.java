package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    // define variables
    String input = null;
    EditText inputEdt ;
    Button addbtn ;
    Button subbtn;
    Button mulbtn ;
    Button divbtn ;
    Button logbtn;
    Button clearbtn;
    Button calbtn ;
    Button changecolorbtn ;
    //
//    //define numbers
    double number1 =0,number2=0;
//


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputEdt = (EditText) findViewById(R.id.userInput);

        addbtn = (Button) findViewById(R.id.addBtn);
        subbtn = (Button) findViewById(R.id.subBtn);
         mulbtn = (Button) findViewById(R.id.mulBtn);
        divbtn = (Button) findViewById(R.id.divBtn);
         logbtn = (Button) findViewById(R.id.LogBtn);
         clearbtn = (Button) findViewById(R.id.ClearBtn);
         calbtn = (Button) findViewById(R.id.calculate);
         changecolorbtn = (Button) findViewById(R.id.changeColor);

    }

//    //add method

//    public String addNumbers(View view) {
//        return "+";
//
//    }

    public void onbuttonClick(View view){
        Button calButton = (Button)  view;
        String data = calButton.getText().toString();

        switch (data){
            case "C":
                input = null;
                inputEdt.setText("");
                break;

            case "*":

                input = "*";
                solve();
                break;
            case "CALCULATE":
                solve();
                break;
            case "LOG":
                solve();
                break;

            default:
//                if (input == null) {
//                    input = "";
//                }
//                if (data.equals("+") || data.equals("/") || data.equals("-")) {
//                    solve();
//                }
//                input += data;
        }
        inputEdt.setText(input);
    }

    private void solve() {
       if (input.equals("*")){
           String numbers[] = inputEdt.toString().split("\\*");
//           number1 = Double.parseDouble(inputEdt.getText().toString());
//           input = null;
           inputEdt.setText("");
//           number2 = Double.parseDouble(inputEdt.getText().toString());
//           inputEdt.setText("");
           double res = Double.parseDouble(numbers[0]) * Double.parseDouble(numbers[1]);
           inputEdt.setText(Double.toString(res));


       }
    }


}
