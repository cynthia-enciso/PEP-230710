package a_LSP;

public class Animal {
    
    // state
    private int age;

    // behavior
    public void makeNoise() 
    {
        System.out.println("*makes generic animal noise*");
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
