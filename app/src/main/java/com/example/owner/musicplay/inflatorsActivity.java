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
        hits.add(new Song(R.string.dance, R.string.jack, R.drawable.inflatorart));
        hits.add(new Song(R.string.hearts, R.string.jack, R.drawable.inflatorart));
        hits.add(new Song(R.string.three, R.string.smiths, R.drawable.inflatorart));
        hits.add(new Song(R.string.truly, R.string.leon, R.drawable.inflatorart));
        hits.add(new Song(R.string.eat, R.string.jack, R.drawable.inflatorart));

        SongAdapter adapter = new SongAdapter(this, hits, 0);
        ListView listView = findViewById(R.id.track_list);
        listView.setAdapter(adapter);
    }

}
