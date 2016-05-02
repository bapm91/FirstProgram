package com.example.user.firstprogram;

import com.example.user.cardsModel.CardsModel;

import java.util.ArrayList;
import java.util.List;

public class Application extends android.app.Application {

    public static List<CardsModel> CardListDataset() {
        List<CardsModel> cardsModelList = new ArrayList<>();
        cardsModelList.add(new CardsModel(R.string.header_1,
                R.string.address_1,
                R.string.date_1,
                R.string.days_1,
                R.string.like_1,
                R.mipmap.ic_warning_black_24dp));
        cardsModelList.add(new CardsModel(R.string.header_2,
                R.string.address_2,
                R.string.date_2,
                R.string.days_2,
                R.string.like_2,
                R.mipmap.ic_trending_up_black_24dp));
        cardsModelList.add(new CardsModel(R.string.header_3,
                R.string.address_3,
                R.string.date_3,
                R.string.days_3,
                R.string.like_3,
                R.mipmap.ic_trash));
        cardsModelList.add(new CardsModel(R.string.header_4,
                R.string.address_4,
                R.string.date_4,
                R.string.days_4,
                R.string.like_4,
                R.mipmap.ic_timeline_black_24dp));
        cardsModelList.add(new CardsModel(R.string.header_5,
                R.string.address_5,
                R.string.date_5,
                R.string.days_5,
                R.string.like_5,
                R.mipmap.ic_flight_takeoff_black_24dp));
        cardsModelList.add(new CardsModel(R.string.header_6,
                R.string.address_6,
                R.string.date_6,
                R.string.days_6,
                R.string.like_6,
                R.mipmap.ic_shopping_cart_black_24dp));
        cardsModelList.add(new CardsModel(R.string.header_7,
                R.string.address_7,
                R.string.date_7,
                R.string.days_7,
                R.string.like_7,
                R.mipmap.ic_swap_horiz_black_24dp));
        cardsModelList.add(new CardsModel(R.string.header_8,
                R.string.address_8,
                R.string.date_8,
                R.string.days_8,
                R.string.like_8,
                R.mipmap.ic_timeline_black_24dp));
        cardsModelList.add(new CardsModel(R.string.header_9,
                R.string.address_9,
                R.string.date_9,
                R.string.days_9,
                R.string.like_9,
                R.mipmap.ic_warning_black_24dp));

        return cardsModelList;
    }

    public static List<CardsModel> getCardsModelList() {
        return CardListDataset();
    }
}
