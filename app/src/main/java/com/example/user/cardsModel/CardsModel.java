package com.example.user.cardsModel;

public class CardsModel {
    private String header;
    private String adress;
    private String date;
    private String days;
    private String likes;
    private int cardIcon;

    public CardsModel(String header, String adress, String date, String days, String likes, int cardIcon) {
            this.header = header;
            this.adress = adress;
            this.date = date;
            this.days = days;
            this.likes = likes;
            this.cardIcon = cardIcon;
    }

    public String getHeader() {
        return header;
    }

    public String getAdress() {
        return adress;
    }

    public String getDate() {
        return date;
    }

    public String getDays() {
        return days;
    }

    public String getLikes() {
        return likes;
    }

    public int getCardIcon() {
        return cardIcon;
    }
}

