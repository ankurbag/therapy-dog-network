package com.tdn.therapydog.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.tdn.therapydog.AndroidApplication;
import com.tdn.therapydog.R;

import java.util.concurrent.atomic.AtomicLong;


/**
 * Abstract fragment that every other Fragment in this application must implement. It handles
 * creation of Dagger components and makes sure that instances of ConfigPersistentComponent
 * survive across configuration changes.
 */
public abstract class BaseFragment extends Fragment {

    private static final String KEY_FRAGMENT_ID = "KEY_FRAGMENT_ID";
    private static final AtomicLong NEXT_ID = new AtomicLong(0);
    public static final int RES_ID = 1239817982;

    public AppCompatCheckBox checkBox;
    public AppCompatButton yes;
    public AppCompatButton no;
    private long mFragmentId;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create the FragmentComponent and reuses cached ConfigPersistentComponent if this is
        // being called after a configuration change.
        mFragmentId = savedInstanceState != null ?
                savedInstanceState.getLong(KEY_FRAGMENT_ID) : NEXT_ID.getAndIncrement();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putLong(KEY_FRAGMENT_ID, mFragmentId);
    }

    public Context getContext() {
        return this.getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        if (getLayoutResourceId() != 0) {
            view = inflater.inflate(getLayoutResourceId(), null, false);
        }
        else {
            view = new LinearLayoutCompat(inflater.getContext());
            view.setLayoutParams(new LinearLayoutCompat.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT, LinearLayoutCompat.LayoutParams.MATCH_PARENT));
        }
        view.setTag(RES_ID, getLayoutResourceId());
        yes = (AppCompatButton) view.findViewById(R.id.yes);
        no = (AppCompatButton) view.findViewById(R.id.no);
        checkBox = (AppCompatCheckBox) view.findViewById(R.id.checkbox);
        yes.setOnClickListener(yesClickListener);
        no.setOnClickListener(noClickListener);
        return view;
    }

    public boolean isYes() {
        int resId = getLayoutResourceId();
            if (resId == R.layout.fragment1)
                return AndroidApplication.instance.question1;
            if (resId == R.layout.fragment2)
                return AndroidApplication.instance.question2 ;
            if (resId == R.layout.fragment3)
                return AndroidApplication.instance.question3 ;
            if (resId == R.layout.fragment4)
                return AndroidApplication.instance.question4 ;
        return false;
     }

    public View.OnClickListener yesClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int resId = getLayoutResourceId();
            if (resId == R.layout.fragment1)
                AndroidApplication.instance.question1 = true;
            if (resId == R.layout.fragment2)
                AndroidApplication.instance.question2 = true;
            if (resId == R.layout.fragment3)
                AndroidApplication.instance.question3 = true;
            if (resId == R.layout.fragment4)
                AndroidApplication.instance.question4 = true;
            setCheckeBox();
        }
    };


    public void setDone(boolean yesOrNo) {
        if (yesOrNo)
            yesClickListener.onClick(yes);
        else
            noClickListener.onClick(no);
    }


    public void setCheckeBox() {
            if (isYes()) {
                checkBox.setChecked(true);
            }
            else
                checkBox.setChecked(false);
    }

    public View.OnClickListener noClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int resId = getLayoutResourceId();
            if (resId == R.layout.fragment1)
                AndroidApplication.instance.question1 = false;
            if (resId == R.layout.fragment2)
                AndroidApplication.instance.question2 = false;
            if (resId == R.layout.fragment3)
                AndroidApplication.instance.question3 = false;
            if (resId == R.layout.fragment4)
                AndroidApplication.instance.question4 = false;
            setCheckeBox();
        }
    };

    public abstract int getLayoutResourceId();
}