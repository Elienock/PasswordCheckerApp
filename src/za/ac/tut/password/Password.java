/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.password;

import javax.swing.JOptionPane;
import za.ac.tut.passwordexception.PasswordException;

/**
 *
 * @author Elienock
 */
public class Password {
    private String password;
    
    public Password(){
        this.password="n/a";
    }
    
    public Password(String password) throws PasswordException{
        setPassword(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        //Declare Variables
        int numOfSpecialCharacter=0,numOfDigits=0,numOfUpperCase=0,numOfLowerCase=0;
        
        if(password.length() < 8){
            throw new PasswordException(password + " Wrong length, enter 8 characters");
        }else{
            for(int i=0;i<password.length();i++){
                char charAtIndex= password.charAt(i);
                if(!Character.isLetterOrDigit(charAtIndex)){
                    numOfSpecialCharacter ++;
                }else if(Character.isDigit(charAtIndex)){
                    numOfDigits ++;
                }else if(Character.isUpperCase(charAtIndex)){
                    numOfUpperCase ++;
                }else if(Character.isLowerCase(charAtIndex)){
                    numOfLowerCase ++;
                }
            }
            
            if(numOfSpecialCharacter<2){
             throw new PasswordException( password + " Please enter 2 special characters");
            }else if(numOfDigits<3){
               throw new PasswordException(password +" Please enter 3 digits");
            }else if(numOfUpperCase <1){
                throw new PasswordException(password + " Please enter at least 1 Uppercase");
            }else if(numOfLowerCase<1){
                throw new PasswordException(password + " Please enter at least 1 lower case");
            }else{
             this.password=password;
            }
        }
    }
       
    
}
