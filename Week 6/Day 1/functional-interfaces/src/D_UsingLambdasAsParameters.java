 // ===============================================

interface BinaryCalculator {
    public int binaryOperation(int value1, int value2);
}

// ===============================================


public class D_UsingLambdasAsParameters {

    public static void main(String[] args) {
        printBinaryResult(3, 4, (a, b) -> a + b);
        printBinaryResult(3, 4, (a, b) -> a * b);
    }

    public static void printBinaryResult(int a, int b, BinaryCalculator func) {
        int result = func.binaryOperation(a, b);
        System.out.println(result);
    }
}
