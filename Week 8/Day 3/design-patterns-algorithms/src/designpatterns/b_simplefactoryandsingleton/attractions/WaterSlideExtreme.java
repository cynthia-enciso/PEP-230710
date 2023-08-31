package designpatterns.b_simplefactoryandsingleton.attractions;

public class WaterSlideExtreme extends Attraction {
    public WaterSlideExtreme() {
        this.setName("Water Slide Extreme");
        this.setDescription("Tallest water slide in the world.");
        this.setPrice(3.99);
    }
}