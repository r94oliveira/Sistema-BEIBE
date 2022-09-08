/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.beans.Atendimento;
import com.ufpr.tads.web2.dao.AtendimentoDAO;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class AtendimentoFacade {

    public static Atendimento cadastroAtendimento(Atendimento atendimento) {
        return AtendimentoDAO.cadastroAtendimento(atendimento);
    }

    public static List<Atendimento> consultaAtendimento(int idCliente) {
        return AtendimentoDAO.consultaAtendimento(idCliente);
    }

    public static List<Atendimento> listarTodosAtendimentosEmAberto() {
        return AtendimentoDAO.listarTodosAtendimentosEmAberto();
    }

    public static Atendimento resolverAtendimento(Atendimento atendimento) {
        return AtendimentoDAO.resolverAtendimento(atendimento);
    }

    public static List<Atendimento> listarTodosAtendimentos() {
        return AtendimentoDAO.listarTodosAtendimentos();
    }

    
}
