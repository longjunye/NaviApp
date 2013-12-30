package com.navi.app.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.navi.app.HomeActivity;
import com.navi.app.R;
import com.navi.app.adapter.HomePagerAdapter;

/**
 * Created by ricky on 12/27/13.
 */
public class MovieFragment extends Fragment {
    public static final String ARG_OBJECT = "object";
    HomePagerAdapter homePagerAdapter;
    ViewPager mViewPager;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated
        // properly.
        View rootView = inflater.inflate(
                R.layout.fragment_movie, container, false);
        Bundle args = getArguments();
        homePagerAdapter =
                new HomePagerAdapter(getFragmentManager());
        mViewPager = (ViewPager) rootView.findViewById(R.id.pager);
        mViewPager.setAdapter(homePagerAdapter);
        return rootView;
    }
}
