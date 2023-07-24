package c_polymorphism;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(5);
        cat.setWhiskerLength(2);
        cat.makeNoise();

        Cat anotherCat = new Cat(5, 2);

        Dog dog = new Dog();
        dog.setAge(3);
        dog.makeNoise();
    }
}
