package com.example.popey.hungariantourguide.activities.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.popey.hungariantourguide.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * Set the content of the activity to use the activity_main.xml layout file
         */
        setContentView(R.layout.activity_main);
        /**
         * Find the view pager that will allow the user to swipe between fragments
         */
        ViewPager viewPager = findViewById(R.id.viewpager);
        /**
         * Create an adapter that knows which fragment should be shown on each page
         */
        PagerAdapter adapter = new com.example.popey.hungariantourguide.activities.adapters.PagerAdapter(this, getSupportFragmentManager());
        /**
         * Set the adapter onto the view pager
         */
        viewPager.setAdapter(adapter);
        /**
         *  Find the tab layout that shows the tabs
         */
        TabLayout tabLayout = findViewById(R.id.tabs);
        /**
         * Connect the tab layout with the view pager.
         */
        tabLayout.setupWithViewPager(viewPager);
    }
}
