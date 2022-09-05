/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.exceptions;

/**
 *
 * @author janai
 */
public class AtendimentoException extends Exception {
    public AtendimentoException() {}
    
    public AtendimentoException(String string)
    {
        super(string);
    }
    
    public AtendimentoException(String string, Throwable thrwbl)
    {
        super(string, thrwbl);
    }
}

