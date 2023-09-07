// https://stackoverflow.com/questions/1036364/good-example-of-livelock
// may not be a true example, but close enough!

public class LivelockExampleKindOf {
    public static void main(String[] args) {
        // create objects
        Diner husband = new Diner("Bob");
        Diner wife = new Diner("Alice");
        Spoon spoon = new Spoon(husband);

        // create threads
        Thread husbandThread = new Thread(new Runnable() {
            public void run() {
                husband.eatWith(spoon, wife);
            }
        });

        husbandThread.setName("Husband Thread");

        Thread wifeThread = new Thread(new Runnable() {
            public void run() {
                wife.eatWith(spoon, husband);
            }
        });

        wifeThread.setName("Wife Thread");

        // start threads
        husbandThread.start();
        wifeThread.start();
    }
}

class Spoon {

    private Diner owner;

    public Spoon(Diner d) {
        owner = d;
    }

    public synchronized Diner getOwner() {
        return owner;
    }

    public synchronized void setOwner(Diner d) {
        owner = d;
    }

    public synchronized void use() {
        System.out.printf("%s has eaten!", owner.getName());
    }
}

class Diner {

    private String name;
    private boolean isHungry;

    public Diner(String n) {
        name = n;
        isHungry = true; // diners start off hungry
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void eatWith(Spoon spoon, Diner spouse) {

        // while the diner is hungry
        while (isHungry) {
            // if the diner does not have the spoon, wait for spouse to give spoon
            if (spoon.getOwner() != this) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    // just keep waiting until owner
                    continue;
                }
                // just keep waiting until
                continue;
            }
            // if diner does have spoon, check if spouse is hungry
            if (spouse.isHungry()) {
                System.out.printf(
                        "%s: You eat first my darling %s!%n",
                        name, spouse.getName());

                // debugging
                System.out.print("-----------------\n" +
                        "Name: " + Thread.currentThread().getName() + "\n" +
                        "State: " + Thread.currentThread().getState() + "\n" +
                        "-----------------\n");

                    spoon.setOwner(spouse); 

                // wait patiently some more
                continue;
            }

            // else use spoon, change isHungry and eat, and then give spoon to spouse
            spoon.use();
            isHungry = false;
            System.out.printf(
                    "%s: I am stuffed, my darling %s!%n",
                    name, spouse.getName());
            spoon.setOwner(spouse);
        }

    }
}
