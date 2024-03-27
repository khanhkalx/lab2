package com.example.example;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private BottomNavigationView bottomNavigationView;
    List<Fragment> fragmentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddEvent();
        Action();
    }

    private void AddEvent() {
        viewPager = findViewById(R.id.view_pager);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        fragmentList = new ArrayList<>();
        fragmentList.add(new List_view_album());
        fragmentList.add(new Search_music());
        fragmentList.add(new User_layout());
        ViewpageAdapter adapter = new ViewpageAdapter(getSupportFragmentManager(), getLifecycle(), fragmentList);
        viewPager.setAdapter(adapter);



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.btn_home){
                    viewPager.setCurrentItem(0);

                }else if(item.getItemId() == R.id.btn_search){
                    viewPager.setCurrentItem(1);
                }else if(item.getItemId() == R.id.btn_user){
                    viewPager.setCurrentItem(2);
                }
                return true;
            }
        });
    }

    private void Action() {

    }



}