package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStream {
    public static void main(String[] args) {
        // ================ CREATING STREAMS =====================

        // from a collection
        ArrayList<String> wordCollection = new ArrayList<>();
        wordCollection.add("word1");
        wordCollection.add("word2");
        wordCollection.add("word3");
        
        Stream<String> streamCreatedByCollection = wordCollection.stream();

        // from an array
        String[] wordArray = {"word1", "word2", "word3"};
        Stream<String> streamCreatedByArray = Arrays.stream(wordArray);

        // inline
        Stream<String> streamCreatedInline = Stream.of("word1", "word2", "word3");

        // ================ INFINITE STREAMS ======================
        Stream<Integer> evenNums = Stream.iterate(0, num -> num + 2);
        evenNums.limit(10).forEach(num -> System.out.println(num));

        Stream<Integer> randNums = Stream.generate(() -> (int) (Math.random() * 10 + 1));
        randNums.limit(5).forEach(num -> System.out.println(num));

        // ================ COMMON OPERATIONS ====================

        // terminal: return a value or nothing at all

        // reduce: takes in an identity (starting value, and a binary operator)
        // binary operator: take in two values, return value of same type
        String concat = streamCreatedByArray.reduce("", (x, y) -> x + y);
        System.out.println(concat);

        // collect: returns a mutable container
        List<String> myList = streamCreatedInline.collect(Collectors.toList());
        System.out.println(myList);

        // adding intermediates: return a stream

        Stream<Integer> numberStream = Stream.of(6, 9, 1, 4, 2, 10, 8, 7, 3, 5);
        List<Integer> sortedEvenNumbers = numberStream.filter(num -> num % 2 == 0).sorted().collect(Collectors.toList());
        System.out.println(sortedEvenNumbers);

        Stream<Integer> numberStream2 = Stream.of(6, 9, 1, 4, 2, 10, 8, 7, 3, 5, 6);
        numberStream2.distinct().map(num -> num * 10).forEach(num -> System.out.println(num));
    }
}
