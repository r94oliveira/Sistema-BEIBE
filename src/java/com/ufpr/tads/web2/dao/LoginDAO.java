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
    
    public static  int logarCliente (Login login){
        Login log = login;
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        int idPessoa = 0;
        
        try{
            conn = new ConnectionFactory().getConnection();
            String queryc = "SELECT idPessoa, emailCliente, senhaCliente from cliente WHERE emailCliente = ? AND senhaCliente = ?";
            st = conn.prepareStatement(queryc);
            st.setString(1,log.getEmail());
            st.setString(2,log.getSenha());
            rs = st.executeQuery();
            while (rs.next()){
                idPessoa = rs.getInt("idPessoa");
            }
            return idPessoa;
        }
        catch (Exception e){
            System.out.println("nao consultou");
            e.printStackTrace();
            return 0; 
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
            String queryc = "SELECT idFuncionario, emailfuncionario, senhaFuncionario, cargo from funcionario WHERE emailFuncionario = ? AND senhaFuncionario = ?";
            st = conn.prepareStatement(queryc);
            st.setString(1,log.getEmail());
            st.setString(2,log.getSenha());
            rs = st.executeQuery();
            while (rs.next()){
                funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                funcionario.setCargoFuncionario(rs.getString("cargo"));
            }
            System.out.println(funcionario.getCargoFuncionario());
            return funcionario;
        }
        catch (Exception e){
            System.out.println("nao consultou");
            e.printStackTrace();
            return null; 
       }
    }
}
