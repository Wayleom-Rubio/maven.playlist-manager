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
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        if(playlist != null) this.playlist = playlist;
        else throw new IllegalArgumentException();
    }

    private void setPlaylist(String[] toArray) {
        setPlaylist(new Playlist(toArray));
    }

    public void addSong(String songToAdd) {
        String[] track = new String[playlist.getSongNameArray().length + 1];
        System.arraycopy(playlist.getSongNameArray(),0, track, 0, playlist.getSongNameArray().length);
        track[playlist.getSongNameArray().length] = songToAdd;
        setPlaylist(track);
    }

    public void removeSong(String songToRemove) {
    }

    public void printAll() {
    }
}
