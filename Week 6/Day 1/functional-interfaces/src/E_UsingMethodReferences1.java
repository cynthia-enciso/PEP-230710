// static and instance method references

// ===============================================

interface BinaryCalculator {
    public int binaryOperation(int value1, int value2);
}

// ===============================================

public class E_UsingMethodReferences1 {

    public static void printBinaryResult(int a, int b, BinaryCalculator func) {
        int result = func.binaryOperation(a, b);
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        printBinaryResult(1, 2, Calculator::multiply);

        Calculator calc = new Calculator();
        printBinaryResult(1, 2, calc::getMax);
    }
}

class Calculator {
    // static method
    public static int multiply(int value1, int value2) {
        return value1 * value2;
    }

    // instance method
    public int getMax(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        } else {
            return value2;
        }
    }
}
