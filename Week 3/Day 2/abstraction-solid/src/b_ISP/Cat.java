package b_ISP;

public class Cat extends Animal implements Purchasable {
    
    
    @Override
    public void makeNoise() {
        System.out.println("MEOW!");
    }

    @Override
    public void purchase() {
        System.out.println("cat is happy to have a home!");
    }
}
