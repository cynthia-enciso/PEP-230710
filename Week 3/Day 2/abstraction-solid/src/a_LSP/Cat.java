package a_LSP;

public class Cat extends Animal{
    
    private int whiskerLength;
    
    @Override
    public void makeNoise() {
        // System.out.println("*Doesn't make noise*");
        System.out.println("MEOW!");
    }

    // getter and setter
    public int getWhiskerLength() {
        return whiskerLength;
    }
    public void setWhiskerLength(int whiskerLength) {
        this.whiskerLength = whiskerLength;
    }

    
}
