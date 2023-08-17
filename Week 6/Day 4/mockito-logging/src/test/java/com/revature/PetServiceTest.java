package com.revature;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.*;
import org.mockito.*;

import com.revature.dao.PetDAO;
import com.revature.model.Pet;
import com.revature.service.PetService;
import com.revature.service.PetServiceImpl;

public class PetServiceTest {
    // specify which object to inject into
    @InjectMocks
    private PetService petService = new PetServiceImpl();

    // specify what to inject
    @Mock
    private PetDAO petDAOMock;

    @BeforeEach
    public void setUpTests() {
        // does actual injecting
        MockitoAnnotations.openMocks(this);
    }

    // test
    @Test
    public void test_getPetById_succeeds() {
        // arrange: create dummy info for dummy method to return
        Pet pet = new Pet(1, "Dobby", 3, "Dog", 1);
        when(petDAOMock.getPetById(1)).thenReturn(pet);

        // act: use actual implementation of object you are trying to test
        Pet petReturned = petService.getPetById(1);

        // assert
        assertEquals(pet, petReturned);
    }

    @Test
    public void test_getAllPetsByVetId_returned_list_is_of_correct_size() {
        // arrange
        List<Pet> testList = new ArrayList<>();
        Collections.addAll(testList, new Pet(1, "Candy", 1, "Dog", 1),
                                new Pet(2, "Torchy", 3, "Cat", 2),
                                new Pet(3, "Egg", 8, "Bird", 3),
                                new Pet(4, "Whiskers", 3, "Cat", 2),
                                new Pet(5, "Joe", 10, "Dog", 1));
        
        when(petDAOMock.getAllPets()).thenReturn(testList);

        // act
        List<Pet> listReturned = petService.getAllPetsByVetId(2);

        // assert
        assertTrue(listReturned.size() == 2);
    }

    @Test
    public void test_addPet_returns_null_if_not_stubbed() {
        assertEquals(false, petService.deletePetById(1));
    }

    @Test
    public void test_getAllPetsByVetId_calls_getAllPets_once() {
        // set up
        List<Pet> testList = new ArrayList<>();
                                            
        // stub
        when(petDAOMock.getAllPets()).thenReturn(testList);

        // just call it
        petService.getAllPetsByVetId(4);
        
        // verify(what obj, how many times).invocation()
        verify(petDAOMock, times(1)).getAllPets();

        // times(1) is the default, so same as
        verify(petDAOMock).getAllPets();

        verify(petDAOMock, atLeastOnce()).getAllPets();
    }
}
