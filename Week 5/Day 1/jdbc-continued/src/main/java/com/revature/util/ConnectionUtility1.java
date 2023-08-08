package com.revature.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectionUtility1 {

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
        InputStream input = ConnectionUtility1.class.getResourceAsStream("/config1.properties");
        Properties properties = new Properties();
        try {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // get the related value from the environment variables
        url = properties.getProperty("CONNECTION_URL");
        username = properties.getProperty("CONNECTION_USERNAME");
        password = properties.getProperty("CONNECTION_PASSWORD");
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
