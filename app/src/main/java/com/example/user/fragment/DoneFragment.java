package com.example.user.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.adapter.RecyclerTabAdapter;
import com.example.user.firstprogram.R;

import java.util.ArrayList;
import java.util.List;

public class DoneFragment extends AbstractTabFragment {
    private static final int LayoutThis = R.layout.fragment_done;

    public static DoneFragment getInstance(Context context) {
        Bundle args = new Bundle();
        DoneFragment fragment = new DoneFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_done));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(LayoutThis, container, false);
        List<CardsModel> mDataset =  new ArrayList<>();
        mDataset.add(new CardsModel("Демонтаж інших об'єктів, що входять до переліку мал...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_warning_black_24dp));
        mDataset.add(new CardsModel("Питання стосовно нарахування боргу електрое...", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trending_up_black_24dp));
        mDataset.add(new CardsModel("Ремонт та обслуговування ліфтів", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_trash));
        mDataset.add(new CardsModel("Прибирання та санітарний стан території", "вул.Вадима Гетьмана, 42", "13.12.12", "7 днів", "0", R.mipmap.ic_timeline_black_24dp));

        RecyclerView recyclerView = (RecyclerView) mView.findViewById(R.id.recycler_done);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new RecyclerTabAdapter(mDataset));
        return mView;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
