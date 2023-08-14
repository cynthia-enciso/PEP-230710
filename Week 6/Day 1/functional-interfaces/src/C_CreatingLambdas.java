public class C_CreatingLambdas {

    // =========================================================

    interface ReturnString {
        public String returnString(String value);
    }

    interface PrintTwoStrings {
        public void printValues(String value1, String value2);
    }

    // =========================================================

    public static void main(String[] args) {
        // most verbose: specify datatypes, have multiple statements
        PrintTwoStrings lambda1 = (String value1, String value2) -> {
            System.out.println(value1);
            System.out.println(value2);
        };

        // omit datatypes
        PrintTwoStrings lambda2 = (value1, value2) -> {
            System.out.println(value1);
            System.out.println(value2);
        };

        // single param can remove parenthesis
        ReturnString lambda3 = value -> {
            return value;
        };

        // single statement = can omit block
        PrintTwoStrings lambda4 = (value1, value2) -> System.out.println(value1 + " " + value2);

        // single param can remove parenthesis + single statement that returns value
        // no return keyword or code block
        ReturnString lambda5 = value -> value;
    }
}
