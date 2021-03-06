package com.example.project;

import android.service.quicksettings.Tile;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;
///ÇİLEM EMRE///

public class viewPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList=new ArrayList<>();
    private List<String> stringList=new ArrayList<>();


    public viewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public viewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return stringList.get(position);
    }

    public void addFragment(Fragment fragment,String title){
        fragmentList.add(fragment);
        stringList.add(title);
    }
}
