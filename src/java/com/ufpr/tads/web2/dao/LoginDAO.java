/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.dao;

import com.ufpr.tads.web2.beans.Cliente;
import com.ufpr.tads.web2.beans.Funcionario;
import com.ufpr.tads.web2.beans.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class LoginDAO {
    
    public static  Cliente logarCliente (Login login){
        Login log = login;
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        Cliente cliente = new Cliente();
        
        try{
            conn = new ConnectionFactory().getConnection();
            String queryc = "SELECT idPessoa, emailCliente, senhaCliente, nomeCliente from cliente WHERE emailCliente = ? AND senhaCliente = ?";
            st = conn.prepareStatement(queryc);
            st.setString(1,log.getEmail());
            st.setString(2,log.getSenha());
            rs = st.executeQuery();
            while (rs.next()){
                cliente.setIdCliente(rs.getInt("idPessoa"));
                cliente.setNomecliente(rs.getString("nomeCliente"));
            }
            return cliente;
        }
        catch (Exception e){
            System.out.println("nao consultou");
            e.printStackTrace();
            cliente.setIdCliente(0);
            return cliente; 
       }
    }
    
       public static Funcionario logarFuncionario (Login login){
        Login log = login;
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        Funcionario funcionario = new Funcionario();
        
        try{
            conn = new ConnectionFactory().getConnection();
            String queryc = "SELECT idFuncionario, emailfuncionario, senhaFuncionario, nomeFuncionario, cargo from funcionario WHERE emailFuncionario = ? AND senhaFuncionario = ?";
            st = conn.prepareStatement(queryc);
            st.setString(1,log.getEmail());
            st.setString(2,log.getSenha());
            rs = st.executeQuery();
            while (rs.next()){
                funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                funcionario.setNomeFuncionario(rs.getString("nomeFuncionario"));
                funcionario.setCargoFuncionario(rs.getString("cargo"));
            }
            
            return funcionario;
        }
        catch (Exception e){
            System.out.println("nao consultou");
            e.printStackTrace();
            return null; 
       }
    }
}
