package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendmessage(View view){

        Intent intent=new Intent(this,DisplayMessageActivity.class);
        EditText editText=findViewById(R.id.editTextTextPersonName);
        EditText editText1=findViewById(R.id.editTextTextPassword);
        String message=editText.getText().toString();
        String pwd=editText1.getText().toString();

        if(message.equalsIgnoreCase("Admin")&&pwd.equalsIgnoreCase("Admin")){

            startActivity(intent);
        }



    }
}