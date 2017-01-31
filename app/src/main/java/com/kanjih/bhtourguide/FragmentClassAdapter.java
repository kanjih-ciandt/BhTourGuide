package com.kanjih.bhtourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.kanjih.bhtourguide.PublicPlacesFragment;

import java.util.Arrays;

/**
 * Created by kneto on 1/15/17.
 */

public class FragmentClassAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[4];

    public FragmentClassAdapter (FragmentManager fm, String... tables) {
        super(fm);
        tabTitles = Arrays.copyOf(tables, tables.length);
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PublicPlacesFragment();
        } else if (position == 1){
            return new RestaurantsFragment();
        } else if (position == 2){
            return new PubsFragment();
        } else {
            return new DrinksFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
