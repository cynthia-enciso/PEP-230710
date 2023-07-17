package com.revature.numbers;

public class ValidationUtil {
    
    public static boolean isInRange(int min, int max, int input) {
        // example using if statement
        // if (input >= 5 && input <= 100) {
        //     return true;
        // } else {
        //     return false;
        // }

        return input >= min && input <= max;


    }
}
