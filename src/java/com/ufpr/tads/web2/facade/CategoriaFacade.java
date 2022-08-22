/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.dao.CategoriaDAO;
import com.ufpr.tads.web2.beans.CategoriaProduto;

/**
 *
 * @author Rafael
 */
public class CategoriaFacade {
    CategoriaDAO categoriaDao = new CategoriaDAO();
    
    public static CategoriaProduto adicionaCategoria (CategoriaProduto categoria){
        return CategoriaDAO.inserir(categoria);
    }
    
    
}
