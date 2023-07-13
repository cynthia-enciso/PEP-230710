public class App {
    public static void main(String[] args) {
        // dailyDecision(76, true);
        // gradeFeedback('A');
        repeatingThings(5);
    }

    public static void dailyDecision(int temp, boolean money) {
        boolean hasMoney = money;

        // example #1
        // if (temp < 80) {
        //     System.out.println("It's not that hot, I'm going outside!");
        // }

        // example #2
        // if (temp < 80) {
        //     System.out.println("It's not that hot, I'm going outside!");
        // } else {
        //     System.out.println("It's too hot, I'm staying inside!");
        // }

        // example #3
        
        // IF temp is greater than 80
        // if (temp > 80) {
        //     System.out.println("It's too hot, I'm NOT going outside!");
        // }
        // // ELSE IF temp is between 50 and 80
        // else if(temp >= 50 && temp <= 80) {
        //     System.out.println("I'm going outside!");
        // }
        // // ELSE 
        // else {
        //     System.out.println("It's too cold, I'm NOT going outside!");
        // }

        // example #4

        // IF the temperature is okay
        if(temp >= 50 && temp <= 80) {
            // IF I have money
            if (hasMoney) {
                System.out.println("I'm going out to eat!");
            } 
            else {
                System.out.println("I'm going to the park!");
            }
        } 
        else {
            System.out.println("I'm staying home!");
        }

    }

    public static void gradeFeedback(char letter) {
    // works with byte, short, char, and int, Strings, Wrappers

        // switch(letter) {
        //     case 'A': System.out.println("You pass!");
        //                 break;
        //     case 'B': System.out.println("You pass!");
        //                 break;
        //     case 'C': System.out.println("You pass!");
        //                 break;
        //     default: System.out.println("You failed!");
        //                 break;
        // }

        switch(letter) {
            case 'A', 'B', 'C': System.out.println("You pass!");
                        break;
            default: System.out.println("You failed!");
                        break;
            
        }

    }

    public static void repeatingThings(int count) {

        System.out.println("==== WHILE LOOP =====");
        while (count > 0) {
            System.out.println(count);
            count--;
        }

        System.out.println("==== DO-WHILE LOOP =====");
        count = 5;

        // only iterates once
        do {
            System.out.println(count);
        } while(count < 2);

        // prints 5, 4, 3, 2, 1
        do {
            System.out.println(count);
            count--;
        } while(count > 0);

        System.out.println("==== FOR LOOP =====");

        for(int num = 1; num <= 10; num++) {
            System.out.println(num);
        }
    }
}
