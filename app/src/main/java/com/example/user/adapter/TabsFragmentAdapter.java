package com.example.user.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.user.fragment.DoneFragment;
import com.example.user.fragment.ExpectFragment;
import com.example.user.fragment.InWorkingFragment;

import java.util.List;

public class TabsFragmentAdapter extends FragmentPagerAdapter {
    private List<String> mList;

    public TabsFragmentAdapter(FragmentManager fragmentManager, List<String> mList) {
        super(fragmentManager);
        this.mList = mList;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return InWorkingFragment.getInstance();
            case 1:
                return DoneFragment.getInstance();
            case 2:
                return ExpectFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return mList.size();
    }
}
