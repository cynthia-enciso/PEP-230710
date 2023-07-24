package d_objectclass;

public class Animal extends Object {
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        // Animal other = (Animal) obj;
        if (age != ((Animal) obj).age)
            return false;
        return true;
    }

    
}
