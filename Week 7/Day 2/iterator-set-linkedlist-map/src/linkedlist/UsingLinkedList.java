package linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class UsingLinkedList {
    public static void main(String[] args) {
        // create our playlist
        LinkedList<Song> songsToAdd = new LinkedList<>();
        
        Collections.addAll(songsToAdd,  new Song("Respect", "Aretha Franklin"),
                                        new Song("Like a Rolling Stone", "Bob Dylan"),
                                        new Song("Smells Like Teen Spirit", "Nirvana"),
                                        new Song("Dreams", "Fleetwood Mac"),
                                        new Song("Gimme Shelter", "The Rolling Stones"));

        Playlist myFavoriteSongs = new Playlist(songsToAdd);
        System.out.println("Playlist at beginning:");
        System.out.println(myFavoriteSongs);

        // using indexes: change third favorite song
        myFavoriteSongs.getSongs().add(2, new Song("Bohemian Rhapsody", "Queen"));
        System.out.println("Playlist after insertion:");
        System.out.println(myFavoriteSongs);

        // my new absolute favorite song is now ....
        myFavoriteSongs.getSongs().addFirst(new Song("Born to Run", "Bruce Springsteen"));
        System.out.println("Favorite Songs with new favorite song:");
        System.out.println(myFavoriteSongs);

        // I got tired of the very last song on my playlist, whichever position it is in
        myFavoriteSongs.getSongs().removeLast();
        System.out.println("Favorite Songs with last song removed:");
        System.out.println(myFavoriteSongs);

        // iterate backwards using a ListIterator
        //  if we had a list of 2 elements:

        // song1  song2
        //   0      1
        //               ^
        //             iterator start position
        System.out.println("Looking at playlist from backwards to forwards:");
        int positionToStartAt = myFavoriteSongs.getSongs().size();
        ListIterator<Song> listIterator = myFavoriteSongs.getSongs().listIterator(positionToStartAt);

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        

    }
}
