// https://docs.oracle.com/javase/tutorial/essential/concurrency/deadlock.html

public class Deadlock {

    public static void main(String[] args) throws InterruptedException {
        // two friend objects
        Friend alphonse = new Friend("Alphonse");
        Friend gaston = new Friend("Gaston");

        // two threads each using an object
        Thread thread1 = new Thread(() -> {
            alphonse.bow(gaston);
        });

        Thread thread2 = new Thread(() -> {
            gaston.bow(alphonse);
        });

        // start threads
        thread1.start();
        thread2.start();

        // debugging
        // use main thread to check state of other threads periodically
        for (int i = 0; i <= 5; i++) {
            Thread.sleep(1000);
            System.out.println(thread1.getName() + "- State:" + thread1.getState() + " & IsAlive:" + thread1.isAlive());
            System.out.println(thread2.getName() + "- State:" + thread2.getState() + " & IsAlive:" + thread2.isAlive());
        }

    }
}

class Friend {
    private String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public synchronized void bow(Friend bower) {
        System.out.format("%s: %s"
                + "  has bowed to me!%n",
                this.name, bower.getName());

        // debugging statement
        System.out.println(Thread.currentThread().getName() + " holds lock on " + this.name + "? "
                + Thread.holdsLock(this) + "\n" + Thread.currentThread().getName() + " holds lock on " + bower.name
                + "? " + Thread.holdsLock(bower));

        bower.bowBack(bower); // deadlock
    }

    public synchronized void bowBack(Friend bower) {
        System.out.format("%s: %s"
                + " has bowed back to me!%n",
                this.name, bower.getName());
    }
}
