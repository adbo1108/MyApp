package com.darwinprecisions.viewpagersample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Random;

/**
 * Created by Tony.CW.Wu on 2015/8/18.
 */
public class DemoPagerAdapter extends FragmentPagerAdapter {

    private int pagerCount = 5;

    private Random random = new Random();

    public DemoPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ColorFragment.newInstance(0xff000000 | random.nextInt(0x00ffffff));
    }

    @Override
    public int getCount() {
        return pagerCount;
    }
}
