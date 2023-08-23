package iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UsingIterators {
    public static void main(String[] args) {
        
        // unmodifiable if using of() method defined in interfaces
        // List<Integer> unmodifiableList = List.of(1, 2, 3, 4, 5, 6, 7, 7, 8);

        // modifiable list
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();

            // ConcurrentModificationException
            // cannot modify using collection methods while iterating using iterator
            // list.remove(iterator.next()); 
        }

        
            System.out.println("after while loop");

        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
