import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // declare variable
        int myNumber;
        // assign variable
        myNumber = 5;
        // use variable
        // System.out.println(myNumber);

        // set up program to get user input
        Scanner scanner = new Scanner(System.in);

        // ask user a question
        System.out.println("Enter a person:");
        // save user response
        String person = scanner.nextLine();
        System.out.println("Enter a number: "); // \n -> newline character
        int number = scanner.nextInt();
        // consume the hidden newline character
        scanner.nextLine();
        System.out.println("Enter a plural noun: ");
        String items = scanner.nextLine();
        System.out.println("Enter a plural profession: ");
        String professions = scanner.nextLine();
        System.out.println("Enter an event: ");
        String event = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective = scanner.nextLine();
        System.out.println("Enter a nickname: ");
        String nickname = scanner.nextLine();

        // append responses to mad lib story
        System.out.println("Dear " + person + ",");
        System.out.println("I want to invite you to my birthday party, " +
                            "since you know I am turning " + number + " years old.");
        System.out.println("There will be fun things like " +
                            items + " and " + professions + " at my party. There will even be a " +
                            event + " event!");
        System.out.println("Please come to my party this year. If not, I will cry "
                            + adjective + ".");
        System.out.println("Sincerely,");
        System.out.println(nickname);

        scanner.close();
    }
}
