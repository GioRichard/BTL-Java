/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl.view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author adli789987
 */
class Validation {
        public static boolean isEmpty(JTextField txtField, String mgs){
        String txtValue = txtField.getText().trim();
        if(txtValue.length() == 0){
            JOptionPane.showMessageDialog(null, mgs);
            txtField.setBackground(Color.yellow);
            txtField.requestFocus();
            return true;          
        }
            txtField.setBackground(Color.white);
            return false;
        }
      

        public static boolean isTextName(JTextField txtField, String mgs){
        String txtValue = txtField.getText().trim();
        String str ="^([a-vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ]+)((\\s{1}[a-vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ]+){1,})$";
        
        if(txtValue.matches(str)){
            txtField.requestFocus();
            return true;          
        }
        JOptionPane.showMessageDialog(null, mgs);
            txtField.setBackground(Color.white);
            return false;
        }
      
            
        public static boolean isNumber(JTextField txtField, String mgs){
        String txtValue = txtField.getText().trim();
        String str =".*\\D.*";
        if(txtValue.matches(str)){
            JOptionPane.showMessageDialog(null, mgs);
            txtField.setBackground(Color.yellow);
            txtField.requestFocus();
            return false;          
        }
            txtField.setBackground(Color.white);
            return true;
        }
}
