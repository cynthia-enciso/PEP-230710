package com.revature.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectionUtility {

    // connection information
    private static String url;
    private static String username;
    private static String password;

    static {
        InputStream input = ConnectionUtility.class.getResourceAsStream("/config.properties");
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
