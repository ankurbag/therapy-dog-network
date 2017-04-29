package com.tdn.therapydog.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.tdn.therapydog.R;
import com.tdn.therapydog.adapters.AppPagerAdapter;
import com.tdn.therapydog.fragments.BaseFragment;

public class CanineHomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, BaseFragment.ActivityInterface {

    ViewPager mViewPager;
    TabLayout mTabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canine_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mTabLayout = (TabLayout) findViewById(R.id.tablayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        setupUI();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.canine_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void setupUI() {
        mViewPager.setAdapter(new AppPagerAdapter(getSupportFragmentManager()));
        mTabLayout.setupWithViewPager(mViewPager);
        for (int i = 0; i < mTabLayout.getTabCount(); i++) {
            int padding = 10;
            TextView imageView = new TextView(this);
            imageView.setPadding(padding,padding,padding,padding);
            if (i == 0) {
                imageView.setText("Basic Information");
            }
            if (i == 1) {
                imageView.setText("Detailed Information");
            }
            if (i == 2) {
                imageView.setText("Vaccination");
            }
            if (i == 3) {
                imageView.setText("Training Details");
            }
            mTabLayout.getTabAt(i).setCustomView(imageView);
        }
    }

    @Override
    public void onCancel(int layoutResourceId) {
        changeToCancel();
    }

    @Override
    public void onNext(int resId) {
        if (resId == R.layout.fragment1) {
            TabLayout.Tab tab = mTabLayout.getTabAt(1);
            tab.select();
        }
        if (resId == R.layout.fragment2) {
            TabLayout.Tab tab = mTabLayout.getTabAt(2);
            tab.select();
        }
        if (resId == R.layout.fragment3) {
            TabLayout.Tab tab = mTabLayout.getTabAt(3);
            tab.select();
        }
        if (resId == R.layout.fragment4) {
            changeToCompleted();
        }
    }

    public void changeToCompleted() {
        Intent intent = new Intent(this, CompletedActivity.class) ;
        startActivity(intent);
    }

    public void changeToCancel() {
        finish();
    }
}
