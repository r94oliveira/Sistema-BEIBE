/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.beans.TipoAtendimento;
import com.ufpr.tads.web2.dao.AtendimentoDAO;
import com.ufpr.tads.web2.exceptions.TipoAtendimentoException;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class TipoAtendimentoFacade {

    public static List<TipoAtendimento> consultaTipoAtendimento() throws TipoAtendimentoException {
         return AtendimentoDAO.consultaTipoAtendimento();
    }
    
}
