package com.sanwei.sanwei.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.sanwei.sanwei.fragment.StudentListFragment;

/**
 * Created by tangdi on 12/13/17.
 */

public class ViewPageAdapter extends FragmentStatePagerAdapter {
    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new StudentListFragment();
    }

    @Override
    public int getCount() {
        return 1;
    }
}
