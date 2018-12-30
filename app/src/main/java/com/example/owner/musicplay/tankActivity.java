
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
        hits.add(new Song(R.string.dream, R.string.tank, R.drawable.tankart));
        hits.add(new Song(R.string.cry, R.string.yoko, R.drawable.tankart));
        hits.add(new Song(R.string.loving, R.string.tank, R.drawable.tankart));
        hits.add(new Song(R.string.boogie, R.string.tank, R.drawable.tankart));
        hits.add(new Song(R.string.fresh, R.string.yoko,R.drawable.tankart));
        hits.add(new Song(R.string.luv, R.string.tank, R.drawable.tankart));

        SongAdapter adapter = new SongAdapter(this, hits, 0);
        ListView listView = findViewById(R.id.track_list);
        listView.setAdapter(adapter);
    }
}

