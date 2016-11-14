package sdguideapp.jd.com.sandiegoguideapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Extends fragment pager adapter to support
 * custom screen and list view with pager support for swiping
 * between screens
 */

public class PopularFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public PopularFragmentPagerAdapter(FragmentManager fm, Context ctx) {
        super(fm);
        this.context = ctx;
    }

    @Override
    public Fragment getItem(int position) {

        PopularFragment resView = null;
        Bundle bundle;
        switch (position) {
            case AppConsts.SIGHT_SEEING_POS:
                resView = new PopularFragment();
                break;
            case AppConsts.RESTAURANTS_POS:
                resView = new PopularFragment();
                break;
            case AppConsts.EVENT_POS:
                resView = new PopularFragment();
                break;
            case AppConsts.ARTIST_POS:
                resView = new PopularFragment();
                break;
            default:
                Log.d(AppConsts.TAG, "Wrong fragment position. Should not get in default case");
        }
        /* set bundle to initialize the correct data*/
        bundle = new Bundle();
        bundle.putInt(AppConsts.POS_KEY, position);
        resView.setArguments(bundle);
        return resView;
    }

    @Override
    public int getCount() {
        return 4;
    }

    /* to get page name with this */
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case AppConsts.SIGHT_SEEING_POS:
                return (context.getString(R.string.places));
            case AppConsts.RESTAURANTS_POS:
                return (context.getString(R.string.restaurants));
            case AppConsts.ARTIST_POS:
                return (context.getString(R.string.artist));
            case AppConsts.EVENT_POS:
                return (context.getString(R.string.events));
            default:
                Log.d(AppConsts.TAG, " Something wrong. Should not get here");
                return "";
        }


    }
}
