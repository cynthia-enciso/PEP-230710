package com.revature.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.revature.model.Pet;

public class PetDAODummyImpl implements PetDAO {

     // dummy database
    List<Pet> myDummyDatabase = new ArrayList<>();
    // counter for id

    public PetDAODummyImpl() {
        Collections.addAll(myDummyDatabase,
                new Pet(1, "Cosmo", 2, "Dog", 1),
                new Pet(2, "Freddie", 4, "Cat", 5),
                new Pet(3, "Gopher", 5, "Dog", 1),
                new Pet(4, "Fiona", 4, "Cat", 5),
                new Pet(5, "Felix", 10, "Bird", 2),
                new Pet(6, "Barbara", 3, "Bird", 2),
                new Pet(7, "Biscuit", 1, "Rodent", 0),
                new Pet(8, "Nemo", 1, "Fish", 0),
                new Pet(9, "Milo", 2, "Cat", 5),
                new Pet(10, "Barry", 4, "Dog", 1));
    }

    @Override
    public boolean addPet(Pet pet) {
        return myDummyDatabase.add(pet);
    }

    @Override
    public Pet getPetById(int id) {
        for (Pet pet : myDummyDatabase) {
            if (pet.getId() == id) {
                return pet;
            }
        }

        return null;
    }

    @Override
    public List<Pet> getAllPets() {
        return myDummyDatabase;
    }

    @Override
    public boolean updatePet(Pet petPassedIn) {
        for (Pet pet : myDummyDatabase) {
            if (pet.getId() == petPassedIn.getId()) {
                pet = petPassedIn;
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean deletePetById(int id) {
        for (Pet pet : myDummyDatabase) {
            if (pet.getId() == id) {
                return myDummyDatabase.remove(pet);
            }
        }

        return false;
    }

    
}
