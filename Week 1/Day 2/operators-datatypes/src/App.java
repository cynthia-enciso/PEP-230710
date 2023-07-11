public class App {
    public static void main(String[] args) {
        // useArithmeticOperators(3);
        // useIncrementOperators(5);
        // useComparisonOperators(5);
        // useLogicalOperators(11);
        useStringMethods("hello world");
    }

    public static void useArithmeticOperators(double input) {
        System.out.println("The input is: " + input);

        // addition
        System.out.print(input + " + 4 = ");
        input =+ 4;
        System.out.println(input);

        // subtraction
        System.out.print(input + " - 4 = ");
        input = input - 4;
        System.out.println(input);

        // multiplication
        System.out.print(input + " * 2 = ");
        input = input * 2;
        System.out.println(input);

        // division
        System.out.print(input + " / 2 = ");
        input = input / 2;
        System.out.println(input);

        // modulo
        System.out.print(input + " % 2 = ");
        input = input % 2;
        System.out.println(input);
    }

    public static void useIncrementOperators(int input) {
        System.out.println("The input is: " + input);

        // System.out.println("input using pre-increment: " + ++input);
        System.out.println("input using post-increment: " + input++);
        System.out.println("input after using post-increment: " + input);
    }

    public static void useComparisonOperators(int input) {
        System.out.println("The input is: " + input);
        boolean result;

        // >
        System.out.println("Is " + input + " greater than 5?");
        result = input > 5;
        System.out.println(result);

        // <=
        System.out.println("Is " + input + " less than or equal to 10?");
        result = input <= 10;
        System.out.println(result);

        // ==
        System.out.println("Is " + input + " equal to 8?");
        result = input == 8;
        System.out.println(result);

        // !=
        System.out.println("Is " + input + " NOT equal to 4?");
        result = input != 4;
        System.out.println(result);
    }

    public static void useLogicalOperators(int input) {
        System.out.println("Input is: " + input);
        boolean result;

        // AND
        System.out.println("Is " + input + " greater than 5 AND less than 10?");
        result = input > 5 && input < 10;
        System.out.println(result);

        // OR
        System.out.println("Is " + input + " greater than 5 OR less than 10?");
        result = input > 5 || input < 10;
        System.out.println(result);

        // NOT
        System.out.println("Opposite boolean value of an expression: " + !false);
    }

    public static void useStringMethods(String myString) {
        System.out.println("My string value is: " + myString);
        boolean result;

        // endsWith
        System.out.println("Does it end with \"ld\"?");
        result = myString.endsWith("ld");
        System.out.println(result);
        System.out.println("Does it end with \"dl\"?");
        result = myString.endsWith("dl");
        System.out.println(result);

        // contains
        System.out.println("Does my String contain \"lo w\"?");
        result = myString.contains("lo w");
        System.out.println(result);
        System.out.println("Does my String contain \"lo y\"?");
        result = myString.contains("lo y");
        System.out.println(result);

        // compareToIgnoreCase
        System.out.println("Does " + myString + " equal \"hELlO wOrLd\" (ignoring case)? ");
        result = myString.equalsIgnoreCase("hELlO wOrLd");
        System.out.print(result + "\n");
    }
}
