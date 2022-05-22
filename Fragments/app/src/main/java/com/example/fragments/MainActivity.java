package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fragment1Btn,fragment2Btn;
        fragment1Btn=findViewById(R.id.fragment1Btn);
        fragment2Btn=findViewById(R.id.fragment2Btn);
        Fragment1 fragment1= new Fragment1();
        Fragment2 fragment2 = new Fragment2();

        fragment1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              replaceFragment(fragment1);
            }
        });



        fragment2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(fragment2);
            }
        });


    }


    public  void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.myFrameLayout,fragment);
        fragmentTransaction.commit();

    }

}