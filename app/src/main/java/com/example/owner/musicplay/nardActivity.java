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
/*
        hits.add(new Song("Nard Goin' to do it", "Anthony Lang", R.drawable.nardart));
        hits.add(new Song("Smoothe Rhapsody", "Lucky Bucks", R.drawable.nardart));
        hits.add(new Song("Can't Take My Shoes Off You", "Lil' Nard", R.drawable.nardart));
        hits.add(new Song("The Number of your Friend", "Anthony Lang", R.drawable.nardart));
        hits.add(new Song("Stand by Your Friend", "Tyler Fresco", R.drawable.nardart));
        hits.add(new Song("Every Friend You Take", "Victoria Yoko", R.drawable.nardart));
        hits.add(new Song("Straight Outta Takata", "Anthony Lang", R.drawable.nardart));
        hits.add(new Song("Born Smoothe", "Lil ' Frank Litty", R.drawable.nardart));
        hits.add(new Song("Early Morning Clubbing", "Victoria Yoko", R.drawable.nardart));
        hits.add(new Song("Here Without A Friend", "Lil' Nard", R.drawable.nardart));
*/

        SongAdapter adapter = new SongAdapter(this, hits, 0);
        ListView listView = findViewById(R.id.track_list);
        listView.setAdapter(adapter);

    }
}
