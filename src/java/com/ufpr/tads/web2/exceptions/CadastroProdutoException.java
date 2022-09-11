/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.exceptions;

/**
 *
 * @author katia
 */
public class CadastroProdutoException extends Exception {
    public CadastroProdutoException() {}
    
    public CadastroProdutoException(String string)
    {
        super(string);
    }
    
    public CadastroProdutoException(String string, Throwable thrwbl)
    {
        super(string, thrwbl);
    }
}
