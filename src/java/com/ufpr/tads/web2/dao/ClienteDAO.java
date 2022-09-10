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
        
        
        try {
            conn = new ConnectionFactory().getConnection();
            String query = "INSERT INTO cliente (nomeCliente, sobrenomeCliente,emailCliente,cpfCliente,ruaEnderecoCliente,numeroEndercoCliente,complementoEnderecoCliente,bairroEnderecoCliente, cidadeEnderecoCliente, cepEnderecoCliente, estadoEnderecoCliente, telefoneCliente, senhaCliente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,aes_encrypt(?,'beibe'));";
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

    public static int verificaExiste(Cliente c) {
        Connection conn = null;
        PreparedStatement st = null;
        PreparedStatement st2 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        String cpfCliente = null;
        String emailCliente = null;
        
        try{
            conn = new ConnectionFactory().getConnection();
            String queryc = "SELECT cpfCliente From cliente WHERE cpfCliente = ?";
            String queryEmail = "SELECT emailCliente From cliente WHERE emailCliente = ?";
            st = conn.prepareStatement(queryc);
            st2 = conn.prepareStatement(queryEmail);
            st.setString(1,c.getCpfCliente());
            st2.setString(1,c.getEmailCliente());
            rs = st.executeQuery();
            rs2 = st2.executeQuery();
            while (rs.next()){
                cpfCliente = rs.getString("cpfCliente");
            }
            
            while(rs2.next()){
                emailCliente = rs2.getString("emailCliente");
            
            }
            // se cpf cliente DIFERENTE DE NULL e email diferente de null quer dizer que tem o dado no banco então retorna 1
            if (cpfCliente!=null || emailCliente!=null){
            return 1;
            }
        }
           catch (Exception e){
            System.out.println("nao consultou");
            e.printStackTrace();
            return 0; 
       }
        return 0;
    }

    public static Cliente consultaCliente(int idCliente) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        Cliente cliente = new Cliente();
        
             
        try{
            conn = new ConnectionFactory().getConnection();
            String queryc = "SELECT nomeCliente, sobrenomeCliente,emailCliente,cpfCliente,ruaEnderecoCliente,numeroEndercoCliente,complementoEnderecoCliente,bairroEnderecoCliente, cidadeEnderecoCliente, cepEnderecoCliente, estadoEnderecoCliente, telefoneCliente, senhaCliente from cliente where idPessoa = ?";
            st = conn.prepareStatement(queryc);
            st.setInt(1,idCliente);
            rs = st.executeQuery();
            while (rs.next()){
                cliente.setIdCliente(idCliente);
                cliente.setNomecliente(rs.getString("nomeCliente"));
                cliente.setSobrenomeCliente(rs.getString("sobrenomeCliente"));
                cliente.setEmailCliente(rs.getString("emailCliente"));
                cliente.setCpfCliente(rs.getString("cpfCliente"));
                cliente.setRuaEnderecoCliente(rs.getString("ruaEnderecoCliente"));
                cliente.setNumeroEndercoCliente(rs.getInt("numeroEndercoCliente"));
                cliente.setComplementoEnderecoCliente(rs.getString("complementoEnderecoCliente"));
                cliente.setBairroEnderecoCliente(rs.getString("bairroEnderecoCliente"));
                cliente.setCidadeEnderecoCliente(rs.getString("cidadeEnderecoCliente"));
                cliente.setCepEnderecoCliente(rs.getString("cepEnderecoCliente"));
                cliente.setEstadoEnderecoCliente(rs.getString("estadoEnderecoCliente"));
                cliente.setTelefoneCliente(rs.getString("telefoneCliente"));
                              
            }
            st.close();
            conn.close();
            return cliente;
               
            
        }
           catch (Exception e){
            System.out.println("nao consultou");
            e.printStackTrace();
            return cliente;
       }
        
        
    }

    public static int alteraCliente(Cliente c) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        System.out.println(c.getNomecliente());
        System.out.println(c.getCepEnderecoCliente());
        try {
            conn = new ConnectionFactory().getConnection();
            String query = "UPDATE cliente SET nomeCliente = ?, sobrenomeCliente= ?, emailCliente= ?, cpfCliente= ?,ruaEnderecoCliente= ?,numeroEndercoCliente = ?,complementoEnderecoCliente = ?,bairroEnderecoCliente = ?, cidadeEnderecoCliente = ?, cepEnderecoCliente = ?, estadoEnderecoCliente = ?, telefoneCliente = ? WHERE idPessoa = ?";
            //
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
            st.setInt(13, c.getIdCliente());
            System.out.println(st);
            st.executeUpdate();
            st.close();
            conn.close();
            System.out.println("inseriu");
            
            
            return 1;
            
        }
        catch (Exception e){
            System.out.println("nao inseriu");
            e.printStackTrace();
            return 0; 
          
        }
    
    }
    

}
