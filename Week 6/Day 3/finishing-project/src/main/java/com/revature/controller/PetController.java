package com.revature.controller;

import java.util.List;

import com.revature.model.Pet;
import com.revature.service.PetService;
import com.revature.service.PetServiceImpl;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class PetController {

    // dependency
    PetService petService;

    public PetController() {
        petService = new PetServiceImpl();
    }

    public void setUpAPI() {
        Javalin app = Javalin.create().start(8080);

        // create endpoints
        // get all pets
        app.get("/pets", this::getAllPets);
        // get one pet
        app.get("/pets/{id}", this::getPetById);
        // add a pet
        app.post("/pets", this::addPet);
        // update a pet
        app.put("/pets/{id}", this::updatePet);
        // delete a pet
        app.delete("/pets/{id}", this::deletePetById);
    }

    // handlers
    private void getAllPets(Context ctx) {
        // ask service to make relevant decisions and return information needed
        List<Pet> pets = petService.getAllPets();

        // once information returned from service layer, 
        // send out response with whatever status and information we want
        ctx.json(pets);
    }

    private void getPetById(Context ctx) {
        // get any relevant info from ctx object (param)
        int id = Integer.parseInt(ctx.pathParam("id"));

        // call relevant service method so it can make decisions and return info needed
        Pet pet = petService.getPetById(id);

        // with info returned, send response
        if (pet != null) {
            ctx.json(pet);
        } else {
            ctx.result("Error: pet not found");
            ctx.status(404); // resource not found
        }
    }

    private void addPet(Context ctx) {
        // get any relevant info from ctx object (param)
        Pet pet = ctx.bodyAsClass(Pet.class);

        // call relevant service method so it can make decisions and return info needed
        Pet petAdded = petService.addPet(pet);

        // with info returned, send response
        if (petAdded != null) {
            ctx.json(petAdded); // send JSON representation of an object in response body
        } else {
            ctx.result("Error: pet not added");
            ctx.status(400);
        }
    }

    private void updatePet(Context ctx) {
        // get any relevant info from ctx object (param)
        Pet pet = ctx.bodyAsClass(Pet.class);

        // call relevant service method so it can make decisions and return info needed
        boolean result = petService.updatePet(pet);

        // with info returned, send response
        if (!result) {
            ctx.result("Error: pet could not be updated");
            ctx.status(400);
        }
    }

    private void deletePetById(Context ctx) {
        // get any relevant info from ctx object (param)
        int id = Integer.parseInt(ctx.pathParam("id"));
        // call relevant service method so it can make decisions and return info needed
        boolean result = petService.deletePetById(id);
        // with info returned, send response
        if (!result) {
            ctx.result("Error: pet could not be deleted");
            ctx.status(400);
        }
    }

}
