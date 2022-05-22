package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


//    public void  change(View view) {
//        if(flag==0){
//            imageview.setImageResource(R.drawable.imagetwo);
//            flag=1;
//        }
//        else{
//            imageview.setImageResource(R.drawable.imageone);
//            flag =0;
//        }


    public void  change(View view) {
        // first in the begining we inserted tag to the first pic in image view
        // here we check if the tag name that we got it by using ImageView instance.getTag()
        //which return String and use String.value of to save the value and compare it
        if(String.valueOf(imageview.getTag()).equals("car1")){
            // set the image two in the image view
            imageview.setImageResource(R.drawable.imagetwo);
            // to change the tag(flag)
            imageview.setTag("car2");
        }
        //set the first image
        else{
            imageview.setImageResource(R.drawable.imageone);
            // change the tag (flag)
            imageview.setTag("car1");
        }

    }

    ImageView imageview;
    Button button;
    int flag =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.switchBtn);

    }
}