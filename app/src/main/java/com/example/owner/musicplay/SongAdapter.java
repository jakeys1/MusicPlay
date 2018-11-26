package com.example.owner.musicplay;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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
            Song music_item = getItem(position);

            //find the textview in list_item with id default_text_view
            TextView composerTextView = (TextView) listView.findViewById(R.id.songComp_Text);
            //gets the song composer and set it to the text of this textView
            composerTextView.setText(music_item.getSongComposer());

            //find the textview in list_item with id miwok_text_view
            TextView songTextView = (TextView) listView.findViewById(R.id.songTitle_Text);
            //gets the song title and set it to the text of this textView
            songTextView.setText(music_item.getSongTitle());

            return listView;
        }
    }
