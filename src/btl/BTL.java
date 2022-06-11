/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
//        System.out.print("Driver loading ..");
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(BTL.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.print("Driver loaded");
//        
//        System.out.print("connection ...");
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");
//        } catch (SQLException ex) {
//            Logger.getLogger(BTL.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.print("ket noi thanh cong");
    
//write file
        String username = "nhom11";
        String password = "123456";

        try {
            try {
                FileWriter fw = new FileWriter("data.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(username);
                bw.newLine();
                bw.write(password);
                
                bw.close();
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
       //read file
       FileReader reader = null;
		BufferedReader bufferedReader = null;
		
		try {
			reader = new FileReader("data.txt");
			bufferedReader = new BufferedReader(reader);
			
//			//hien thi tung dong
			String line;
//			line= bufferedReader.readLine();
//			System.out.println(line);
		
			// hien thi toan file
			while((line = bufferedReader.readLine()) !=null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

       
    }

}
