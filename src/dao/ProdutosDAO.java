/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author vinic
 */
public class ProdutosDAO {
    
    Connection c;
     PreparedStatement statement;
    ResultSet set;
    
    ArrayList<ProdutosDAO> lista= new ArrayList<>();
    
    public void cadastrar(){
        c= new coneccao.ConeccaoDAO().conectar();
    }
    
    public ArrayList<ProdutosDAO> listar(){
        return lista;
    }
      
}
