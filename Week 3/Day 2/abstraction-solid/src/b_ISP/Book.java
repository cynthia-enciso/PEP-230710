package b_ISP;

public class Book implements Purchasable {

    @Override
    public void purchase() {
        System.out.println("The book was on sale - good deal!");
    }
    
}
