package com.revature;

import java.sql.*;

import com.revature.dao.PetDAO;
import com.revature.dao.PetDAODummyImpl;
import com.revature.dao.PetDAOmySQLImpl;

public class App {

    // connection information
    static String url = "jdbc:mysql://localhost:3306/pep2";
    static String username = "root";
    static String password = "pass";

    public static void main( String[] args ) {
        PetDAO myDAO = new PetDAOmySQLImpl();
        System.out.println(myDAO.getAllPets());
        System.out.println(myDAO.getPetById(1));
        
        myDAO = new PetDAODummyImpl();
        System.out.println(myDAO.getAllPets());
        System.out.println(myDAO.getPetById(1));

        // testConnection();
    }

    // attempt to connection
    public static void testConnection() {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection is valid:" + connection.isValid(5));
            connection.close();
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
