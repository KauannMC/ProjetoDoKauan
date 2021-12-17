/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nextlevel.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 */
public class ConexaoDAO {
    
    public Connection ConectaBD(){
        Connection conn = null;
       
        
        try {
            String url = "jdbc:mysql//localhost:3306/nextlevelbd?user=teste&password=987654";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            }
        return conn;
        
    }
    
    
}
