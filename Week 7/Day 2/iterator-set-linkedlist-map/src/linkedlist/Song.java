package linkedlist;
import java.util.Objects;

public class Song {
    
    // state
    private String title;
    private String artist;

    // constructors
    public Song() {
    }

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // getters and setters
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Song)) {
            return false;
        }
        Song song = (Song) o;
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

    @Override
    public String toString() {
        return "title='" + getTitle() + "'" +
            ", artist='" + getArtist() + "'";
    }
}
