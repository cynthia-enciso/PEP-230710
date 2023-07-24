package d_objectclass;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(1);
        cat.setWhiskerLength(2);
        System.out.println("Cat 1: " + cat);

        Cat cat2 = new Cat();
        cat2.setAge(1);
        cat2.setWhiskerLength(2);
        System.out.println("Cat 2: " + cat2);

        Cat cat3 = cat2;
        
        System.out.println("Comparing cats 1 and 2 with ==: " + (cat == cat2));
        System.out.println("Comparing cats 2 and 3 with ==: " + (cat2 == cat3));
        System.out.println("Comparing cats with equals: " + cat.equals(cat2));
    }
}
