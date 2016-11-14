package sdguideapp.jd.com.sandiegoguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class SanDiegoTourActivity extends AppCompatActivity {

    private ViewPager mPager;
    private PopularFragmentPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_diego_tour);
        mPager = (ViewPager) findViewById(R.id.view_pager);
        mViewPagerAdapter = new PopularFragmentPagerAdapter(getSupportFragmentManager(), this);
        mPager.setAdapter(mViewPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(mPager);
    }
}
