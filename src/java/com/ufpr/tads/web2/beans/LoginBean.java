/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.beans;

import java.io.Serializable;

/**
 *
 * @author Rafael
 */
public class LoginBean implements Serializable {
    private String nome;
    private int id;
    
    public LoginBean() {}
    
    public LoginBean(int id, String nome){
        this.id   = id;
        this.nome = nome;
    }
    
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
}
