package com.example.unikornkasrt.view;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.unikornkasrt.view.fragment.pemasukan.PemasukanFragment;
import com.example.unikornkasrt.view.fragment.pengeluaran.PengeluaranFragment;

/** @noinspection ALL */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new PemasukanFragment();
                break;
            case 1:
                fragment = new PengeluaranFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String strTitle = "";
        switch (position) {
            case 0:
                strTitle = "Pemasukan";
                break;
            case 1:
                strTitle = "Pengeluaran";
                break;
        }
        return strTitle;
    }

}