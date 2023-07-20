import java.util.ArrayList;
import java.util.Random;

public class Computer {
    
    // state
    public ArrayList<File> fileList = new ArrayList<>();

    // methods
    public void transferDocumentsFromUSB() {
        // create 5 files and add them to the filesystem
        fileList.add(new File("todos.txt", "do this, this, and that."));
        fileList.add(new File("ideas.txt", "edible office supplies? impossible crossword puzzles?"));
        fileList.add(new File("not-a-love-letter.txt", "Leslie, you are the apple of my eye!"));
        fileList.add(new File("07-12-2023.txt", "Cloudy day. Might watch favorite movie tomorrow."));
        fileList.add(new File("birthday-plans.txt", "Invite Bob over for a sleep over. Tell him his kids aren't invited."));
    
        // get a random file
        Random random = new Random();
        int index = random.nextInt(fileList.size()); // or 5

        // corrupt file

        // get file and set file's text to null
        fileList.get(index).text = null;
    }
}
