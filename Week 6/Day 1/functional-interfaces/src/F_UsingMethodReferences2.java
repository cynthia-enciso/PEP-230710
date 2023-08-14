
// ============================================================

interface IWantAnObject {
    Object get();
}

interface IWantAnObject2 {
    Object get(String name);
}

interface StringChecker {
    // provide two String values, return a boolean
    boolean check(String a, String b);

}
// ============================================================

public class F_UsingMethodReferences2 {


    
    // constructor and arbitrary object references
    public static void main(String[] args) {
        // constructor reference
        IWantAnObject objectNeededHere1 = Object::new;
        IWantAnObject objectNeededHere2 = Dog::new;
        IWantAnObject objectNeededHere3 = () -> new Dog();
        IWantAnObject2 objectNeededHere4 = (value) -> new Dog(value);

        // arbitrary object reference: I'll get an object later, and when I do,
        // I'll call this particular instance method in this class on that object
        StringChecker myChecker = String::endsWith; 
        boolean result = myChecker.check("hello world", "rld");
        System.out.println(result);


    }
}

class Dog {
    String name;

    public Dog() {}
    public Dog(String name) {
        this.name = name;
    }
}
