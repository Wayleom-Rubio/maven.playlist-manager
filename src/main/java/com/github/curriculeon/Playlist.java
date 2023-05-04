package com.github.curriculeon;

/**
 * Created by leon on 1/10/2021.
 */
public class Playlist {

    private int currentSong;
    private final String[] playlist;

    public Playlist(String[] songNameArray) {
        this(0,songNameArray);

    }

    public Playlist(int currentIndex, String[] songNameArray) {
        currentSong = currentIndex;
        playlist = songNameArray;
    }

    public String[] getSongNameArray() {
        return playlist;
    }

    public String getCurrentSelection() {
        return getSongNameArray()[currentSong];
    }

    public void goToPreviousSong() {
    }

    public void goToNextSong() {
    }

    public Integer getMinimumNumberOfStepsBetween(Integer currentIndex, String desiredSong) {
        return null;
    }

    public Integer getNumberOfStepsBetween(Integer currentIndex, String desiredSong, Runnable directionMutator) {
        return null;
    }

    public Integer getForwardNumberOfStepsBetween(Integer currentIndex, String desiredSong) {
        return null;
    }

    public Integer getBackwardNumberOfStepsBetween(Integer currentIndex, String desiredSong) {
        return null;
    }
}
