/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connectror;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nitesh
 */
public class jdbc {
    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tollbooth","root","kamath");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
}
