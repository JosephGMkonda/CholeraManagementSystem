/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFrame;
import java.sql.*;

/**
 *
 * @author Joseph Mkonda
 */
public class DBConnection {
    
    static Connection conn = null;
    
    public static Connection getConnection(){
        
          try{
        
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cholera_ms","root","");
        
        
        
    }catch(Exception e){
        e.printStackTrace();
        
    }
          return conn;
    }
  
    
}
