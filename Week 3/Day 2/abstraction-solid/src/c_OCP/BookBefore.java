package c_OCP;

public class BookBefore {
    
    private String genre;

    public void printDescription() {
        if (genre.equals("Thriller")) {
            System.out.println("This thrilling novel topped the best sellers list!");
        } else if (genre.equals("non-fiction")) {
            System.out.println("This eye-opening biography topped the best sellers list!");
        } // ... etc!
    }
}
