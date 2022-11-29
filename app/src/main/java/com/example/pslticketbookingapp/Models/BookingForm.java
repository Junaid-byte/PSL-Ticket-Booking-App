package com.example.pslticketbookingapp.Models;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.pslticketbookingapp.R;

public class BookingForm extends AppCompatActivity
{
    EditText name,email,contact,ticketbook,seatrow;
    Spinner Payment;
    Button Book;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.bookingform);

        name = findViewById(R.id.Name);
        email = findViewById(R.id.EmailAddress);
        contact = findViewById(R.id.Contact);
        ticketbook = findViewById(R.id.Ticket);
        seatrow = findViewById(R.id.SeatRow);
        Payment = findViewById(R.id.PaymentMethods);
        Book = findViewById(R.id.Book);

        Book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = name.getText().toString();
                Toast.makeText(getApplicationContext(),"Dear "+username+" your ticket(s) booking has been confirmed!",Toast.LENGTH_LONG).show();

                if(name.equals("") || email.equals("") || contact.equals("") || ticketbook.equals("") || seatrow.equals("")
                ||Payment.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please Enter All Your Details To Book Your Tickets!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Dear "+username+" your ticket(s) booking has been confirmed!",Toast.LENGTH_LONG).show();
                }



            }
        });

    }



}
