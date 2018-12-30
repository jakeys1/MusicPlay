package com.example.owner.musicplay;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ListView;

        import java.util.ArrayList;

public class nardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_play_list);

        ArrayList<Song> hits = new ArrayList<Song>();
        hits.add(new Song(R.string.goin, R.string.ant_l, R.drawable.nardart));
        hits.add(new Song(R.string.rhapsody, R.string.luck, R.drawable.nardart));
        hits.add(new Song(R.string.shoes, R.string.lil_nard, R.drawable.nardart));
        hits.add(new Song(R.string.friend, R.string.ant_l, R.drawable.nardart));
        hits.add(new Song(R.string.stand, R.string.fresco, R.drawable.nardart));
        hits.add(new Song(R.string.every_friend, R.string.yoko, R.drawable.nardart));
        hits.add(new Song(R.string.takata, R.string.ant_l, R.drawable.nardart));
        hits.add(new Song(R.string.born_smoothe, R.string.frank, R.drawable.nardart));
        hits.add(new Song(R.string.clubbing, R.string.yoko, R.drawable.nardart));
        hits.add(new Song(R.string.without, R.string.lil_nard, R.drawable.nardart));
        SongAdapter adapter = new SongAdapter(this, hits, 0);
        ListView listView = findViewById(R.id.track_list);
        listView.setAdapter(adapter);

    }
}
