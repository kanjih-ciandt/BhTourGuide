package com.kanjih.bhtourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.kanjih.bhtourguide.adapters.PlaceAdapter;
import com.kanjih.bhtourguide.to.Place;

import java.util.ArrayList;

/**
 * Created by kneto on 1/31/17.
 */

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.xapuri_title, R.string.xapuri, R.string.xapuri_small_desc,R.drawable.xapuri,R.drawable.xapuri));
        places.add(new Place(R.string.nutreal_title, R.string.nutreal, R.string.nutreal_small_desc,R.drawable.nutreal,R.drawable.nutreal));
        places.add(new Place(R.string.gluton_title, R.string.gluton, R.string.gluton_small_desc,R.drawable.glou1,R.drawable.glou1));


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places,0);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place currentPlace = places.get(position);
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra(Place.class.getSimpleName(), currentPlace);
                startActivity(intent);

            }
        });


        return  rootView;

    }
}
