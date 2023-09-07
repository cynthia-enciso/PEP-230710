public class E_JoiningThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread simpleThread = new SimpleThreadAgain();
        Thread simpleThread2 = new SimpleThreadAgain2();

        // Threads you create are user threads (important, not deamon threads / background threads).
        //  App keeps running as long as a user thread is executing. 
        // simpleThread.setDaemon(true);
        // simpleThread2.setDaemon(true);

        System.out.println("first print statement from main thread");

        simpleThread2.start();
        simpleThread.start();

        // Thread.currentThread().interrupt();

        // joining: current thread waits on simpleThread to finish executing
        // at this time thread1 and 2 take turns
        // simpleThread.join(); 
        simpleThread.join(2000);

        System.out.println("second print statement from main thread");

        System.out.println("third print statement from main thread");
    }
}


class SimpleThreadAgain extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(this.getName() + " interrupted!");
                return; 
            }
        }
    }
}

class SimpleThreadAgain2 extends Thread {
    @Override
    public void run() {
        for(int i = 11; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(this.getName() + " interrupted!");
                return; 
            }
        }
    }
}