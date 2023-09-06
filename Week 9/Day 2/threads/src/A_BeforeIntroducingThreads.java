public class A_BeforeIntroducingThreads {
    public static void main(String[] args) {
        displayEvenNumbers();
        displayOddNumbers();
    }

    public static void displayEvenNumbers() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void displayOddNumbers() {
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
