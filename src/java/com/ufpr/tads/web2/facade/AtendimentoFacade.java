/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.beans.Atendimento;
import com.ufpr.tads.web2.dao.AtendimentoDAO;

/**
 *
 * @author Rafael
 */
public class AtendimentoFacade {

    public static Atendimento cadastroAtendimento(Atendimento atendimento) {
        return AtendimentoDAO.cadastroAtendimento(atendimento);
    }
    
}
