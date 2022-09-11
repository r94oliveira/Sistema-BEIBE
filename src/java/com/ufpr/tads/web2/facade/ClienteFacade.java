/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.beans.Cliente;
import com.ufpr.tads.web2.dao.ClienteDAO;
import com.ufpr.tads.web2.exceptions.ClienteException;

/**
 *
 * @author katia
 */
public class ClienteFacade {
   // ClienteDAO clienteDao = new ClienteDAO();
    
    public static Cliente adicionaCliente(Cliente cliente) throws ClienteException {
            return ClienteDAO.inserir(cliente);
    }

    public static int verificaCliente(Cliente c) throws ClienteException {
            return ClienteDAO.verificaExiste(c);
    }

    public static Cliente consultaCliente(int idCliente) throws ClienteException{
        return ClienteDAO.consultaCliente(idCliente);
    }

    public static int alteraCliente(Cliente c) throws ClienteException {
        return ClienteDAO.alteraCliente(c);
    }
}
