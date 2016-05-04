package com.example.user.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.user.adapter.ListViewAdapter;
import com.example.user.firstprogram.Application;
import com.example.user.firstprogram.OnePageActivity;
import com.example.user.firstprogram.R;

public class ExpectFragment extends Fragment {
    private OnScrollListener mCallback;

    public static ExpectFragment getInstance() {
        Bundle args = new Bundle();
        ExpectFragment fragment = new ExpectFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            mCallback = (OnScrollListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnScrollListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_expect, container, false);
        ListView listView = (ListView) view.findViewById(R.id.expect_list_view);
        listView.setAdapter(new ListViewAdapter(Application.getCardsModelList()));

        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                if (scrollState == 0) {
                    mCallback.onScroll(false);
                } else {
                    mCallback.onScroll(true);
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), OnePageActivity.class);
                intent.putExtra("position", position);
                getContext().startActivity(intent);
            }
        });

        return view;
    }
}