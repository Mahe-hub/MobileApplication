package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    ListView listView = (ListView) findViewById(R.id.listview);

    ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("4386225847");
        arrayList.add("5145689035");
        arrayList.add("5145689035");
        arrayList.add("5145689035");
        arrayList.add("5145689035");
        arrayList.add("5145689035");
        arrayList.add("5145689035");
        arrayList.add("5145689035");
        arrayList.add("5145689035");
        arrayList.add("5145689035");
        arrayList.add("5145689035");
        arrayList.add("4386225847");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter((arrayAdapter));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Toast.makeText(MainActivity.this, "Clicked item: " + i + " " + arrayList.get(i).toString(), Toast.LENGTH_SHORT).show();

            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+ arrayList.get(i).toString()));

            startActivity(intent);


//              arrayList.remove(i);
//              arrayAdapter.notifyDataSetChanged();

           }
        });
    }

}