package c_OCP;

public class BookAfter {
    
    public Genre genre;

    public void printDescription() {
        System.out.println(genre.description);
    }
}

class Genre {
    public String description;
}

class Thriller extends Genre {
    public Thriller() {
        super.description = "This thrilling novel topped the best sellers list!";
    }
}

class NonFiction extends Genre {
    public NonFiction() {
        this.description = "This eye-opening biography topped the best sellers list!";
    }
}
