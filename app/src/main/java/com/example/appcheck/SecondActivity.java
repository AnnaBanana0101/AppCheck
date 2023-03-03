package com.example.appcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> List= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listView= findViewById(R.id.listView);

        Intent intent= getIntent();
        List= (ArrayList<String>) intent.getSerializableExtra("list");

        ArrayAdapter<String> arr= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, List);
        listView.setAdapter(arr);

    }
}