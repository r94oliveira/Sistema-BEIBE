/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.beans.Atendimento;
import com.ufpr.tads.web2.dao.AtendimentoDAO;
import com.ufpr.tads.web2.exceptions.AtendimentoException;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author Rafael
 */
public class AtendimentoFacade {

    public static Atendimento cadastroAtendimento(Atendimento atendimento) throws AtendimentoException {
        return AtendimentoDAO.cadastroAtendimento(atendimento);        
    }

    public static List<Atendimento> consultaAtendimento(int idCliente) throws AtendimentoException {
        return AtendimentoDAO.consultaAtendimento(idCliente);
    }

    public static List<Atendimento> listarTodosAtendimentosEmAberto() throws AtendimentoException {
        return AtendimentoDAO.listarTodosAtendimentosEmAberto();
    }

    public static Atendimento resolverAtendimento(Atendimento atendimento) throws AtendimentoException {
        return AtendimentoDAO.resolverAtendimento(atendimento);
    }

    public static List<Atendimento> listarTodosAtendimentos() throws AtendimentoException {
        return AtendimentoDAO.listarTodosAtendimentos();
    }

    public static void excluirAtendimento(int id) throws AtendimentoException {
        AtendimentoDAO.excluirAtendimento(id);
    }

    
}
