package com.revature;

import com.revature.dao.PetDAO;
import com.revature.dao.PetDAOmySQLImpl;
import com.revature.model.Pet;

public class App {

    public static void main( String[] args ) {
        PetDAO myDAO = new PetDAOmySQLImpl();
        System.out.println(myDAO.getAllPets());
        System.out.println(myDAO.getPetById(1));

        Pet pet = myDAO.addPet(new Pet("Daisy", 5, "Dog", 1));
        System.out.println("Pet added: " + pet);
    }

}
