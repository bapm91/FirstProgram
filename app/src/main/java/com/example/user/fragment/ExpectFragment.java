package com.example.user.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.user.adapter.ListViewAdapter;
import com.example.user.cardsModel.CardsModel;
import com.example.user.firstprogram.R;
import com.melnykov.fab.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ExpectFragment extends Fragment {

    public static ExpectFragment getInstance() {
        Bundle args = new Bundle();
        ExpectFragment fragment = new ExpectFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_expect, container, false);
        ListView listView = (ListView) view.findViewById(R.id.expect_list_view);
        List<CardsModel> list = new ArrayList<>();
        list.add(new CardsModel("Демонтаж інших об'єктів, що входять до переліку мал...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_warning_black_24dp));
        list.add(new CardsModel("Питання стосовно нарахування боргу електрое...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trending_up_black_24dp));
        list.add(new CardsModel("Ремонт та обслуговування ліфтів", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trash));
        list.add(new CardsModel("Прибирання та санітарний стан території", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_timeline_black_24dp));
        list.add(new CardsModel("Демонтаж інших об'єктів, що входять до переліку мал...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_warning_black_24dp));
        list.add(new CardsModel("Питання стосовно нарахування боргу електрое...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trending_up_black_24dp));
        list.add(new CardsModel("Ремонт та обслуговування ліфтів", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trash));
        list.add(new CardsModel("Прибирання та санітарний стан території", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_timeline_black_24dp));
        list.add(new CardsModel("Демонтаж інших об'єктів, що входять до переліку мал...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_warning_black_24dp));
        list.add(new CardsModel("Питання стосовно нарахування боргу електрое...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trending_up_black_24dp));
        list.add(new CardsModel("Ремонт та обслуговування ліфтів", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trash));
        list.add(new CardsModel("Прибирання та санітарний стан території", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_timeline_black_24dp));

        listView.setAdapter(new ListViewAdapter(list));
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab_expect);
        fab.attachToListView(listView);

        return view;
    }
}