package com.connectionString.method1;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class connection {
    public Connection getConnected() throws SQLException, ClassNotFoundException, IOException {

        Properties properties=new Properties();
        try (InputStream is = new FileInputStream("configuration.properties")) {
            properties.load(is);
        }

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
                properties.getProperty("dataBase.url"),
                properties.getProperty("dataBase.user"),
                properties.getProperty("dataBase.password"));
    }
}
