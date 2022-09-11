/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.dao.CategoriaDAO;
import com.ufpr.tads.web2.beans.CategoriaProduto;
import com.ufpr.tads.web2.exceptions.CategoriaException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class CategoriaFacade {


    CategoriaDAO categoriaDao = new CategoriaDAO();
    
    public static CategoriaProduto adicionaCategoria (CategoriaProduto categoria) throws CategoriaException {
        return CategoriaDAO.inserir(categoria);
    }
    
    public static String excluirCategoria (String id) throws CategoriaException {
        return CategoriaDAO.excluirCategoria(id);
    }
    
    public static List<CategoriaProduto> consultaCategoria () throws CategoriaException {
        return CategoriaDAO.consultaCategoria();
    }
    
    public static int verificaExisteCategoria(String categoria) throws CategoriaException {
        return  CategoriaDAO.verificaExisteCategoria(categoria);
    }
      
    
}
