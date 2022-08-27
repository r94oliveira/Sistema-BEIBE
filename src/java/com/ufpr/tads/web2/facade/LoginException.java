/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

/**
 *
 * @author janai
 */
public class LoginException extends Exception {
  
    
    public LoginException(String string)
    {
        super(string);
    }
    
    public LoginException(String string, Throwable thrwbl)
    {
        super(string, thrwbl);
    }  
}
