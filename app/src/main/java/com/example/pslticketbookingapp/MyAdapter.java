package com.example.pslticketbookingapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends ArrayAdapter {

    List<String> matchtitlelist;
    List<Integer> matchimageslist;
    Context context;


    public MyAdapter(@NonNull Context context,List<String> title ,List<Integer> image) {
        super(context, R.layout.home_page,title);

        this.matchtitlelist = title;
        this.matchimageslist = image;
        this.context = context;




    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(R.layout.home_page,parent,false);
        ImageView imageView = view.findViewById(R.id.teamimage);
        TextView textView = view.findViewById(R.id.MatchDetails);

        textView.setText(matchtitlelist.get(position));
        imageView.setImageResource(matchimageslist.get(position));


        return view;

    }
}
