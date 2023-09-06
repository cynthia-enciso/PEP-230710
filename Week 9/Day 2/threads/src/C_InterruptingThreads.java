public class C_InterruptingThreads {
    public static void main(String[] args) throws InterruptedException {

        // create threads
        Thread anotherEvenThread = new DisplayEvensThreadAgain();
        Thread anotherOddThread = new Thread(new DisplayOddsThreadAgain());

        // start threads
        anotherEvenThread.start();
        anotherOddThread.start();

        System.out.println("First print statement in main");

        // interrupt threads
        Thread.sleep(1000);
        anotherEvenThread.interrupt();
        anotherOddThread.interrupt();

        System.out.println("Second print statement in main");

    }
}

class DisplayEvensThreadAgain extends Thread {

    public void run() {
        for (int i = 2; i < 21; i = i + 2) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("even thread interrupted!");
                return;
            }
        }
    }
}

class DisplayOddsThreadAgain implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 21; i = i + 2) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // e.printStackTrace();
                System.out.println("odd thread interrupted!");
                return;
            }
        }
    }
}
