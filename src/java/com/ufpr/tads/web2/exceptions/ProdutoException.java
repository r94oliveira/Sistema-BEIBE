/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.exceptions;

/**
 *
 * @author janai
 */
public class ProdutoException extends Exception{
    public ProdutoException() {}
    
    public ProdutoException(String string)
    {
        super(string);
    }
    
    public ProdutoException(String string, Throwable thrwbl)
    {
        super(string, thrwbl);
    }
}
