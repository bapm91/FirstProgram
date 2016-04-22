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
        List<String> mDataset =  new ArrayList<>();
        mDataset.add(new String("Item 10"));
        mDataset.add(new String("Item 20"));
        mDataset.add(new String("Item 30"));
        mDataset.add(new String("Item 40"));
        mDataset.add(new String("Item 50"));
        mDataset.add(new String("Item 60"));
        mDataset.add(new String("Item 70"));
        mDataset.add(new String("Item 80"));
        mDataset.add(new String("Item 90"));

        RecyclerView recyclerView = (RecyclerView) mView.findViewById(R.id.recycler_done);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new RecyclerTabAdapter(mDataset));
        return mView;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
