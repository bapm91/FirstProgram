package com.example.user.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.firstprogram.R;

public class ExpectFragment extends AbstractTabFragment {
    private static final int LayoutThis = R.layout.fragment_expect;

    public static ExpectFragment getInstance(Context context) {
        Bundle args = new Bundle();
        ExpectFragment fragment = new ExpectFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_expect));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(LayoutThis, container, false);
        return mView;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
