package com.revature.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Pet;

public class PetDAOmySQLImpl implements PetDAO {

    // connection information
    static String url = "jdbc:mysql://localhost:3306/pep2";
    static String username = "root";
    static String password = "pass";

    @Override
    public Pet getPetById(int id) {
         // 1. connect to db
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // 2. create statement
            Statement statement = connection.createStatement();

            // 3. execute statement
            ResultSet rs = statement.executeQuery("SELECT * FROM pets WHERE id = " + id);
            
            // 4. process results
            while (rs.next()) {
                // get the values from the record and save them somewhere
                int idReturned = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String species = rs.getString("species");
                int vetId = rs.getInt("vet_id");

                return new Pet(idReturned, name, age, species, vetId);
            }

            // 5. close connection
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        

        return null;
    }

    @Override
    public List<Pet> getAllPets() {
        // create variables needed
        List<Pet> pets = new ArrayList<>();
        Connection connection;

        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

             // execute query
            ResultSet rs = statement.executeQuery("SELECT * FROM pets");

            // process results
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String species = rs.getString("species");
                int vetId = rs.getInt("vet_id");

                pets.add(new Pet(id, name, age, species, vetId));
            }


        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        // finally {
        //     connection.close();
        // }

        return pets;
    }

    @Override
    public boolean addPet(Pet pet) {
        return true;
    }

    @Override
    public boolean updatePet(Pet pet) {
        return true;
    }

    @Override
    public boolean deletePetById(int id) {
        return true;
    }
    
}
