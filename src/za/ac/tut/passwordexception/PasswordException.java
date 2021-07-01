/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.passwordexception;

/**
 *
 * @author Elienock
 */
public class PasswordException extends Exception {
    public PasswordException(String errorMsg){
        super(errorMsg);
    }
}
