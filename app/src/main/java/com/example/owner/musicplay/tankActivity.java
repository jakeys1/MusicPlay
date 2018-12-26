package com.example.owner.musicplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class tankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_play_list);
        ArrayList<Song> hits = new ArrayList<Song>();
        hits.add(new Song("Dreams of My Wife", "T.A.N.K", R.drawable.tankart));
        hits.add(new Song("When Fresh Dreams Cry", "Victoria Yoko", R.drawable.tankart));
        hits.add(new Song("Loving, Loving, Loving!", "T.A.N.K", R.drawable.tankart));
        hits.add(new Song("Night Boogie", "T.A.N.K", R.drawable.tankart));
        hits.add(new Song("Born Fresh", "Victoria Yoko",R.drawable.tankart));
        hits.add(new Song("Have You Met Love?", "T.A.N.K", R.drawable.tankart));

        SongAdapter adapter = new SongAdapter(this, hits, 0);
        ListView listView = findViewById(R.id.track_list);
        listView.setAdapter(adapter);
    }
}
