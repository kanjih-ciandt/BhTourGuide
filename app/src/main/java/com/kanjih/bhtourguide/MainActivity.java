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
        places.add(new Place("Freedom Square","bla.....", R.mipmap.square));
        places.add(new Place("The Church of St. Francis of Assisi ","bla.....", R.mipmap.church_assis));
        places.add(new Place("Central Market","bla.....", R.mipmap.central_market));
        places.add(new Place("Mangabeira Park","bla.....", R.mipmap.mangabeira,R.drawable.mangabeira));


        PlaceAdapter placeAdapter = new PlaceAdapter(this, places,0);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place currentPlace = places.get(position);
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("place", currentPlace);
                startActivity(intent);

            }
        });





    }
}
