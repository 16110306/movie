package com.example.jie.moviejie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MovieDetails extends AppCompatActivity {
    private TextView title , releaseDate , voteAverage, synopsis;
    private ImageView poster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moviejie);
        title = (TextView) findViewById(R.id.title);
        releaseDate = (TextView) findViewById(R.id.releaseDate);
        voteAverage = (TextView) findViewById(R.id.vote_average);
        synopsis = (TextView) findViewById(R.id.synopsis_tv);
        poster = (ImageView) findViewById(R.id.poster);
        Intent intent = getIntent();
        if(intent != null){
            if(intent.hasExtra("title")){
                title.setText(intent.getStringExtra("title"));
            }

            if(intent.hasExtra("posterImageLink")){
                Picasso.with(poster.getContext()).load(intent.getStringExtra("posterImageLink")).into(poster);
            }

            if(intent.hasExtra("synopsis")){
                synopsis.setText(intent.getStringExtra("synopsis"));
            }

            if(intent.hasExtra("rating")){
                voteAverage.setText(intent.getStringExtra("rating"));
            }

            if (intent.hasExtra("releaseDate")){
                releaseDate.setText(intent.getStringExtra("releaseDate"));
            }
        }
    }


}
