package com.example.pslticketbookingapp.Models;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ListView;

import com.example.pslticketbookingapp.R;

public class Homepage extends AppCompatActivity {

    android.widget.ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        listView = findViewById(R.id.listView);

        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,BookingForm.class);
                startActivity(intent);
            }
        });




    }
}
