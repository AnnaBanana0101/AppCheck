package com.example.appcheck;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.content.DialogInterface;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.content.Intent;
import android.view.View;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Button button;
    ArrayList<String> list= new ArrayList<>();
    CheckBox c1, c2, c3, c4;



    public void buttonTap(View view)
    {
        String c1_string, c2_string, c3_string, c4_string;

        c1_string= c1.getText().toString();
        c2_string= c2.getText().toString();
        c3_string= c3.getText().toString();
        c4_string= c4.getText().toString();

        if(c1.isChecked())
        {
            list.add(c1_string);
        }
        else
        {
            String c1_rev="";
            char ch;

            for (int i=0; i<c1_string.length(); i++)
            {
                ch= c1_string.charAt(i); //extracts each character
                c1_rev= ch+c1_rev; //adds each character in front of the existing string
            }

            list.add(c1_rev);
        }

        if(c2.isChecked())
        {
            list.add(c2_string);
        }
        else
        {
            String c2_rev="";
            char ch;

            for (int i=0; i<c2_string.length(); i++)
            {
                ch= c2_string.charAt(i); //extracts each character
                c2_rev= ch+c2_rev; //adds each character in front of the existing string
            }

            list.add(c2_rev);
        }

        if(c3.isChecked())
        {
            list.add(c3_string);
        }
        else
        {
            String c3_rev="";
            char ch;

            for (int i=0; i<c3_string.length(); i++)
            {
                ch= c3_string.charAt(i); //extracts each character
                c3_rev= ch+c3_rev; //adds each character in front of the existing string
            }

            list.add(c3_rev);
        }

        if(c4.isChecked())
        {
            list.add(c4_string);
        }
        else
        {
            String c4_rev="";
            char ch;

            for (int i=0; i<c4_string.length(); i++)
            {
                ch= c4_string.charAt(i); //extracts each character
                c4_rev= ch+c4_rev; //adds each character in front of the existing string
            }

            list.add(c4_rev);
        }
        /*list.add(c1_string);
        list.add(c2_string);
        list.add(c3_string);
        list.add(c4_string);*/

        /*Intent intent= new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("list", list);
        startActivity(intent);*/

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Are You Sure?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent intent= new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("list", list);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog

            }
        });

        AlertDialog dialog= builder.create();
        dialog.show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.checkBox1);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        c4=findViewById(R.id.checkBox4);
    }
}