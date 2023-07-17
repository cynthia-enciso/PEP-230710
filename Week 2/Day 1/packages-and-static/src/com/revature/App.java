package com.revature;
import java.util.Arrays;
import java.util.Scanner;

import com.revature.numbers.ValidationUtil;

public class App {

    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 130;

    public static void main(String[] args) {
        // get user input
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Please enter a username:");
        // String username = scanner.nextLine();
        // System.out.println("Please enter an age:");
        // int age = scanner.nextInt();

        // // call validation methods on the input
        // boolean ageIsValid = ValidationUtil.isInRange(MIN_AGE, MAX_AGE, age);
        // boolean usernameIsValid = com.revature.strings.ValidationUtil.hasSpecialCharacter(username);

        // // get results
        // System.out.println("Is username valid? " + usernameIsValid);
        // System.out.println("Is age valid? " + ageIsValid);

        // scanner.close();

        // local scope example
        int value1 = 5;
        int value2 = 10;
        System.out.println("Original value1 before method call: " + value1);
        System.out.println("Original value2 before method call: " + value2);
        
        // call method
        localScope(value1, value2);

        // print out original values
        System.out.println("Original value1 after method call: " + value1);
        System.out.println("Original value2 after method call: " + value2);
    }

    // other methods...
    public static void localScope(int val1, int val2) {
        // print original values of val1 and val2
        System.out.println("Value of val1 before modification: " + val1);
        System.out.println("Value of val2 before modification: " + val2);

        // reassign parameters
        val1 += 5;
        val2 += 5;

        // print out parameter values
        System.out.println("Value of val1 after modification: " + val1);
        System.out.println("Value of val2 after modification: " + val2);
    }

}
