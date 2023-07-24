package b_inheritance;

public class Animal {
    // state
    private int age;

    // constructors
    public Animal() {
        System.out.println("I am an animal!");
    }

    // behavior
    public void makeNoise() {
        System.out.println("*generic animal noise*");
    }

    // getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
