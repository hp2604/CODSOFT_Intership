
package com.codsoft.studentmanagementsystem.connection;
import java.sql.*;


public class ConnectionProvider {
    private Connection con;
    private String url="jdbc:mysql://localhost:3306/student";
    private String username="root";
    private String password="Harsh2604";
    public  Connection getConnection()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.getConnection(url,username,password);
        } 
        catch (Exception e) {
            System.out.print("Error obtain");
            
        }
        return con;
    }
    
}
