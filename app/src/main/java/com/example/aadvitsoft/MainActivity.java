package com.example.aadvitsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.security.AccessController;

public class MainActivity extends AppCompatActivity {

    private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView createnewac = (TextView) findViewById(R.id.txtcreatenewac);
        final TextView forgotPass =(TextView)findViewById(R.id.txtforgotPass);

        createnewac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Toast.makeText(MainActivity.this, "you clicked me", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(view.getContext(),Registration.class);
                startActivityForResult(myIntent, 0);
            }
        });

        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Toast.makeText(MainActivity.this, "you clicked ForgotPassword", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(view.getContext(),forgotPassword.class);
                startActivityForResult(myIntent, 0);
            }
        });


            }



    }
