package com.example.web;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
  
// This class can be used to initialize the database connection 
public class DatabaseConnection { 
    protected static Connection initializeDatabase() 
        throws SQLException, ClassNotFoundException 
    { 
    try{

        // Initialize all the information regarding 
        // Database Connection 
        String dbDriver = "com.mysql.jdbc.Driver"; 
        String dbURL = "jdbc:mysql://localhost:3306/Products"; 
        // Database name to access 
        String dbName = "Products"; 
        String dbUsername = "root"; 
        String dbPassword = "****"; 
  
        Class.forName(dbDriver).newInstance();
		java.sql.Connection con;
        con = DriverManager.getConnection(dbURL + dbName, 
                                                     dbUsername,  
                                                     dbPassword); 
        return con; 
        }
        catch(Exception e) { 
            e.printStackTrace(); 
            System.out.print(e);
            return null;
        } 
    } 
} 
