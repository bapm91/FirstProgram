package com.example.user.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.adapter.RecyclerTabAdapter;
import com.example.user.firstprogram.Application;
import com.example.user.firstprogram.R;
import com.melnykov.fab.FloatingActionButton;

public class DoneFragment extends Fragment {

    public static DoneFragment getInstance() {
        Bundle args = new Bundle();
        DoneFragment fragment = new DoneFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_done, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_done);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new RecyclerTabAdapter(Application.getCardsModelList()));

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab_done);
        fab.attachToRecyclerView(recyclerView);
        return view;
    }
}
