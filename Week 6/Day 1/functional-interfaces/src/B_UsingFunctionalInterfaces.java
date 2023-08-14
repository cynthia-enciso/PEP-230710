public class B_UsingFunctionalInterfaces {

    // ===============================================

    interface BinaryCalculator {
        public int binaryOperation(int value1, int value2);
    }

    // ===============================================
    public static void main(String[] args) {
        
        BinaryCalculator positionForFunc = (a, b) -> {
            return a + b;
        };

        int result = positionForFunc.binaryOperation(3, 4);
        System.out.println(result);
    }   
}
