/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.beans.Funcionario;
import com.ufpr.tads.web2.dao.GerenteDAO;
import com.ufpr.tads.web2.exceptions.GerenteException;

/**
 *
 * @author janai
 */
public class GerenteFacade {

    

    public static void cadastrarFuncionario(Funcionario funcionario) throws GerenteException {
        
        GerenteDAO.cadastrarFuncionario(funcionario);
        
    }

    public static int verificaFuncionario(Funcionario funcionario) throws GerenteException {
        return GerenteDAO.verificaFuncionario(funcionario);
    }

    public static int countTodosAtendimentos() throws GerenteException {
        return GerenteDAO.countTodosAtendimentos();
    }

    public static int countTodosAtendimentosEmAberto() throws GerenteException {
        return GerenteDAO.countTodosAtendimentosEmAberto();
    }

    public static int countReclamacoes() throws GerenteException {
         return GerenteDAO.countReclamacoes();
    }

    public static int countReclamacoesEmAberto() throws GerenteException {
        return GerenteDAO.countReclamacoesEmAberto();
    }

    public static int countInformacoes() throws GerenteException {
        return GerenteDAO.countInformacao();
    }

    public static int countInformacoesEmAberto() throws GerenteException {
         return GerenteDAO.countInformacoesEmAberto();
    }

    public static int countElogio() throws GerenteException {
        return GerenteDAO.countElogio();
    }

    public static int countElogioEmAberto() throws GerenteException {
         return GerenteDAO.countElogioEmAberto();
    }

    public static void alterarFuncionario(Funcionario funcionario) throws GerenteException {
        GerenteDAO.alterarFuncionario(funcionario);
    }

    public static int countSugestao() {
       return GerenteDAO.countSugestao();
    }

    public static int countSugestaoEmAberto() {
        return GerenteDAO.countSugestaoEmAberto();
    }

    
}
