package sdguideapp.jd.com.sandiegoguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by chuondao on 11/4/16.
 */

public class PopularFragment extends Fragment {


    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View uiView = inflater.inflate(R.layout.fragment_view_layout, null);
        int pos = getArguments().getInt(AppConsts.POS_KEY); // get fragment position
        listView = (ListView) uiView.findViewById(R.id.fragment_list_view);
        updateArrayAdapterData(pos);
        return uiView;
    }


    private void updateArrayAdapterData(int pos) {
        PopularObjectAdapter popObjectAdapter;
        switch (pos) {
            case AppConsts.SIGHT_SEEING_POS:
                popObjectAdapter = new PopularObjectAdapter(getContext(),
                        initSightSeeingArrayList());
                listView.setAdapter(popObjectAdapter);
                break;
            case AppConsts.RESTAURANTS_POS:
                popObjectAdapter = new PopularObjectAdapter(getContext(),
                        initRestaurants());
                listView.setAdapter(popObjectAdapter);
                break;
            default:
                Log.d(AppConsts.TAG, "Should not get here as we dont support");
        }
    }

    /**
     * Init place and
     */
    private ArrayList<PopularObject> initSightSeeingArrayList() {
        ArrayList<PopularObject> arrayList = new ArrayList<>();
        // add coronado
        arrayList.add(
                new PopularObject(
                        getString(R.string.coronado_description),
                        R.drawable.coronado,
                        getString(R.string.coronado),
                        ""
                )
        );

        // Adding seaworld
        arrayList.add(
                new PopularObject(
                        getString(R.string.seaworld_san_diego_description),
                        R.drawable.sea_world_sd,
                        getString(R.string.seaworld),
                        ""
                )
        );

        // Adding san diego zoo
        arrayList.add(
                new PopularObject(
                        getString(R.string.san_diego_zoo_description),
                        R.drawable.san_diego_zoo,
                        getString(R.string.san_diego_zoo_title),
                        ""
                )
        );

        // Adding balboa park
        arrayList.add(
                new PopularObject(
                        getString(R.string.balboa_park_description),
                        R.drawable.balboa_park,
                        getString(R.string.balboa_park_title),
                        ""
                )
        );

        return arrayList;
    }


    /**
     * Init place and
     */
    private ArrayList<PopularObject> initRestaurants() {
        ArrayList<PopularObject> arrayList = new ArrayList<>();
        // add sushi ota
        arrayList.add(
                new PopularObject(
                        getString(R.string.sushi_ota_description),
                        R.drawable.sushi_ota,
                        getString(R.string.sushi_ota),
                        ""
                )
        );

        // Adding buga
        arrayList.add(
                new PopularObject(
                        getString(R.string.buga_bbq_description),
                        R.drawable.buga_bbq,
                        getString(R.string.buga_bbq),
                        ""
                )
        );

        // Adding san crab hut
        arrayList.add(
                new PopularObject(
                        getString(R.string.crab_hut_description),
                        R.drawable.crab_hut,
                        getString(R.string.crab_hut),
                        ""
                )
        );

        return arrayList;
    }
}
