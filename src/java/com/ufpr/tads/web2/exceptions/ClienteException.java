/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.exceptions;

/**
 *
 * @author janai
 */
public class ClienteException extends Exception {
    public ClienteException() {}
    
    public ClienteException(String string)
    {
        super(string);
    }
    
    public ClienteException(String string, Throwable thrwbl)
    {
        super(string, thrwbl);
    }
}
