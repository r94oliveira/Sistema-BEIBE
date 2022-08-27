/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

/**
 *
 * @author janai
 */
public class CategoriaException extends Exception{
    public CategoriaException() {}
    
    public CategoriaException(String string)
    {
        super(string);
    }
    
    public CategoriaException(String string, Throwable thrwbl)
    {
        super(string, thrwbl);
    }
}

