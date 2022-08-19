/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.beans.Cliente;
import com.ufpr.tads.web2.dao.ClienteDAO;

/**
 *
 * @author katia
 */
public class ClienteFacade {
    public static Cliente adicionaCliente(Cliente cliente){
           // String senhaCriptografada = Ferramentas.criptografaSenha(cliente.getSenha());
            //cliente.setSenha(senhaCriptografada);
            ClienteDAO clienteDao = new ClienteDAO();
            Cliente clienteNovo = clienteDao.inserir(cliente);
            return clienteNovo;
    }
}
