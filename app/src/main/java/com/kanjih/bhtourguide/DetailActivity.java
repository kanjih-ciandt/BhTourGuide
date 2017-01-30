package com.kanjih.bhtourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.kanjih.bhtourguide.to.Place;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent myIntent = getIntent();

        Place place = (Place) myIntent.getSerializableExtra("place");

        ImageView imageView = (ImageView) findViewById(R.id.image_detail);

        if(place.getImageScreenResource() > 0 ) {
            imageView.setImageResource(place.getImageScreenResource());
        }else {
            imageView.setImageResource(place.getImageResourseId());
        }



    }
}
