package algorithms;

public class SimpleBigOExamples {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        constant(array);
        linear(array);
        quadratic(array);
    }

    public static void constant(int[] array) {

        // no operation depends on the size of the array
        if (array != null && array.length > 0) {
            System.out.println(array[0]);
        }
    }

    public static void linear(int[] array) {

        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void quadratic(int[] array) {

        // {1 , 2, 3};
        // 1 * 1
        // 1 * 2
        // 1 * 3
        // 2 * 1
        // 2 * 2
        // 2 * 3
        // etc
        
        for (int element : array) {
            for (int secondElement : array) {
            System.out.println(element * secondElement);
            }
        }
    }
}
