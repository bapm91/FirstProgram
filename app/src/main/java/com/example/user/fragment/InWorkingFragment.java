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

public class InWorkingFragment extends AbstractTabFragment {
    private static final int LayoutThis = R.layout.fragment_in_working;

    public static InWorkingFragment getInstance(Context context) {
        Bundle args = new Bundle();
        InWorkingFragment fragment = new InWorkingFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_in_working));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(LayoutThis, container, false);
        List<String> mDataset =  new ArrayList<>();
        mDataset.add("Комунальне господарство");
        mDataset.add("Благоустрій та будівництво");
        mDataset.add("1Благоустрій та будівництво");
        mDataset.add("2Благоустрій та будівництво");
        mDataset.add("3Благоустрій та будівництво");
        mDataset.add("4Благоустрій та будівництво");
        mDataset.add("5Благоустрій та будівництво");
        mDataset.add("6Благоустрій та будівництво");
        mDataset.add("7Благоустрій та будівництво");

        RecyclerView recyclerView = (RecyclerView) mView.findViewById(R.id.recycler_tab_in_working);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new RecyclerTabAdapter(mDataset));
        return mView;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
