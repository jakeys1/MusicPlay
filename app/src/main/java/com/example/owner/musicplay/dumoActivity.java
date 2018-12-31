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
        hits.add(new Song(R.string.good_money, R.string.dumo, R.drawable.dumoart));
        hits.add(new Song(R.string.hotel_detroit, R.string.dumo, R.drawable.dumoart));
        hits.add(new Song(R.string.stairway, R.string.tank, R.drawable.dumoart));
        hits.add(new Song(R.string.my_name, R.string.dumo, R.drawable.dumoart));
        hits.add(new Song(R.string.good_money, R.string.ant_l, R.drawable.dumoart));

        SongAdapter adapter = new SongAdapter(this, hits, 0);
        ListView listView = findViewById(R.id.track_list);
        listView.setAdapter(adapter);
    }
}
