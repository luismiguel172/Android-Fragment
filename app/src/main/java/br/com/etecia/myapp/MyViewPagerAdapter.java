package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyViewPagerAdapter extends FragmentStateAdapter {


    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new CachorroFragment();
            case 1:
                return new PeixeFragment();
            case 2:
                return new GatoFragment();
            default:
                return new PeixeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
