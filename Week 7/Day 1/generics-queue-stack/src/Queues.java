// https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ArrayBlockingQueue.html

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

class Mail {

}

public class Queues {

    public static Queue<Mail> mailbox = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) {
        mailmanDepositingMail(10);
        homeownerGetsMail(7);
    }

    public static void mailmanDepositingMail(int attempt) {
        while (attempt > 0) {
            boolean success = mailbox.offer(new Mail());
            if (success) {
                System.out.println("The mailman deposited a mail number: " + attempt);
            } else {
                System.out.println("The mailman attempts to deposit mail number: " + attempt + ", but mailbox's full!");
            }
            attempt--;
        }
    }

    public static void homeownerGetsMail(int attempt) {
        int mailNumber = 1;
        while (attempt > 0) {
            attempt--;
            if (mailbox.peek() != null) {
                System.out.println("The homeowner picked up a mail item number: " + mailNumber);
                mailbox.poll();
            } else {
                System.out.println("The homeowner attempts to grab some mail, but there isn't any!");
            }
            mailNumber++;
        }
    }
}
