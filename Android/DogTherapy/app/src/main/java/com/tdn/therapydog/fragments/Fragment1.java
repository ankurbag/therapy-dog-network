package com.tdn.therapydog.fragments;


import com.tdn.therapydog.R;

public final class Fragment1 extends BaseFragment {
    public static final Fragment1 createNewInstance() {
        return new Fragment1();
    }

    @Override
    public int getLayoutResourceId() {
        return R.layout.fragment1;
    }
}