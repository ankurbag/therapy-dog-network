package com.tdn.therapydog.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.tdn.therapydog.fragments.Fragment1;
import com.tdn.therapydog.fragments.Fragment2;
import com.tdn.therapydog.fragments.Fragment3;
import com.tdn.therapydog.fragments.Fragment4;

public class AppPagerAdapter extends FragmentPagerAdapter {

    public AppPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return Fragment1.createNewInstance();
            case 1:
                return Fragment2.createNewInstance();
            case 2:
                return Fragment3.createNewInstance();
            case 3:
            default:
                return Fragment4.createNewInstance();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "First Question";
            case 1:
                return "Second Question";
            case 2:
                return "Third Question";
            case 3:
                return "Fourth Question";
            default:
                return "Info";
        }
    }

    /*
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        Drawable image =  ContextCompat.getDrawable(R.drawable.camera_selector);
        image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
        // Replace blank spaces with image icon
        SpannableString sb = new SpannableString("   " + tabTitles[position]);
        ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BOTTOM);
        sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return sb;
    }
    */
}