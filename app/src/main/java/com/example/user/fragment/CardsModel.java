package com.example.user.fragment;

public class CardsModel {
    public String header;
    public String adress;
    public String date;
    public String days;
    public String likes;
    public int cardIcon;

    CardsModel(String header, String adress, String date, String days, String likes, int cardIcon) {
            this.header = header;
            this.adress = adress;
            this.date = date;
            this.days = days;
            this.likes = likes;
            this.cardIcon = cardIcon;
    }
}

