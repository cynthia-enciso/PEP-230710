package c_polymorphism;

public class Cat extends Animal {
    
    // state
    private int whiskerLength;
    private String name;
    private String furColor;

    public Cat() {
        // super();
        System.out.println("I am a cat!");
    }

    public Cat(int age) {
        this.setAge(age);
    }

    // can't do, not unique enough
    // public Cat(int whiskerLength) {
    //     this.whiskerLength = whiskerLength;
    // }
    
    public Cat(int age, int whiskerLength) {
        this.setAge(age);
        this.whiskerLength = whiskerLength;
    }

    public Cat(String name, int age, String furColor) {}

    public Cat(String name, String furColor, int age) {}

    // getters and setters
    public int getWhiskerLength() {
        return whiskerLength;
    }

    public void setWhiskerLength(int whiskerLength) {
        this.whiskerLength = whiskerLength;
    }
}
