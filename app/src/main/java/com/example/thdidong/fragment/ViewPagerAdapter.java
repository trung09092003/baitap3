package com.example.thdidong.fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.thdidong.MyItemRecyclerViewAdapter;
import com.example.thdidong.ui.dathang.OrderFragmentTab1;
import com.example.thdidong.ui.dathang.OrderFragmentTab2;
import com.example.thdidong.ui.dathang.OrderFragmentTab3;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm05, int behavior) {
        super(fm05, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position05) {
        switch (position05) {
            case 0:
                return new tintuc_fragment();
            case 1:
                return new dathang_fragment();
            case 2:
                return new cuahang_fragment();
            case 3:
                return new taikhoan_fragment();
            default:
                return new tintuc_fragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position05) {
        switch (position05) {
            case 0:
                return "Tab1";
            case 1:
                return  "Tab2";
            case 2:
                return  "Tab3";
            case 3:
                return  "Tab4";
            default:
                return "Tab1";
        }
    }
}


