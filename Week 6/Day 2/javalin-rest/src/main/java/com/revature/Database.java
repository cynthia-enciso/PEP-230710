package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Database {
    
    // state
    private List<FoodItem> data = new ArrayList<>();
    private int idGenerator = 0;

    // initialize with some food items
    public void init() {
        Collections.addAll(data, new FoodItem(++idGenerator, "Burger", 6.99),
                                new  FoodItem(++idGenerator, "Fries", 5.99),
                                new  FoodItem(++idGenerator, "Milkshake", 2.99),
                                new  FoodItem(++idGenerator, "Chips", 1.99),
                                new  FoodItem(++idGenerator, "Sandwich", 3.99));
    }

    // CRUD
    public void addFoodItem(FoodItem itemToAdd) {
        itemToAdd.setId(++idGenerator);
        data.add(itemToAdd);
    }

    public List<FoodItem> getAllFoodItems() {
        return data;
    }

    public FoodItem getFoodItemById(int id) {
        for (FoodItem item : data) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void updateFoodItem(FoodItem itemToUpdate) {
        for (FoodItem item : data) {
            if (item.getId() == itemToUpdate.getId()) {
                item.setName(itemToUpdate.getName());
                item.setPrice(itemToUpdate.getPrice());
            }
        }
    }

    public void deleteFoodItemById(int id) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == id) {
                data.remove(i);
            }
        }
    }
}
