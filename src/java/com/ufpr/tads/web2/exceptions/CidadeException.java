/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.exceptions;

/**
 *
 * @author janai
 */
public class CidadeException extends Exception{
    public CidadeException() {}
    
    public CidadeException(String string)
    {
        super(string);
    }
    
    public CidadeException(String string, Throwable thrwbl)
    {
        super(string, thrwbl);
    }
}
