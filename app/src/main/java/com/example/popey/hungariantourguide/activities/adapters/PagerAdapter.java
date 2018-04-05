package com.example.popey.hungariantourguide.activities.adapters;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.popey.hungariantourguide.R;
import com.example.popey.hungariantourguide.activities.fragments.CitiesFragment;
import com.example.popey.hungariantourguide.activities.fragments.HungaricumsFragment;
import com.example.popey.hungariantourguide.activities.fragments.NationalParksFragment;
import com.example.popey.hungariantourguide.activities.fragments.SpasFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link PagerAdapter} object.
     */
    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CitiesFragment();
        } else if (position == 1) {
            return new NationalParksFragment();
        } else if (position == 2) {
            return new SpasFragment();
        } else {
            return new HungaricumsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_cities);
        } else if (position == 1) {
            return mContext.getString(R.string.category_parks);
        } else if (position == 2) {
            return mContext.getString(R.string.category_spas);
        } else {
            return mContext.getString(R.string.category_hungaricums);
        }
    }
}



