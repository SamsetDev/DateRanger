package com.samset.user.calendersample;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.samset.user.calendersample.fragment.TabFromFragment;
import com.samset.user.calendersample.fragment.TabToFragment;
import com.samset.user.calendersample.views.CalendarView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;


public class MainActivity extends AppCompatActivity {
    CalendarView simpleCalendarView;

    TabLayout tabLayout;

    TabLayout.Tab tabFrom;
    TabLayout.Tab tabTo;

    String from,to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.rentTabLayout);
        findViewById(R.id.btn_submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (from!=null)
                {
                    if (to!=null)
                    {
                        Toast.makeText(MainActivity.this,"From "+from+" To "+to,Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this,"Select from date",Toast.LENGTH_SHORT).show();
                }
            }
        });
        setTab();


    }

    private void setTab() {

        tabFrom = tabLayout.newTab();
        tabFrom.setText("FROM");
        //tabOffers.setIcon(R.drawable.ic_home);
        tabLayout.addTab(tabFrom);
        beginTransction(new TabFromFragment());

        tabTo = tabLayout.newTab();
        tabTo.setText("TO");
        tabLayout.addTab(tabTo);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = null;
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new TabFromFragment();
                        break;
                    case 1:
                        fragment = new TabToFragment();
                        break;

                }
                beginTransction(fragment);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public void getSelectedDatefrom(String data)
    {
        this.from=data;
    }
    public void getSelectedDateto(String data)
    {
       this.to=data;
    }



    private void beginTransction(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.rent_tab, fragment);
        //transaction.addToBackStack(null);
        transaction.commit();

    }
}
