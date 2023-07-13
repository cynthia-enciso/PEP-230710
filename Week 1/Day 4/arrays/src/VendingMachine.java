import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        // create welcome message
        System.out.println("===================================\n");
        System.out.println("Grab N' Go Snacks and Such\n");
        System.out.println("===================================");
        
        // set up program to take user input
        Scanner scanner = new Scanner(System.in);

        // create rows for vending machine populated with tasty items
        String[] row1 = {"Coca Cola", "Milk", "Bottled Water"};
        String[] row2 = {"Takis", "Lays", "Cheetos"};
        String[] row3 = {"Snickers", "Skittles", "Smarties"};

        // repeatedly ask user to make decision
        boolean exit = false;
        String[] chosenItems = new String[3];
        int currentItemIndex = 0;

        do {
            // show user their options
            System.out.println("Choose an option:");
            System.out.println("1) Drinks");
            System.out.println("2) Savory Snacks");
            System.out.println("3) Sweet Snacks");
            System.out.println("4) Exit");

            // get user input
            int decision = scanner.nextInt();
            scanner.nextLine();
            String item;

            // make decision depending on user input
            switch (decision) {
                case 1: System.out.println("Choose an item (type in the name of the item):");
                        System.out.println(Arrays.toString(row1));
                        item = scanner.nextLine();
                        if (currentItemIndex < chosenItems.length) {
                            chosenItems[currentItemIndex++] = item;
                            System.out.println("Your current inventory: " + Arrays.toString(chosenItems));
                        }
                        break;
                case 2: System.out.println("Choose an item (type in the name of the item):");
                        System.out.println(Arrays.toString(row2));
                        item = scanner.nextLine();
                        if (currentItemIndex < chosenItems.length) {
                            chosenItems[currentItemIndex++] = item;
                            System.out.println("Your current inventory: " + Arrays.toString(chosenItems));
                        }
                        break;
                case 3: System.out.println("Choose an item (type in the name of the item):");
                        System.out.println("Your current inventory: " + Arrays.toString(row3));
                        item = scanner.nextLine();
                        if (currentItemIndex < chosenItems.length) {
                            chosenItems[currentItemIndex++] = item;
                            System.out.println("Your current inventory: " + Arrays.toString(chosenItems));
                        }
                        break;
                case 4: exit = true;
                        System.out.println("Your current inventory: " + Arrays.toString(chosenItems));
                        break;
                default: System.out.println("Invalid input. Try again.");
            }

            if (currentItemIndex >= chosenItems.length) {
                System.out.println("Your inventory is full! You need to leave!");
                break;
            }

        } while(!exit);
            

        // say goodbye to user
        scanner.close();
    }

}
