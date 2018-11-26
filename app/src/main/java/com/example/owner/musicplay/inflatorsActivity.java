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
        hits.add(new Song("Dance This Way", "Jack Rugby"));
        hits.add(new Song("Great Balls of Hearts", "Jack Rugby"));
        hits.add(new Song("Three", "Smiths"));
        hits.add(new Song("Truly Madly Beating", "Leon Strife"));
        hits.add(new Song("Kirstin Eat My Beating Heart", "Jack Rugby"));
        SongAdapter adapter = new SongAdapter(this, hits, 0);
        ListView listView = (ListView) findViewById(R.id.track_list);
        listView.setAdapter(adapter);
    }
}
