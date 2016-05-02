package com.example.user.cardsModel;

public class CardsModel {
    private int header;
    private int address;
    private int date;
    private int days;
    private int likes;
    private int cardIcon;

    public CardsModel(int header, int address, int date, int days, int likes, int cardIcon) {
        this.header = header;
        this.address = address;
        this.date = date;
        this.days = days;
        this.likes = likes;
        this.cardIcon = cardIcon;
    }

    public int getHeader() {
        return header;
    }

    public int getAddress() {
        return address;
    }

    public int getDate() {
        return date;
    }

    public int getDays() {
        return days;
    }

    public int getLikes() {
        return likes;
    }

    public int getCardIcon() {
        return cardIcon;
    }
}

