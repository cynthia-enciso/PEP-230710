
public class B_AfterIntroducingThreads {
    public static void main(String[] args) {
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
        System.out.println("Main thread id: " + Thread.currentThread().getId());
        System.out.println("Main thread name: " + Thread.currentThread().getName());
        System.out.println("Active Threads: " + Thread.activeCount());

        // create threads
        Thread evenNumbersThread = new DisplayEvenNumbersThread();
        Thread oddNumbersThread = new Thread((new DisplayOddNumbersThread()));

        System.out.println("Before: Print statement from main thread");

        // start threads
        evenNumbersThread.start();
        oddNumbersThread.start();
        System.out.println("Active Threads: " + Thread.activeCount());
        System.out.println("Even thread priority: " + evenNumbersThread.getPriority());
        System.out.println("Even thread id: " + evenNumbersThread.getId());
        evenNumbersThread.setName("Even Thread");
        System.out.println("Even thread name: " + evenNumbersThread.getName());

        System.out.println("Odd thread priority: " + oddNumbersThread.getPriority());
        System.out.println("Odd thread id: " + oddNumbersThread.getId());
        oddNumbersThread.setName("Odd Thread");
        System.out.println("Odd thread name: " + oddNumbersThread.getName());


        System.out.println("After: Print statement from main thread");

        System.out.println("Active Threads: " + Thread.activeCount());
    }
}

class DisplayEvenNumbersThread extends Thread {

    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

class DisplayOddNumbersThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}