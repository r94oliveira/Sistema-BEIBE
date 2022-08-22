/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.dao;

import com.ufpr.tads.web2.beans.Cliente;
import com.ufpr.tads.web2.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rafael
 */
public class ClienteDAO {
    public static Cliente inserir (Cliente c){
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        System.out.println(c.getNomecliente());
        System.out.println(c.getCepEnderecoCliente());
        try {
            conn = new ConnectionFactory().getConnection();
            String query = "INSERT INTO cliente (nomeCliente, sobrenomeCliente,emailCliente,cpfCliente,ruaEnderecoCliente,numeroEndercoCliente,complementoEnderecoCliente,bairroEnderecoCliente, cidadeEnderecoCliente, cepEnderecoCliente, estadoEnderecoCliente, telefoneCliente, senhaCliente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
            st = conn.prepareStatement(query);
            st.setString(1,c.getNomecliente());
            st.setString(2,c.getSobrenomeCliente());
            st.setString(3,c.getEmailCliente());
            st.setString(4,c.getCpfCliente());
            st.setString(5,c.getRuaEnderecoCliente());
            st.setInt(6,c.getNumeroEndercoCliente() );
            st.setString(7,c.getComplementoEnderecoCliente());
            st.setString(8,c.getBairroEnderecoCliente());
            st.setString(9,c.getCidadeEnderecoCliente());
            st.setString(10,c.getCepEnderecoCliente());
            st.setString(11,c.getEstadoEnderecoCliente());
            st.setString(12,c.getTelefoneCliente());
            st.setString(13,c.getSenhaCliente());
            System.out.println(st);
            st.executeUpdate();
            st.close();
            conn.close();
            System.out.println("inseriu");
            return c;   
        }
        catch (Exception e){
            System.out.println("nao inseriu");
            e.printStackTrace();
            return null; 
          
        }
    }
}
