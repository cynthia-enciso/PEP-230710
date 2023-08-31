package designpatterns.c_factorymethod.attractions;

public abstract class Attraction {
    
    // state
    private String name;
    private String description;
    private double price;

    
    // behavior
    public void turnOn() {
        System.out.println(name + ", is turned on.");
    }

    public void test() {
        System.out.println(name + ", is being tested.");

    }

    public void allowEntry() {
        System.out.println(name + ", is now allowing entry.");

    }


    // getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
