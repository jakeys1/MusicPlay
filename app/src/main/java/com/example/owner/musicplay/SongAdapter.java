package com.example.owner.musicplay;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

        //Resource id for background color of list
        private int mColorResourceId;

        public SongAdapter(Activity context, ArrayList<Song> Song, int colorResourceId) {
            super(context, 0, Song);
            mColorResourceId = colorResourceId;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            // check if the current view is reused else inflate the view
            View listView = convertView;
            if(listView == null){
                listView = LayoutInflater.from(getContext()).inflate(R.layout.list, parent, false);
            }

            //get the object located at position
            Song currentSong = getItem(position);

            //find the textview in list_item with id default_text_view
            TextView composerTextView = listView.findViewById(R.id.songComp_Text);
            //gets the song composer and set it to the text of this textView
            composerTextView.setText(currentSong.getSongComposer());

            //find the textview in list_item with id song_text_view
            TextView songTextView = listView.findViewById(R.id.songTitle_Text);
            //gets the song title and set it to the text of this textView
            songTextView.setText(currentSong.getSongTitle());
            //finds the imageview for the album art
            ImageView ImageView = listView.findViewById(R.id.image);
            if(currentSong.hasImage()) {
                //gets the album art to display to screen
                ImageView.setImageResource(currentSong.getImageResourceId());
            }
            else {
                ImageView.setVisibility(View.GONE);
            }
            return listView;
        }
    }
