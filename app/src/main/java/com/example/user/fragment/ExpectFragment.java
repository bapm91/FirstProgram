package com.example.user.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.user.adapter.ListViewAdapter;
import com.example.user.firstprogram.R;
import com.melnykov.fab.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ExpectFragment extends Fragment {
    private static final int LayoutThis = R.layout.fragment_expect;
    private String title;
    private View mView;
    private ListView listView;

    public void setTitle(String title) {
        this.title = title;
    }

    public static ExpectFragment getInstance(Context context) {
        Bundle args = new Bundle();
        ExpectFragment fragment = new ExpectFragment();
        fragment.setArguments(args);
        fragment.setTitle(context.getString(R.string.tab_expect));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(LayoutThis, container, false);
        listView = (ListView) mView.findViewById(R.id.expect_list_view);
        List<CardsModel> mList = new ArrayList<>();
        mList.add(new CardsModel("Демонтаж інших об'єктів, що входять до переліку мал...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_warning_black_24dp));
        mList.add(new CardsModel("Питання стосовно нарахування боргу електрое...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trending_up_black_24dp));
        mList.add(new CardsModel("Ремонт та обслуговування ліфтів", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trash));
        mList.add(new CardsModel("Прибирання та санітарний стан території", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_timeline_black_24dp));
        mList.add(new CardsModel("Демонтаж інших об'єктів, що входять до переліку мал...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_warning_black_24dp));
        mList.add(new CardsModel("Питання стосовно нарахування боргу електрое...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trending_up_black_24dp));
        mList.add(new CardsModel("Ремонт та обслуговування ліфтів", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trash));
        mList.add(new CardsModel("Прибирання та санітарний стан території", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_timeline_black_24dp));
        mList.add(new CardsModel("Демонтаж інших об'єктів, що входять до переліку мал...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_warning_black_24dp));
        mList.add(new CardsModel("Питання стосовно нарахування боргу електрое...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trending_up_black_24dp));
        mList.add(new CardsModel("Ремонт та обслуговування ліфтів", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trash));
        mList.add(new CardsModel("Прибирання та санітарний стан території", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_timeline_black_24dp));

        listView.setAdapter(new ListViewAdapter(mList));
        FloatingActionButton fab = (FloatingActionButton) mView.findViewById(R.id.fab_expect);
        fab.attachToListView(listView);

        return mView;
    }

    public String getTitle() {
        return title;
    }
}