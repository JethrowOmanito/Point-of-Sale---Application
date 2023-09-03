/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication9;


import java.sql.DriverManager;
import java.sql.Connection;


public class database {
    
    
    
    public static Connection connectDB(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/possystem", "root", "");
          
            return connect;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    
}
