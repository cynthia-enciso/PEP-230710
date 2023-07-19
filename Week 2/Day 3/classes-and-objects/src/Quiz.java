import java.util.ArrayList;

public class Quiz {
    
    // state
    public ArrayList<Question> questionList = new ArrayList<>();

    // constructor
    public Quiz(Question question1, Question question2, Question question3) {
        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);
    }

    // methods
}
