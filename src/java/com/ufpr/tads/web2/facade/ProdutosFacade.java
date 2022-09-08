/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.beans.Produto;
import com.ufpr.tads.web2.dao.ProdutoDAO;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class ProdutosFacade {

    public static List<Produto> consultaProdutos() {
        return ProdutoDAO.consultaProdutos();
    }

    public static void excluirProduto(String id) {
        ProdutoDAO.excluirProduto(id);
    }

    public static int verificaExisteProduto(String p) {
        return ProdutoDAO.verificaExisteProduto(p);
        
    }    
    
    
}
