package com.example.root.submission_4_basis_data;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.root.submission_4_basis_data.fragment.FavoriteFragment;
import com.example.root.submission_4_basis_data.fragment.PopularMovieFragment;
import com.example.root.submission_4_basis_data.helper.database.FavoriteDataHelper;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class HomeActivity extends AppCompatActivity {
    FavoriteDataHelper dbcenter;
    private Button btn;
    private Button btnelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        dbcenter = new FavoriteDataHelper(this);

//        if (savedInstanceState == null){
            FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                    getSupportFragmentManager(), FragmentPagerItems.with(this)
                    .add(R.string.string_popular_movie, PopularMovieFragment.class)
                    .add(R.string.string_favorite, FavoriteFragment.class)
                    .create());

            ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
            viewPager.setAdapter(adapter);

            SmartTabLayout viewPagerTab = (SmartTabLayout) findViewById(R.id.viewpagertab);
            viewPagerTab.setViewPager(viewPager);
//        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        Fragment fragment = null;
//        if (resultCode == 1 && requestCode == 3) {
//            fragment = new PopularMovieFragment();
//        } else if (resultCode == 2) {
//            fragment = new FavoriteFragment();
//        }
//
//        if (fragment != null) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.viewpager, fragment).commit();
//        }
    }
}
