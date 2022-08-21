/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.beans.Funcionario;
import com.ufpr.tads.web2.beans.Login;
import com.ufpr.tads.web2.dao.LoginDAO;

/**
 *
 * @author Rafael
 */
public class LoginFacade {

    LoginDAO log = new LoginDAO();
    
    public static int logarCliente (Login login){
        int idPessoa = LoginDAO.logarCliente(login);
        return idPessoa;
    }
    
    public static Funcionario logarFuncionario(Login login) {
        return LoginDAO.logarFuncionario(login);
       
    }
}
