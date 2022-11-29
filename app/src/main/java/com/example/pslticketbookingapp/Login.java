package com.example.pslticketbookingapp;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.pslticketbookingapp.Models.Homepage;

import java.io.LineNumberReader;

import javax.xml.validation.Validator;

public class Login extends AppCompatActivity {

    EditText username,password;
    ImageView google,facebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.login_activity);


        username = findViewById(R.id.Username);
        password = findViewById(R.id.Password);
        google = findViewById(R.id.google);
        facebook = findViewById(R.id.fb);
        Button loginbutton = (Button) findViewById(R.id.Login);


        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Validate(username.getText().toString(),password.getText().toString());

            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(String.format("https://www.google.com"));

                Intent intent = new Intent(Intent.ACTION_VIEW);

                //SetData
                intent.setData(uri);

                //SetFlag
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                //StartActivity
                startActivity(intent);



            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sAppLink = "https://www.facebook.com/";
                String sPackage = "com.facebook.katana";
                String Weblink = "https://www.facebook.com/12H1rDeveloper";

                openLink(sAppLink,sPackage,Weblink);

            }
        });

    }
    private void openLink(String sAppLink,String sPackage,String Weblink)
    {
            try
            {
                Uri uri = Uri.parse(sAppLink);

                Intent intent = new Intent(Intent.ACTION_VIEW);

                intent.setData(uri);

                intent.setPackage(sPackage);

                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);

                startActivity(intent);
            }
            catch (ActivityNotFoundException activityNotFoundException)
            {
                Uri uri = Uri.parse(Weblink);

                Intent intent = new Intent(Intent.ACTION_VIEW);

                intent.setData(uri);

                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);

                startActivity(intent);
            }
    }


    private void Validate(String Username,String Password)
    {
        if(Username.equals("") || Password.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Username & Password are required to Login!", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Login Successfull!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Login.this, ListView.class);
            startActivity(intent);
        }
    }





}