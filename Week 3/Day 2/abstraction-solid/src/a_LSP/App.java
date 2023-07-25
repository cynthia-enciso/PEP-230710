package a_LSP;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Cat();

        animal2.getAge();
        animal2.makeNoise();

        animal2 = new Dog();

        // Cat myCat = new Animal();
    }
}
