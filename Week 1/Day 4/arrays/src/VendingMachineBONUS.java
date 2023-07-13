import java.util.Scanner;

public class VendingMachineBONUS {
    public static void main(String[] args)  {
        // welcome user
        System.out.println("===================================\n");
        System.out.println("Grab N' Go Snacks and Such\n");
        System.out.println("===================================");
        
        // create Scanner object
        Scanner scanner = new Scanner(System.in);

        // create tiers
        String[] tier1 = {"Boiled Egg", "Cheesy Puffs", "Veggie Medley"};
        String[] tier2 = {"Power Up Soda", "Bottled Water", "Fresh Squeezed OJ"};
        String[] tier3 = {"Gouda Turkey Sandwich", "Best Salad Ever", "Ham Po'Boy"};

        keepPromptingUserLoop:
        while(true) {
            // display menu
            System.out.println("\nPlease make a decision:");
            System.out.println("1) Look at snacks");
            System.out.println("2) Look at drinks");
            System.out.println("3) Look at lunches");
            System.out.println("4) Quit");

            // get user input
            int tierSelection = getUserInput(scanner);
            int itemSelection;

            // make tier selection based off of user's choice
            switch(tierSelection) {
                case 1: // look at tier
                        lookatTier(tier1);
                        // get user input
                        itemSelection = getUserInput(scanner);
                        // make item decision
                        makeItemDecision(itemSelection, tier1);
                        break;
                case 2: lookatTier(tier2);
                        itemSelection = getUserInput(scanner);
                        makeItemDecision(itemSelection, tier2);
                        break;
                case 3: lookatTier(tier3);
                        itemSelection = getUserInput(scanner);
                        makeItemDecision(itemSelection, tier3);
                        break;
                case 4: break keepPromptingUserLoop;
                default: System.out.println("Sorry, I didn't quite understand.");
            }
            
        }


        // say your goodbyes
        System.out.println("Adios!");

        // close scanner object
        scanner.close();

    }

    public static int getUserInput(Scanner scanner) {
        int input = scanner.nextInt();
        return input;
    }

    public static void lookatTier(String[] tier) {
        // display options
        System.out.println("\nPlease make another decision:");

        // loop through tier: run into problem
        for (int index = 0; index < tier.length; index++) {
            System.out.println(index + 1 +") Choose the " + tier[index]);
        }

        System.out.println("4) Go back");
    }

    public static void makeItemDecision(int itemDecision, String[] tier) {
        switch(itemDecision) {
            case 1:
            case 2:
            case 3: System.out.println("You chose: " + tier[itemDecision - 1]);
                    break;
            case 4: System.out.println("You chose to go back to looking.");
                    break;
            default: System.out.println("Sorry, I didn't quite understand.");
        }
    }
}
