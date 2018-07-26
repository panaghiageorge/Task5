package com.example.user.fragmentdata;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class viewpagera extends FragmentPagerAdapter {
    public viewpagera (FragmentManager fm){
        super(fm);
            }

            @Override
    public Fragment getItem(int position) {
                Fragment fragment = null;
                if (position == 0) {
                        fragment = new tab1();
                    } else if (position == 1){
                        fragment = new tab2();
                    }
                return fragment;
            }

            @Override
   public int getCount() {
                return 2;
            }
            @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
                String title = null;
                if (position == 0){
                        title = "Pagina1";
                    } else if (position == 1){
                        title = "Pagina2";
                    }
               return title;
            }
}
