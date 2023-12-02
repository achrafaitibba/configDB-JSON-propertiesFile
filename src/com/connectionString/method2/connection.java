package com.connectionString.method2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.xdevapi.JsonParser;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


public class connection {


    public Connection getConnected() throws SQLException, ClassNotFoundException, IOException {
        String jsonString = new String(Files.readAllBytes(Paths.get("config.json")));
        Object obj= JSONValue.parse(jsonString);
        JSONObject jsonObject = (JSONObject) obj;


        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(jsonObject.get("url").toString(),
                jsonObject.get("user").toString(),
                jsonObject.get("password").toString());
    }
}
