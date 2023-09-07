public class BeforeAndAfterSynching {

    int value = 0;

    public static void main(String[] args) {
        // create object to work with
        BeforeAndAfterSynching myObj = new BeforeAndAfterSynching();

        // create threads
        Thread thread1 = new Thread(() -> {
            try {
                myObj.updateValueFiveTimesByAddingOne();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                myObj.updateValueFiveTimesByAddingTwo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // start threads
        thread1.start();
        thread2.start();

        // debugging
        System.out.println(thread1.getName() + "- State:" + thread1.getState() + " & IsAlive:" + thread1.isAlive());
        System.out.println(thread2.getName() + "- State:" + thread2.getState() + " & IsAlive:" + thread2.isAlive());
        System.out.println(thread1.getName() + "- State:" + thread1.getState() + " & IsAlive:" + thread1.isAlive());
        System.out.println(thread2.getName() + "- State:" + thread2.getState() + " & IsAlive:" + thread2.isAlive());
        System.out.println(thread1.getName() + "- State:" + thread1.getState() + " & IsAlive:" + thread1.isAlive());
        System.out.println(thread2.getName() + "- State:" + thread2.getState() + " & IsAlive:" + thread2.isAlive());
        
    }

    // both operations need to be synchronized in order for data consistency

    // 
    // public synchronized void updateValueFiveTimesByAddingOne() {
    //     // iterate 5 times, update value by 1 every time
    //     for (int i = 1; i <= 5; i++) {
    //         System.out.println(++value);
    //     }
    // }

    // public  synchronized void updateValueFiveTimesByAddingTwo() {
    //     // iterate 5 times, update value by 2 every time
    //     for (int i = 1; i <= 5; i++) {
    //         value += 2;
    //         System.out.println(value);
    //     }
    // }

    // example using synchronized statements
    public void updateValueFiveTimesByAddingOne() throws InterruptedException {
        System.out.println("Before adding one loop");

        synchronized(this) {
            // iterate 5 times, update value by 1 every time
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(500);
                System.out.println(++value);
            }

            System.out.println("end of for loop one");
        } 
    
        System.out.println("After adding one loop");
    }

    public void updateValueFiveTimesByAddingTwo() throws InterruptedException {
        System.out.println("Before adding two loop");

        synchronized(this) {
            // iterate 5 times, update value by 2 every time
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(500);
                value += 2;
                System.out.println(value);
            }
        }

        System.out.println("After adding two loop");
    }
}