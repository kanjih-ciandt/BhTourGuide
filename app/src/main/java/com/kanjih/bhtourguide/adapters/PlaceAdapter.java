package com.kanjih.bhtourguide.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kanjih.bhtourguide.R;
import com.kanjih.bhtourguide.to.Place;
import de.hdodenhof.circleimageview.CircleImageView;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by kneto on 1/24/17.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    private static final String LOG_TAG = PlaceAdapter.class.getSimpleName();

    private int colorResource;


    public PlaceAdapter(Activity context, ArrayList<Place> words, int colorResource) {
        super(context, 0, words);
        this.colorResource = colorResource;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        View textView = convertView.findViewById(R.id.text_container);
        textView.setBackgroundResource(colorResource);

        // Get the {@link AndroidFlavor} object located at this position in the list
        Place currentPlace = getItem(position);

        //get screem elements
        TextView title = (TextView) convertView.findViewById(R.id.place_title);
        TextView smallDescription = (TextView) convertView.findViewById(R.id.place_small_description);
        CircleImageView imageView = (CircleImageView) convertView.findViewById(R.id.image);

        title.setText(currentPlace.getName());
        smallDescription.setText(currentPlace.getSmallDescription());

        if(currentPlace.getImageResourseId() > 0) {
            imageView.setImageResource(currentPlace.getImageResourseId());

        } else {
            imageView.setVisibility(ImageView.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return convertView;
    }


}
