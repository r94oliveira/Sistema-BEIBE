/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

/**
 *
 * @author janai
 */
public class FerramentasException extends Exception {
    public FerramentasException() {}
    
    public FerramentasException(String string)
    {
        super(string);
    }
    
    public FerramentasException(String string, Throwable thrwbl)
    {
        super(string, thrwbl);
    }    
}
