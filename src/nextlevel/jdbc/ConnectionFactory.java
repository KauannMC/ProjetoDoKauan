/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextlevel.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *

 */
public class ConnectionFactory {
    
   static public Connection getConnection(){
        try {
            //URL para conexão com o BD
            final String url = "jdbc:mysql://localhost:3306/nextlevelbd"
                    + "?verifyServerCertificate=false&useSSL=true";
            final String user = "teste";
            final String password = "987654";
            
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
