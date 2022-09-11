/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.beans.Produto;
import com.ufpr.tads.web2.dao.ProdutoDAO;
import com.ufpr.tads.web2.exceptions.ProdutoException;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class ProdutosFacade {

    public static List<Produto> consultaProdutos() throws ProdutoException {
        return ProdutoDAO.consultaProdutos();
    }

    public static void excluirProduto(String id) throws ProdutoException {
        ProdutoDAO.excluirProduto(id);
    }

    public static int verificaExisteProduto(String p) throws ProdutoException {
        return ProdutoDAO.verificaExisteProduto(p);
        
    }    
    
    
}
