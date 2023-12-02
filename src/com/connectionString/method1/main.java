package com.connectionString.method1;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {

        Connection c = new connection().getConnected();
        Statement s=c.createStatement();
        ResultSet r=s.executeQuery("select * from achraf");
        if(r.next()){
            System.out.println("good");

        }
    }}

