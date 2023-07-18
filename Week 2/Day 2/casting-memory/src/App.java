import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // comparingStrings();

        int[] myArray = {1, 2, 3, 4, 5};
        passingArray(myArray);
        System.out.println("Array after manipulation: " + Arrays.toString(myArray));

        int myNum = 10;
        System.out.println("myNum before method call: " + myNum);
        passingPrimitive(myNum);
        System.out.println("myNum after method call: " + myNum);

    }

    public static void castingAndWrapping() {
        // upcasting
        int x = 5;
        double y = x;

        // downcasting
        double a = 10.0;
        // int b = (int) Math.round(a); // returns a long, still larger than int
        int b = (int) a;

        // wrappers
        double c = 10.0;
        Double doubleWrapper = c;

        Integer intWrapper = 5;
        int d = intWrapper;

        String myNum = "5";
        int e = Integer.parseInt(myNum);
    }

    public static void comparingStrings() {
        // String literals
        String string1 = "banana";
        String string2 = "banana";
        String string3 = new String("banana");

        // compare String
        System.out.println("Are string1 and string2 pointing to the same object? " + (string1 == string2));
        System.out.println("Are string1 and string3 pointing to the same object? " + (string1 == string3));

        // re-assigning string2
        string2 = "bananas";
        System.out.println("Are string1 and string2 pointing to the same object? " + (string1 == string2));

        // check for equivalency - equals
        System.out.println("Are the objects pointed to by string1 and string3 equivalent? " + (string3.equals(string1)));

        // being wary of ==
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a word: ");
        String wordReceived = scanner.next();

        System.out.println("Comparing with == : " + ("banana" == wordReceived));
        System.out.println("Comparing with equals : " + ("banana".equals(wordReceived)));

    }

    public static void passingArray(int[] array) {
        array[0] = 10;
    }

    public static void passingPrimitive(int num) {
        num = 5;
        System.out.println("Value of num (within method): " + num);
    }
}
