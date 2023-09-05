package reflection;

import java.util.ArrayList;
import java.util.Collections;

public class Database {
    
    private ArrayList<FoodItem> data = new ArrayList<>();
    private int idGenerator = 0;
    public static int value = 1;

    {
        Collections.addAll(data, new FoodItem(++idGenerator, "Burger", 6.99),
                                new  FoodItem(++idGenerator, "Fries", 5.99),
                                new  FoodItem(++idGenerator, "Milkshake", 2.99),
                                new  FoodItem(++idGenerator, "Chips", 1.99),
                                new  FoodItem(++idGenerator, "Sandwich", 3.99));
    }
    
    public void addFoodItem(FoodItem itemToAdd) {
        // add id to item
        itemToAdd.setId(++idGenerator);
        data.add(itemToAdd);
    }

    public static void test() {
        System.out.println("test");
    }
}

