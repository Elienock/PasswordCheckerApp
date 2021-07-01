/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordapp;

import javax.swing.JOptionPane;
import za.ac.tut.password.Password;
import za.ac.tut.passwordexception.PasswordException;

/**
 *
 * @author Elienock
 */
public class PasswordApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare Variables
        boolean doItAgain=false;
        
        do{
        try{
                //Creating an instance of password 
            Password password = new Password(JOptionPane.showInputDialog(null,"Please enter a password","Message",JOptionPane.INFORMATION_MESSAGE));
        
        //Display
        JOptionPane.showMessageDialog(null,"Good Password");
        //if it is a good password, end the program
        doItAgain=true;
        }catch(PasswordException pe){
            //display the error message
            JOptionPane.showMessageDialog(null,pe.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            //asked to enter the password again
           doItAgain=false;
        }
        }while(!doItAgain);
    }
    
}
