package com.sample.duncapham.instaapp.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sample.duncapham.instaapp.InstaFeedActivity;
import com.sample.duncapham.instaapp.fragments.InstaFavFragment;
import com.sample.duncapham.instaapp.fragments.InstaFeedFragment;
import com.sample.duncapham.instaapp.fragments.PageFragment;

/**
 * Created by duncapham on 7/22/15.
 */
public class InstaFragmentPagerAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };
    private Context context;
    final int PAGE_COUNT = tabTitles.length;

    public InstaFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return InstaFeedFragment.newInstance();
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return InstaFavFragment.newInstance(2);
            default:
                return PageFragment.newInstance(position+1);
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
