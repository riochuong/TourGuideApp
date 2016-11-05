package sdguideapp.jd.com.sandiegoguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by chuondao on 11/4/16.
 */

public class PopularObjectAdapter extends ArrayAdapter<PopularObject> {

    private static final int POS_BALBOA = 0;
    private static final int POS_CORONADO = 1;
    private static final int POS_SAN_DIEGO_ZOO = 2;
    private static final int POS_SEAWORLD = 3;

    public PopularObjectAdapter(Context context, ArrayList<PopularObject> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        PopularObject popObj = null;
        TextView title;
        TextView description;
        ImageView iconRes;

        PopularObject item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.popular_item_layout,
                    parent, false);

        }
        /* get these to set correspondent value*/
        title = (TextView) convertView.findViewById(R.id.title);
        description = (TextView) convertView.findViewById(R.id.description);
        iconRes = (ImageView) convertView.findViewById(R.id.image_icon);

        title.setText(item.getTitle());
        description.setText(item.getDescription());
        iconRes.setImageResource(item.getPictureSource());

        return convertView;
    }
}
