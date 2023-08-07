package com.revature.dao;

import java.util.List;

import com.revature.model.Pet;

// defines what interactions we can have with the Pet table

public interface PetDAO {
    
    // CRUD operations

    // CREATE
    public Pet addPet(Pet pet);

    // READ
    public Pet getPetById(int id);

    public List<Pet> getAllPets();
    
    // UPDATE
    public boolean updatePet(Pet pet);

    // DELETE
    public boolean deletePetById(int id);
    
}
