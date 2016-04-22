package com.example.user.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.user.fragment.AbstractTabFragment;
import com.example.user.fragment.DoneFragment;
import com.example.user.fragment.ExpectFragment;
import com.example.user.fragment.InWorkingFragment;

import java.util.HashMap;
import java.util.Map;

public class TabsFragmentAdapter extends FragmentPagerAdapter{
    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.context = context;
        initTabMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, InWorkingFragment.getInstance(context));
        tabs.put(1, DoneFragment.getInstance(context));
        tabs.put(2, ExpectFragment.getInstance(context));
    }
}
