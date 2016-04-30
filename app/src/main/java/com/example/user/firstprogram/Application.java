package com.example.user.firstprogram;

import com.example.user.cardsModel.CardsModel;

import java.util.ArrayList;
import java.util.List;

public class Application extends android.app.Application{


    public static List<CardsModel> CardListDataset() {

        List<CardsModel> cardsModelList = new ArrayList<>();
        cardsModelList.add(new CardsModel("Демонтаж інших об'єктів, що входять до переліку мал...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_warning_black_24dp));
        cardsModelList.add(new CardsModel("Питання стосовно нарахування боргу електрое...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trending_up_black_24dp));
        cardsModelList.add(new CardsModel("Ремонт та обслуговування ліфтів", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trash));
        cardsModelList.add(new CardsModel("Прибирання та санітарний стан території", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_timeline_black_24dp));
        cardsModelList.add(new CardsModel("Комунальне господарство", "вул.Б.Кротова,22,Дніпропетровськ", "13.12.12", "7 днів", "1", R.mipmap.ic_flight_takeoff_black_24dp));
        cardsModelList.add(new CardsModel("Благоустрій та будівництво", "Дніпропетровськ,вулиця Олеся Гончара", "25.06.13", "6 днів", "3", R.mipmap.ic_shopping_cart_black_24dp));
        cardsModelList.add(new CardsModel("1Благоустрій та будівництво", "Дніпропетровськ,проспект Богдана Хмельницького", "11.09.91", "6 днів", "3", R.mipmap.ic_swap_horiz_black_24dp));
        cardsModelList.add(new CardsModel("2Благоустрій та будівництво", "Дніпропетровськ,проспект Карла Маркса", "13.12.12", "5 днів", "6", R.mipmap.ic_timeline_black_24dp));
        cardsModelList.add(new CardsModel("3Благоустрій та будівництво", "Дніпропетровськ,узвіз Крутогірний", "13.12.12", "5 днів", "2", R.mipmap.ic_warning_black_24dp));

        return cardsModelList;
    }

    public static List<CardsModel> getCardsModelList() {
        return CardListDataset();
    }
}
