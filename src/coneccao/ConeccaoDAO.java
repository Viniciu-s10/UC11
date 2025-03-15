/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coneccao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author vinic
 */
public class ConeccaoDAO {
    
    public Connection conectar(){
        Connection c= null;
        
        try{
            c= DriverManager.getConnection("jdbc:mysql://localhost/uc11", "root", 
                    "R2d2/bb80");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao Tentar Conectar"+ e.getMessage());
        }
        return c;
    }
}
