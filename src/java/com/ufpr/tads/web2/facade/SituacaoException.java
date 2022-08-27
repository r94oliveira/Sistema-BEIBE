/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

/**
 *
 * @author janai
 */
public class SituacaoException extends Exception {
    public SituacaoException() {}
    
    public SituacaoException(String string)
    {
        super(string);
    }
    
    public SituacaoException(String string, Throwable thrwbl)
    {
        super(string, thrwbl);
    }
}
