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

public class PubsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.bebs_title, R.string.bebs, R.string.bebs_small_desc,R.drawable.bebs,R.drawable.bebs));
        places.add(new Place(R.string.duke_title, R.string.duke, R.string.duke_small_desc,R.drawable.duke,R.drawable.duke));
        places.add(new Place(R.string.quermesse_title, R.string.quermesse, R.string.quermesse_small_desc,R.drawable.quermesse,R.drawable.quermesse));


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
