package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //scope is everything within the needed value's method
    }

    public void onBtnClick(View view)
    {
        //creating the method that goes into the button in xml file. need import to use view
        //the text will change when the button is clicked

        //the text views at the bottom screen displaying information
        TextView txtFirst = findViewById(R.id.firstView);
        TextView txtLast = findViewById(R.id.lastView);
        TextView txtEmail = findViewById(R.id.emailView);

        //text input boxes for user to insert text
        EditText edtfirst = findViewById(R.id.firstName);
        String name = edtfirst.getText().toString();

        EditText edtlast = findViewById(R.id.lastName);
        String last = edtlast.getText().toString();

        EditText edtEmail = findViewById(R.id.email);
        String email = edtEmail.getText().toString();

        //adding 2 strings together is called concatenate
        //adding the input to the end of the textView at bottom of screen
        txtFirst.setText("First Name: "+name);
        txtLast.setText("Last Name: "+last);
        txtEmail.setText("Email: "+email);
    }
}