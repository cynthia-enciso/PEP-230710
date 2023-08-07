package com.revature.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectionUtility2 {

    // connection information
    private static String url;
    private static String username;
    private static String password;

    // static initialization block: if you have multiple steps to initalize a variable
    static {
        // read from properties file:
        // https://docs.oracle.com/javase/8/docs/technotes/guides/lang/resources.html
        // Class class allows us to interact with the class itself
        // read from properties file
        // use a location-independent way to locate a resource:
        // getResourceAsStream = get the path to the resource then return its content as a stream
        InputStream input = ConnectionUtility2.class.getResourceAsStream("/config2.properties");
        Properties properties = new Properties();
        try {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // properties in properties file are the relevant key from the environment variables
        String envURLKey = properties.getProperty("CONNECTION_URL");
        String envUsernameKey = properties.getProperty("CONNECTION_USERNAME");
        String envPasswordKey = properties.getProperty("CONNECTION_PASSWORD");
        
        // assign variables with actual credential values that environment variables store
        url = System.getenv(envURLKey);
        username = System.getenv(envUsernameKey);
        password = System.getenv(envPasswordKey);
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
