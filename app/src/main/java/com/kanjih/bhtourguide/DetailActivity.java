package com.kanjih.bhtourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.kanjih.bhtourguide.to.Place;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG = DetailActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent myIntent = getIntent();

        Place place = (Place) myIntent.getSerializableExtra("place");

        ImageView imageView = (ImageView) findViewById(R.id.detail_image_header);

        if(place.getImageScreenResource() > 0 ) {
            imageView.setImageResource(place.getImageScreenResource());
        }else {
            imageView.setImageResource(place.getImageResourseId());
        }

        TextView textViewTitle = (TextView) findViewById(R.id.detail_title_label);
        textViewTitle.setText(place.getName());


        TextView textViewDescription = (TextView) findViewById(R.id.detail_description_label);
        textViewDescription.setText(place.getDescriptionStringId());
        textViewDescription.setMovementMethod(new ScrollingMovementMethod());




    }
}
