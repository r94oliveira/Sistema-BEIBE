/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

/**
 *
 * @author janai
 */
public class FuncionarioException extends Exception {
    public FuncionarioException() {}
    
    public FuncionarioException(String string)
    {
        super(string);
    }
    
    public FuncionarioException(String string, Throwable thrwbl)
    {
        super(string, thrwbl);
    }
}
