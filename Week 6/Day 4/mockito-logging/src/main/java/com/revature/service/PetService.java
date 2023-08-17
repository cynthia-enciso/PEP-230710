package com.revature.service;

import java.util.List;

import com.revature.model.Pet;

public interface PetService {

    List<Pet> getAllPets();

    Pet addPet(Pet pet);

    Pet getPetById(int id);

    boolean updatePet(Pet pet);

    boolean deletePetById(int id);

    // a bit more complex method
    public List<Pet> getAllPetsByVetId(int id);
    
}
