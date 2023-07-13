import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        
        // creating arrays
        int[] array = new int[5];
        int[] array2 = {1, 2, 3, 4, 5}; // length is 5
        //              0  1  2  3  4

        // accessing elements
        System.out.println(array[0]);
        System.out.println(array2[1]);

        // accessing last element
        int lastElementIndex = array2.length - 1;
        System.out.println(array2[lastElementIndex]);

        // printing arrays
        System.out.println(array2); // not meaningful
        System.out.println(Arrays.toString(array2)); // more meaningful
        System.out.println(array2.toString()); // still not meaningful

        // iterating over arrays
        for (int index = 0; index <= array2.length; index++) {
            System.out.println(array2[index]);
        }
    }
}
