package b_inheritance;

public class Cat extends Animal {
    
    // state
    private int whiskerLength;

    public Cat() {
        // super();
        System.out.println("I am a cat!");
    }

    // getters and setters
    public int getWhiskerLength() {
        return whiskerLength;
    }

    public void setWhiskerLength(int whiskerLength) {
        this.whiskerLength = whiskerLength;
    }
}
