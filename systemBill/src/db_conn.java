/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author STUDENT
 */
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author STUDENT
 */
public class db_conn {
    public static Connection getcon(){
    
    try{
    
            Class.forName("org.postgresql.Driver");
            Connection con  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UserInfo","admin","geonzon");
            return con;

    }
    catch(Exception e){
    
    return null;
    }
    
    
    }

}

