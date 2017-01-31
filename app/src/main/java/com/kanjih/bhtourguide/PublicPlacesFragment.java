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

public class PublicPlacesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        //Praca da liberdade
        places.add(new Place(R.string.freedom_square_title, R.string.freedom_square, R.string.freedom_square_small_desc,R.drawable.praca_da_liberdade,R.drawable.praca_da_liberdade));
        //igreja da pampulha
        places.add(new Place(R.string.church_assisi_title,R.string.church_assisi, R.string.church_assisi_small_desc, R.drawable.igreja_sao_francisco,R.drawable.igreja_sao_francisco));
        //mercado central
        places.add(new Place(R.string.central_market_title,R.string.central_market, R.string.central_market_small_desc, R.drawable.mercado_central,R.drawable.mercado_central));
        //Parque Mangabeiras
        places.add(new Place(R.string.mangabeira_title,R.string.mangabeira,R.string.mangabeira_small_desc, R.drawable.parque_mangabeira,R.drawable.parque_mangabeira));


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
