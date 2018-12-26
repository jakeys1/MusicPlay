package com.example.owner.musicplay;

public class Song {
    //Song title
    private int mSongTitleId;
    //Song composer
    private int mSongComposerId;
    //Song image
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    //
    private final static int NO_IMAGE_PROVIDED = -1;


    public Song(int songTitleId, int songComposerId){
        mSongComposerId = songComposerId;
        mSongTitleId = songTitleId;
        }

    public Song(int songTitleId, int songComposerId, int imageResourceId){
        mSongComposerId = songComposerId;
        mSongTitleId = songTitleId;
        mImageResourceId = imageResourceId;
    }
    //Get Song composer
    public int getSongComposer() {
        return mSongComposerId;
    }
    //Get Song Title

    public int getSongTitle() {
        return mSongTitleId;
    }
    //Return the image resource id for the song
    public int getImageResourceId() {
        return mImageResourceId;
    }
    //Checks for song image
    public boolean hasImage(){ return mImageResourceId != NO_IMAGE_PROVIDED;
}
}