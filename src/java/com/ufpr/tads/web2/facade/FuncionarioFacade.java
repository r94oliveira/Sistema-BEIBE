/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.beans.Funcionario;
import com.ufpr.tads.web2.beans.Produto;
import com.ufpr.tads.web2.dao.GerenteDAO;
import com.ufpr.tads.web2.dao.ProdutoDAO;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class FuncionarioFacade {

    public static Produto cadastrarProduto(Produto p) {
        return ProdutoDAO.inserir(p);
    }

    public static List<Funcionario> listarTodosFuncionarios() {
        return GerenteDAO.listarTodosFuncionarios();
    }
    
}
