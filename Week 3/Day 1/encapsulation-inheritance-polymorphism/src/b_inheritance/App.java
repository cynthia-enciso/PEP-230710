package b_inheritance;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(5);
        cat.setWhiskerLength(2);
        cat.makeNoise();

        Dog dog = new Dog();
        dog.setAge(3);
        dog.makeNoise();
    }
}
