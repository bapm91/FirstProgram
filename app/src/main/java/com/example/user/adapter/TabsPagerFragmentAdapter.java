package com.example.user.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.user.fragment.RecyclerFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter{
    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        tabs = new String[]{
                "В РОБОТІ",
                "ВИКОНАНО",
                "ОЧІКУЄ"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return RecyclerFragment.getInstance();
            case 1:
                return RecyclerFragment.getInstance();
            case 2:
                return RecyclerFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
