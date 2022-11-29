package com.example.pslticketbookingapp.Models;

public class MainModel 
{
    int image;
    String name,price,date,time,description;

    public MainModel(int image, String name, String price, String date, String time, String description) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.date = date;
        this.time = time;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
