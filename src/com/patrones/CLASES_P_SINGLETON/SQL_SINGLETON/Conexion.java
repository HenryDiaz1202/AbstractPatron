package com.patrones.CLASES_P_SINGLETON.SQL_SINGLETON;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private static Conexion connectInstance;
    private Connection connection;
    private final String URL = "jdbc:postgresql://localhost:5433/singletonDB";
    private final String USER = "root";
    private final String PASSWORD = "holamundo";

    private Conexion(){
        try{
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Conectado.");
        }catch (SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            System.out.println("OK");
        }
    }

    public static Conexion getInstance(){
        if(connectInstance == null){
            connectInstance = new Conexion();
        }
        return connectInstance;
    }

    public Connection getConnection(){
        return connection;
    }

}
