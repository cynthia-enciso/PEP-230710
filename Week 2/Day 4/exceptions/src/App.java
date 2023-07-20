import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // be able to get user input
        Scanner scanner = new Scanner(System.in);

        // introduce program to user
        System.out.println("You log on to your computer and transfer your documents."); 

        // set up program
        Computer myComputer = new Computer();
        myComputer.transferDocumentsFromUSB();

        // WHILE user doesn't quit
        
        while (true) {
            // show user filenames
            System.out.println("\nWhich file do you choose to read from?");
            int i = 0;
            for (File file : myComputer.fileList) {
                System.out.println(++i + ") " + file.name);
            }
            // quit selection
            System.out.println(++i + ") quit");

            // get user input
            int selection = scanner.nextInt();

            // check if selection is out of bounds
            if (selection < 1 || selection > myComputer.fileList.size() + 1) {
                System.out.println("Input not valid!");
            }

            // quitting
            if (selection == 6) {
                break;
            }

            // depending on input try to read from file
            try {
                myComputer.fileList.get(selection - 1).readFrom();
                // if an exception is thrown the following statements 
                // in the try block will NOT execute
            } catch(FileAccessException ex) {
                ex.printStackTrace();
            }
    
        }            


        // goodbye message
        scanner.close();
    }
}
