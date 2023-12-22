/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframe;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Krishna
 */
public class DBConnection {
    static Connection con= null;
    public static Connection getConnection()
    {
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con= DriverManager.getConnection("jdbc:mysql://localhost:2000/krisan","root","12345678"); 
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
    
}
