package com.revature;

public class FoodItem {
    
    // state
    private int id;
    private String name;
    private double price;

    // constructors
    public FoodItem() {}

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public FoodItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "FoodItem [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    
}
