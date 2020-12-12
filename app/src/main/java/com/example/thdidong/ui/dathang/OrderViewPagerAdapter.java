package com.example.thdidong.ui.dathang;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.thdidong.ItemFragment;

public class OrderViewPagerAdapter extends FragmentStatePagerAdapter {
    public OrderViewPagerAdapter(@NonNull FragmentManager fm05, int behavior) {
        super(fm05, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position05) {
        switch (position05) {
            case 0:
                return new ItemFragment();
            case 1:
                return new ItemFragment();
            case 2:
                return new ItemFragment();
            default:
                return new OrderFragmentTab1();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position05) {
        switch (position05) {
            case 0:
                return "Phổ Biến";
            case 1:
                return  "Thức Uống";
            case 2:
                return  "Đồng ăn";
            default:
                return "Phổ Biến";
        }
    }
}


