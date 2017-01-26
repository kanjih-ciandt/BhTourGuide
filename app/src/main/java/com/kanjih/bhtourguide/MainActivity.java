package com.kanjih.bhtourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.kanjih.bhtourguide.adapters.PlaceAdapter;
import com.kanjih.bhtourguide.to.Place;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Freedom Square","bla.....", R.mipmap.square));
        places.add(new Place("The Church of St. Francis of Assisi ","bla.....", R.mipmap.church_assis));
        places.add(new Place("Central Market","bla.....", R.mipmap.central_market));
        places.add(new Place("Mangabeira Park","bla.....", R.mipmap.mangabeira));


        PlaceAdapter placeAdapter = new PlaceAdapter(this, places,0);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdapter);





    }
}
