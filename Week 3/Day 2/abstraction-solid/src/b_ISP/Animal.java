package b_ISP;

public abstract class Animal {
    
    // state
    private int age;

    // behavior
    public abstract void makeNoise();

    // public void makeNoise() {
    //     System.out.println("dsfsdf");
    // }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
