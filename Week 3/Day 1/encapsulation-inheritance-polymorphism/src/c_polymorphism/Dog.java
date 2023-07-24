package c_polymorphism;

public class Dog extends Animal {
    
    public Dog() {
        // super();
        System.out.println("I am a dog!");
    }

    // behavior
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("woof!");
    }
}
