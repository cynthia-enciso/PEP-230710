package optionals;

import java.util.Optional;

public class UsingOptionals {
    public static void main(String[] args) {
        // getting an Optional from another method
        Optional<String> myOptionalString = methodThatReturnsOptional();

        // processing the Optional: do something with value
        myOptionalString.ifPresent(x -> System.out.println(x));

        // getting the value from the Optional
        String actualValue = "";

        if (myOptionalString.isPresent()) {
            actualValue = myOptionalString.get();
        }

        System.out.println(actualValue);

        // getting an Optional from another method
        Optional<Character> myOptionalCharacter = methodThatAlsoReturnsOptional("a");
    
        // processing the Optional using orElse (give a default value)
        char characterValue = myOptionalCharacter.orElse('-');
        System.out.println(characterValue);

    }

    public static Optional<String> methodThatReturnsOptional() {
        return Optional.of("hello world");
    }

    public static Optional<Character> methodThatAlsoReturnsOptional(String text) {
        // create an Optional for the String
        Optional<String> myOtherOptionalString = Optional.ofNullable(text);

        // create an Optional for a character in the String
        Optional<Character> myOptionalCharacter = Optional.empty();

        // process our text and maybe reassign myOptionalCharacter
        myOptionalCharacter = myOtherOptionalString.map(x -> {
            // IF my string has two or more characters
            if (x.length() >= 2) {
                // return character at index one to the optional
                return x.charAt(1);
            } else {
                return null;
            }
        });

        // if null is returned to the Optional, it should be empty
        System.out.println("Is my character optional empty? " + myOptionalCharacter.isEmpty());
        return myOptionalCharacter;

    }
}
