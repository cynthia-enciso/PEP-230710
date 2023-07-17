package com.revature.strings;

public class ValidationUtil {
    
    public static boolean hasSpecialCharacter(String text) {
        String[] specialCharacters = {"~", "`", "!", "@", "#", "*", "$", "%", "^", "&"};

        for (String abc : specialCharacters) {
            if (text.contains(abc)) {
                return true;
            }
        }

        return false;
    }
}
