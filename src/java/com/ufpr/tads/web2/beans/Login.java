/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.web2.beans;

import java.io.Serializable;


public class Login implements Serializable {
    private String email;
    private String senha;
    
    public Login() {}
    
    public Login(String email, String senha){
        this.email   = email;
        this.senha = senha;
    }
    
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setSenha (String senha){
        this.senha = senha;
    }
}
