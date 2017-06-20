package com.example.android.miwok;

/**
 * Created by Lenovo on 6/19/2017.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class MiwokFragmentPagerAdapter extends FragmentPagerAdapter
{

    final int PAGE_COUNT = 4;
    private  String tabTitles[] =  new String[]{"NUMBERS", "FAMILY",
    "COLORS", "PHRASES"};


    /*
       Default constructor
     */
    public MiwokFragmentPagerAdapter(FragmentManager fragmentManager)
    {
        super(fragmentManager);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position)
    {
        switch(position)
        {
            case 0:
                return new NumbersFragment();

            case 1:
                return new FamilyFragment();

            case 2:
                return new ColorsFragment();

            case 3:
                return new PhrasesFragment();

            default:
                return null;
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount()
    {
        return PAGE_COUNT;
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Override
    public CharSequence getPageTitle(int position)
    {
        //Generate title based on item position
        return tabTitles[position];
    }
}
