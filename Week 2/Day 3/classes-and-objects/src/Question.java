import java.util.ArrayList;

public class Question {
    
    // state
    public String questionText;
    public ArrayList<String> answerList = new ArrayList<>();
    public int correctIndex;

    // constructor
    public Question(String questionText, String answer1, String answer2, String answer3, int correctIndex) {
        this.questionText = questionText;
        answerList.add(answer1);
        answerList.add(answer2);
        answerList.add(answer3);
        this.correctIndex = correctIndex;
    }

    // behavior
    public void printQuestion() {
        System.out.println("-----------------------");
        System.out.println(this.questionText);

        // iterate over answers
        for (int i = 0; i < answerList.size(); i++) {
            System.out.println( i + 1 + ") " + answerList.get(i));
        }
    }
}
