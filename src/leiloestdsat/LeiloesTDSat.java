/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leiloestdsat;

import coneccao.ConeccaoDAO;

/**
 *
 * @author vinic
 */
public class LeiloesTDSat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConeccaoDAO c= new ConeccaoDAO();
         c.conectar();
    }
    
}
