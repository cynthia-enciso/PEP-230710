package producerconsumer;

public class App {

    public static CookieStore cookiesRUs = new CookieStore();
    public static final int MAX_COOKIES = 5;

    public static void main(String[] args) {
        // create producer and consumer
        Baker baker = new Baker();
        Cashier cashier = new Cashier();

        // creates threads that produce and consume
        Thread thread1 = new Thread(() -> {
            try {
                baker.produce(new Cookie());
                baker.produce(new Cookie());
                baker.produce(new Cookie());
                baker.produce(new Cookie());
                baker.produce(new Cookie());
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted!");
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                cashier.consume();
                cashier.consume();
                cashier.consume();
                cashier.consume();
                cashier.consume();
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted!");
            }
        });

        // start threads
        thread1.start();
        thread2.start();
    }
}
