import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // get user input
        Scanner scanner = new Scanner(System.in);

        // create questions
        Question question1 = new Question("Is Java interpreted or compiled?", "Interpreted", "Compiled", "Both", 2);
        Question question2 = new Question("Which of the following naming convention is NOT used in Java?", "UPPER_SNAKE_CASE", "SaRcAsM-cAsE", "PascalCase", 1);
        Question question3 = new Question("Which of the following is a scope in Java?", "Tactical", "Shared", "Instance", 2);

        // create a Quiz
        Quiz quiz = new Quiz(question1, question2, question3);

        // asking for username
        System.out.println("Type in your username: ");
        String username = scanner.nextLine();

        // create a player
        Player player = new Player(username);

        // play quiz
        for (int i = 0; i < quiz.questionList.size(); i++) {
            // print question
            quiz.questionList.get(i).printQuestion();

            // get user response
            int response = scanner.nextInt();

            // update score accordingly
            if (response == quiz.questionList.get(i).correctIndex + 1) {
                player.score++;
            }
        }


        // show result
        System.out.println("Player's score is: " + player.score);

        scanner.close();
    }

    public static void playerExample() {
        Player player1 = new Player("Bob");
        Player player2 = new Player("Freddy");

        // player1.username = "Bob";
        // player2.username = "Freddy";

        System.out.println(player1.username);
        System.out.println(player1.score);
        System.out.println(player2.username);

        System.out.println(player1);
    }
}
