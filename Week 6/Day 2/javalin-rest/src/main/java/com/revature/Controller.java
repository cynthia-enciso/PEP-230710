package com.revature;

import java.util.List;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class Controller {
    
    public void setUp() {
        // create Javalin object
        Javalin app = Javalin.create().start(8080);

        // create endpoints
        // get all fooditems
        app.get("/fooditems", this::getAllFoodItems);
        // get one fooditem by id
        app.get("/fooditems/{id}", this::getFoodItemById);
        // add a food item 
        app.post("/fooditems", this::addFoodItem);
        // update a fooditem by id
        app.put("/fooditems/{id}", this::updateFoodItemById);
        // delete a fooditem by id
        app.delete("/fooditems/{id}", (context) -> {
            this.deleteFoodItemById(context);
        });
        
        
    }

    // handlers
    // getAll
    private void getAllFoodItems(Context ctx) {
        // use "DAO" to get info
        List<FoodItem> itemsToReturn = App.db.getAllFoodItems();

        // send info back
        ctx.json(itemsToReturn);
    }

    // getOne
    private void getFoodItemById(Context ctx) {
        // get the id as a String
        String paramValue = ctx.pathParam("id");
        // convert id to int
        int id = Integer.parseInt(paramValue);

        // use "DAO" to get info
        FoodItem itemToReturn = App.db.getFoodItemById(id);

        // send info back
        if (itemToReturn != null) {
            ctx.json(itemToReturn);
        } else {
            ctx.status(400);
        }
    }

    // addOne
    private void addFoodItem(Context ctx) {
        // Jackon provides Object Mapper, Javalin provides bodyAsClass
        FoodItem foodToAdd = ctx.bodyAsClass(FoodItem.class);
        App.db.addFoodItem(foodToAdd);
    }

    // updateOne
    private void updateFoodItemById(Context ctx) {
        FoodItem updatedItem = ctx.bodyAsClass(FoodItem.class);
        App.db.updateFoodItem(updatedItem);
    }

    // deleteOne
    private void deleteFoodItemById(Context ctx) {
        String idText = ctx.pathParam("id");
        int id = Integer.parseInt(idText);
        App.db.deleteFoodItemById(id);
    }

}
