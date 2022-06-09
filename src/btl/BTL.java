/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adli789987
 */
public class BTL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Driver loading ..");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BTL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("Driver loaded");
        
        System.out.print("connection ...");
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");
        } catch (SQLException ex) {
            Logger.getLogger(BTL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("ket noi thanh cong");
    }
    
}
