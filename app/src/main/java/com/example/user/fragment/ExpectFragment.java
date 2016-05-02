package com.example.user.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.user.adapter.ListViewAdapter;
import com.example.user.firstprogram.Application;
import com.example.user.firstprogram.R;

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
        listView.setAdapter(new ListViewAdapter(Application.getCardsModelList()));

        return view;
    }
}