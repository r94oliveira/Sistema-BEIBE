/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.beans.Produto;
import com.ufpr.tads.web2.dao.ProdutoDAO;

/**
 *
 * @author janai
 */
public class CadastroProdutoFacade {
    
    public static Produto adicionaProduto(Produto produto){
            return ProdutoDAO.inserir(produto);
    }
    
    
    
    
    
}
