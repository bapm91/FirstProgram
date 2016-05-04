package com.example.user.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.adapter.RecyclerTabAdapter;
import com.example.user.firstprogram.Application;
import com.example.user.firstprogram.R;

public class InWorkingFragment extends Fragment {
    private OnScrollListener mCallback;


    public static InWorkingFragment getInstance() {
        Bundle args = new Bundle();
        InWorkingFragment fragment = new InWorkingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            mCallback = (OnScrollListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_in_working, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_tab_in_working);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new RecyclerTabAdapter(Application.getCardsModelList()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.getScrollState();
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == 0) {
                    mCallback.onScroll(false);
                } else {
                    mCallback.onScroll(true);
                }
            }
        });

        return view;
    }
}
