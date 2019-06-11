/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    Statement st;
    Connection cn;
    public Connection Conexion (){
        
       try {
           Class.forName("org.gjt.mm.mysql.Driver");
           cn = DriverManager.getConnection("jdbc:mysql://localhost/supermercado","root","");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println(e.getMessage());
       }
       return cn;
    }
}
