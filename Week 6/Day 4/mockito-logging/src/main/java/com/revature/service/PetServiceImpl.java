package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.dao.PetDAO;
import com.revature.dao.PetDAOmySQLImpl;
import com.revature.model.Pet;

public class PetServiceImpl implements PetService {

    // dependency
    PetDAO petDAO;

    public PetServiceImpl() {
        this.petDAO = new PetDAOmySQLImpl();
    }


    @Override
    public List<Pet> getAllPets() {
        return petDAO.getAllPets();
    }

    @Override
    public Pet addPet(Pet pet) {
        // age > 0, name and species are not just whitespace
        if (pet.getAge() > 0 && !pet.getSpecies().isEmpty() && !pet.getName().isEmpty()) {
            return petDAO.addPet(pet);
        }

        return null;
    }

    @Override
    public Pet getPetById(int id) {
            return petDAO.getPetById(id);
    }

    @Override
    public boolean updatePet(Pet pet) {
        if (pet.getAge() > 0 && !pet.getSpecies().isEmpty() && !pet.getName().isEmpty()) {
            return petDAO.updatePet(pet);
        }

        return false;
    }

    @Override
    public boolean deletePetById(int id) {
        return petDAO.deletePetById(id);
    }
    
    @Override
    public List<Pet> getAllPetsByVetId(int id) {
        List<Pet> allPetsReturned = petDAO.getAllPets();
		List<Pet> allPetsById = new ArrayList<>();
		
		for (Pet pet : allPetsReturned) {
            if (pet.getVetId() == id) {
                allPetsById.add(pet);
            }
        }
	
		return allPetsById;
    }
}
