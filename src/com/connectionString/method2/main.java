package com.connectionString.method2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {

        Connection c = new connection().getConnected();
        Statement s = c.createStatement();
        ResultSet r = s.executeQuery("select * from student");


        if (r.next()) {
            System.out.println(r.getString(1));


        }
    }
}
