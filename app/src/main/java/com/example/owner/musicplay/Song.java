package com.example.owner.musicplay;

public class Song {
    //Song title
    private String mSongTitle;
    //Song composer
    private String mSongComposer;
    //Song image
    private int mImageResourceId;


    public Song(String songTitle, String songComposer){
        mSongComposer = songComposer;
        mSongTitle = songTitle;
        }

    public Song(String songTitle, String songComposer, int imageResourceId){
        mSongComposer = songComposer;
        mSongTitle = songTitle;
        mImageResourceId = imageResourceId;
    }
    //Get Song composer
    public String getSongComposer() {
        return mSongComposer;
    }
    //Get Song Title

    public String getSongTitle() {
        return mSongTitle;
    }
    //Return the image resource id for the song
    public int getImageResourceId() {
        return mImageResourceId;
    }
}