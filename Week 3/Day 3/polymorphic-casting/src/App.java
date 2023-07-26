public class App {
    public static void main(String[] args) {
        
        // upcasting
        Animal myAnimal = new Cat();
        System.out.println(myAnimal.age);
        myAnimal.makeNoise();
        // can't access subtype class members
        // System.out.println(myAnimal.whiskerLength); 

        Animal[] animals = {new Dog(), new Cat()};

        for (Animal animal : animals) {
            animal.makeNoise();
        }

        // downcasting
        System.out.println(((Cat) myAnimal).whiskerLength);
        myAnimal = new Dog();
        if (myAnimal instanceof Cat) {
            System.out.println(((Cat) myAnimal).whiskerLength);
        } else {
            System.out.println("not a cat!");
        }
        
    }
}
