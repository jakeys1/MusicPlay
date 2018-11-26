package com.example.owner.musicplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class  dumoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // getActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_play_list);

        ArrayList<Song> hits = new ArrayList<Song>();
        hits.add(new Song("Good Money", "Dumo", R.drawable.dumoart));
        hits.add(new Song("Hotel Detroit", "Dumo", R.drawable.dumoart));
        hits.add(new Song("Stairway to Money feat. T.A.N.K", "T.A.N.K", R.drawable.dumoart));
        hits.add(new Song("My Name is Dumo", "Dumo", R.drawable.dumoart));
        hits.add(new Song("Money Deep, Cars High", "Anthony Lang", R.drawable.dumoart));

        SongAdapter adapter = new SongAdapter(this, hits, 0);
        ListView listView = (ListView) findViewById(R.id.track_list);
        listView.setAdapter(adapter);
    }
}
