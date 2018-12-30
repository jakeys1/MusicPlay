package com.example.owner.musicplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class inflatorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_play_list);

   ArrayList<Song> hits = new ArrayList<Song>();
        /*hits.add(new Song("Dance This Way", "Jack Rugby", R.drawable.inflatorart));
        hits.add(new Song("Great Balls of Hearts", "Jack Rugby", R.drawable.inflatorart));
        hits.add(new Song("Three", "Smiths", R.drawable.inflatorart));
        hits.add(new Song("Truly Madly Beating", "Leon Strife", R.drawable.inflatorart));
        hits.add(new Song("Kirstin Eat My Beating Heart", "Jack Rugby", R.drawable.inflatorart));
        */SongAdapter adapter = new SongAdapter(this, hits, 0);
        ListView listView = findViewById(R.id.track_list);
        listView.setAdapter(adapter);
    }

}
