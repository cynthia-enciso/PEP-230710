package com.revature.model;

public class Pet {
    // state
    private int id;
    private String name;
    private int age;
    private String species;
    private int vetId;
    
    // constructors
    public Pet() {}
    
    public Pet(String name, int age, String species, int vetId) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.vetId = vetId;
    }

    public Pet(int id, String name, int age, String species, int vetId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.species = species;
        this.vetId = vetId;
    }


    // getter and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public int getVetId() {
        return vetId;
    }
    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    @Override
    public String toString() {
        return "Pet [id=" + id + ", name=" + name + ", age=" + age + ", species=" + species + ", vetId=" + vetId + "]";
    }
    
    
}
