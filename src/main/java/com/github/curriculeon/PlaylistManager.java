package com.github.curriculeon;


import java.util.List;

public class PlaylistManager {

    private Playlist playlist;

    public PlaylistManager(String[] songs) {
        setPlaylist(songs);
    }

    public PlaylistManager(List<String> songs) {
        setPlaylist(songs.toArray(new String[0]));
    }

    public PlaylistManager() {
        setPlaylist(new Playlist(new String[0]));
    }

    public Playlist getPlaylist() {
        return null;
    }

    public void setPlaylist(Playlist playlist) {
    }

    private void setPlaylist(String[] toArray) {
    }

    public void addSong(String songToAdd) {
    }

    public void removeSong(String songToRemove) {
    }

    public void printAll() {
    }
}
