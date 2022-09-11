/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.dao.CategoriaDAO;
import com.ufpr.tads.web2.exceptions.BuscaCategoriaException;

/**
 *
 * @author janai
 */
public class BuscaCategoriaFacade {
    
    public static int buscaCategoria(String Categoria) throws BuscaCategoriaException {
        
    return CategoriaDAO.buscaCategoria(Categoria);
    }
    
    
}
