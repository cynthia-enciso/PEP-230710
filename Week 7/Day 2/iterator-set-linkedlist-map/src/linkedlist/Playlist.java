package linkedlist;

import java.util.LinkedList;
import java.util.Objects;

public class Playlist {

    // state   
    private LinkedList<Song> songs = new LinkedList<>();

    // constructors
    public Playlist() {
    }

    public Playlist(LinkedList<Song> songs) {
        this.songs = songs;
    }

    // getters and setters
    public LinkedList<Song> getSongs() {
        return this.songs;
    }

    public void setSongs(LinkedList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Playlist)) {
            return false;
        }
        Playlist playlist = (Playlist) o;
        return Objects.equals(songs, playlist.songs);
    }

    @Override
    public int hashCode() {
        return songs.hashCode();
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < songs.size(); i++) {
            // so there isn't unnecessary whitespace before the first song
            if (i != 0) {
                result += "\n"; 
            }

            result += (i + 1) + " [" + songs.get(i) + "]";
        }

        return result;
    }
    
}
