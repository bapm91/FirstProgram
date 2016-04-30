package com.example.user.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.user.fragment.DoneFragment;
import com.example.user.fragment.ExpectFragment;
import com.example.user.fragment.InWorkingFragment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TabsFragmentAdapter extends FragmentPagerAdapter {
    private Map<Integer, Fragment> tabs;
    private List<String> mList;

    public TabsFragmentAdapter(FragmentManager fragmentManager, List<String> mList) {
        super(fragmentManager);
        this.mList = mList;
        initTabMap();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabMap() {
        tabs = new HashMap<>();
        tabs.put(0, InWorkingFragment.getInstance());
        tabs.put(1, DoneFragment.getInstance());
        tabs.put(2, ExpectFragment.getInstance());
    }
}
