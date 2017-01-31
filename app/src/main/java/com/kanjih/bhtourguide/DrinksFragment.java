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

public class DrinksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.valeverde_title, R.string.valeverde, R.string.valeverde_small_desc,R.drawable.valeverde,R.drawable.valeverde));
        places.add(new Place(R.string.boazinha_title, R.string.boaziha, R.string.boazinha_small_desc,R.drawable.boazinha,R.drawable.boazinha));
        places.add(new Place(R.string.maria_title, R.string.maria, R.string.maria_small_desc,R.drawable.maria,R.drawable.maria));


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
