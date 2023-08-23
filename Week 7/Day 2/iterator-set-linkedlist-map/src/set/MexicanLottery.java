package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// mexican lottery is where there are boards of images and a deck of matching cards.
// the cards are shuffled and the images are called out
// whoever's board images have all matched the winning cards first is the winner!

public class MexicanLottery {
    public static void main(String[] args) {
        // card deck
        Set<String> cardDeck = new HashSet<>();
        Collections.addAll(cardDeck, "The Rooster",
                "The Tree",
                "The Drunkard",
                "The World",
                "The Shrimp",
                "The Sun",
                "The Flowerpot",
                "The Frog",
                "The Hand",
                "The Boot",
                "The Palm Tree",
                "The Fish",
                "The Little Devil",
                "The Lady",
                "The Barrel",
                "The Umbrella");

        // boards
        Set<String> board1 = new HashSet<>();
        Collections.addAll(board1, "The Tree", "The Drunkard", "The World", "The Fish");
        Set<String> board2 = new HashSet<>();
        Collections.addAll(board2, "The Boot", "The Little Devil", "The Lady", "The Sun");
        Set<String> board3 = new HashSet<>();
        Collections.addAll(board3, "The Lady", "The World", "The Palm Tree", "The Fish");

        // set operations
        Set<String> unionSet = new HashSet<>();
        unionSet.addAll(board1);
        unionSet.addAll(board2);
        System.out.println("Union of board 1 and 2: \n" + unionSet);

        // no duplicates + insertion order kept
        Set<String> unionSet2 = new LinkedHashSet<>();
        unionSet2.addAll(board1);
        unionSet2.addAll(board3);
        System.out.println("Union of board 1 and 3: \n" + unionSet2);

        Set<String> intersectSet = new HashSet<>(board1);
        intersectSet.retainAll(board3);
        System.out.println("Intersection of board 1 and 3: \n" + intersectSet);

        Set<String> differenceSet = new HashSet<>(board1);
        differenceSet.removeAll(board3);
        System.out.println("Difference of board 1 and 3: \n" + differenceSet);

        // functionality that draws cards and check if a board wins
        System.out.println("Let's start the lottery:");
        Iterator<String> iterator = cardDeck.iterator();

        while (iterator.hasNext()) {
            // call the card out
            String nextCard = iterator.next();
            System.out.println( nextCard + "!");

            // check for matches
            if (board1.contains(nextCard)) {
                board1.remove(nextCard);
            }

            if (board2.contains(nextCard)) {
                board2.remove(nextCard);
            }

            if (board3.contains(nextCard)) {
                board3.remove(nextCard);
            }

            // check for winners
            boolean someoneWon = false;

            if (board1.isEmpty()) {
                System.out.println("Player with board 1 wins!");
                someoneWon = true;
            }

            if (board2.isEmpty()) {
                System.out.println("Player with board 2 wins!");
                someoneWon = true;
            }

            if (board3.isEmpty()) {
                System.out.println("Player with board 3 wins!");
                someoneWon = true;
            }

            if (someoneWon) {
                break;
            }
        }
    }
}
