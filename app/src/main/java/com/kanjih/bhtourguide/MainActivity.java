package com.kanjih.bhtourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.kanjih.bhtourguide.adapters.PlaceAdapter;
import com.kanjih.bhtourguide.to.Place;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        //Praca da liberdade
        places.add(new Place(R.string.freedom_square_title, R.string.freedom_square, R.string.freedom_square_small_desc,R.mipmap.square,R.drawable.praca_da_liberdade));
        //igreja da pampulha
        places.add(new Place(R.string.church_assisi_title,R.string.church_assisi, R.string.church_assisi_small_desc, R.mipmap.church_assis,R.drawable.igreja_sao_francisco));
        //mercado central
        places.add(new Place(R.string.central_market_title,R.string.central_market, R.string.central_market_small_desc, R.mipmap.central_market,R.drawable.mercado_central));
        //Parque Mangabeiras
        places.add(new Place(R.string.mangabeira_title,R.string.mangabeira,R.string.mangabeira_small_desc, R.mipmap.mangabeira,R.drawable.parque_mangabeira));


        PlaceAdapter placeAdapter = new PlaceAdapter(this, places,0);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place currentPlace = places.get(position);
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(Place.class.getSimpleName(), currentPlace);
                startActivity(intent);

            }
        });





    }
}
