/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.beans.Funcionario;
import com.ufpr.tads.web2.dao.GerenteDAO;

/**
 *
 * @author janai
 */
public class GerenteFacade {

    public static void cadastrarFuncionario(Funcionario funcionario) {
        
        GerenteDAO.cadastrarFuncionario(funcionario);
        
    }

    public static int verificaFuncionario(Funcionario funcionario) {
        return GerenteDAO.verificaFuncionario(funcionario);
    }
    
}
