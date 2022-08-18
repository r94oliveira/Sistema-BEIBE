/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.dao;

import com.ufpr.tads.web2.beans.LoginBean;
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
    
    /*
    public static LoginBean logar (LoginBean login){
        LoginBean log = login;
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            conn = new ConnectionFactory().getConnection();
            String queryc = "SELECT emailCliente, senhaCliente from cliente WHERE"
                    + "emailCliente = ? AND senhaCliente = ?";
            st = conn.prepareStatement(queryc);
            st.setString(1,log.getEmail());
            st.setString(2,log.getSenha());
            rs = st.executeQuery();
            if (rs.next()){
                //verificar, caso nao tenha na tabela cliente, ir para a tabela funcionario
                String queryf = "SELECT emailCliente, senhaCliente, cargo from cliente WHERE"
                    + "emailCliente = ? AND senhaCliente = ?";
                st = conn.prepareStatement(queryf);
                st.setString(1,log.getEmail());
                st.setString(2,log.getSenha());
                rs = st.executeQuery();
                
            }
        
        }
        catch (Exception e){
       
       }
    }*/
 
}
