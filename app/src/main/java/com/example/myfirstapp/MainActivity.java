package com.example.myfirstapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendmessage(View view){

        String msg="Validating";
        Toast toast=Toast.makeText(this.getApplicationContext(),msg,Toast.LENGTH_SHORT);
        toast.show();

        Intent intent=new Intent(this,DisplayMessageActivity.class);
        final Intent intent2=new Intent(this,MainActivity.class);
        EditText editText=findViewById(R.id.editTextTextPersonName);
        EditText editText1=findViewById(R.id.editTextTextPassword);
        String message=editText.getText().toString();
        String pwd=editText1.getText().toString();


        if(message.equalsIgnoreCase("Admin")&&pwd.equalsIgnoreCase("Admin")){

            Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }else{

            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage(R.string.dialog_message);


            builder.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    startActivity(intent2);
                }
            });


            builder.setPositiveButton("Retry", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    startActivity(intent2);

                }
            });

           
            AlertDialog alertDialog=builder.create();
            alertDialog.show();

        }

            //Comment written by Arosh


    }
}