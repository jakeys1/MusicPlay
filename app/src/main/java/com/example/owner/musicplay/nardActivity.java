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
        hits.add(new Song("Nard Goin' to do it", "Anthony Lang"));
        hits.add(new Song("Smoothe Rhapsody", "Lucky Bucks"));
        hits.add(new Song("Can't Take My Shoes Off You", "Lil' Nard"));
        hits.add(new Song("The Number of your Friend", "Anthony Lang"));
        hits.add(new Song("Stand by Your Friend", "Tyler Fresco"));
        hits.add(new Song("Every Friend You Take", "Victoria Yoko"));
        hits.add(new Song("Straight Outta Takata", "Anthony Lang"));
        hits.add(new Song("Born Smoothe", "Lil ' Frank Litty"));
        hits.add(new Song("Early Morning Clubbing", "Victoria Yoko"));
        hits.add(new Song("Here Without A Friend", "Lil' Nard"));

        SongAdapter adapter = new SongAdapter(this, hits, 0);
        ListView listView = (ListView) findViewById(R.id.track_list);
        listView.setAdapter(adapter);

    }
}
