package com.example.pslticketbookingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;

import com.example.pslticketbookingapp.Models.BookingForm;
import com.example.pslticketbookingapp.Models.Homepage;

import java.util.ArrayList;
import java.util.List;

public class ListView extends AppCompatActivity {

    android.widget.ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.listview);

        listView=findViewById(R.id.listView);

        List<String> title = new ArrayList<>();
        List<Integer> image = new ArrayList<>();


        title.add(" Islamabad United vs Multan Sultans \n  Rs.1000/- \n Time:- 7:00pm \n  Date:- 5 Feb 2022 \n Venue:- Gaddafi Stadium Lahore");
        title.add(" Karachi Kings vs Lahore Qalandars \n  Rs.1000/- \n  Time:- 8:00pm \n Date:- 7 Feb 2022 \n Venue:- Gaddafi Stadium Lahore");
        title.add("Peshawar Zalmi vs Lahore Qalandars \n  Rs.1000/- \n Time:- 4:00pm \n Date:- 10 Feb 2022\nVenue:- National Stadium Karachi");
        title.add(" Karachi Kings vs Peshawar Zalmi \n Rs.1000/- \n Time:- 12:00pm \n Date:- 14 Feb 2022 \n Venue:- National Stadium Karachi");
        title.add("Peshawar Zalmi vs Quetta Gladiators \n Rs.1000/- \n Time:- 5:00pm \n Date:- 18 Feb 2022\nVenue:- National Stadium Karachi");
        title.add("Islamabad United vs Multan Sultans \n Rs.1000/- \n Time:- 5:00pm \n Date:- 24 Feb 2022\nVenue:- National Stadium Karachi");


        image.add(R.drawable.islamabadvsmultan);
        image.add(R.drawable.karachivslahore);
        image.add(R.drawable.peshawarvslahore);
        image.add(R.drawable.karachivspeshawar);
        image.add(R.drawable.peshawarvsquetta);
        image.add(R.drawable.islamabadvsmultan);


        MyAdapter myAdapter = new MyAdapter(this,title,image);
        listView.setAdapter(myAdapter);



       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if(position == 0)
               {
                   Intent intent = new Intent(ListView.this,BookingForm.class);
                   startActivity(intent);
               }
               else if(position == 1)
               {
                   Intent intent = new Intent(ListView.this,BookingForm.class);
                    startActivity(intent);
               }
               else if(position == 2)
               {
                   Intent intent = new Intent(ListView.this,BookingForm.class);
                   startActivity(intent);
               }
               else if(position == 3)
               {
                   Intent intent = new Intent(ListView.this,BookingForm.class);
                   startActivity(intent);
               }
               else if(position == 4)
               {
                   Intent intent = new Intent(ListView.this,BookingForm.class);
                   startActivity(intent);
               }
               else if(position == 5)
               {
                   Intent intent = new Intent(ListView.this,BookingForm.class);
                   startActivity(intent);
               }


           }
       });


    }


}
