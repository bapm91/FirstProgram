package com.example.user.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.firstprogram.R;

import java.util.ArrayList;
import java.util.List;

public class ExpectFragment extends AbstractTabFragment {
    private static final int LayoutThis = R.layout.fragment_expect;
    private ListView listView;

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
        List<String> list = new ArrayList<String>();

        ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(ListViewAdapter);

        return mView;
    }
}