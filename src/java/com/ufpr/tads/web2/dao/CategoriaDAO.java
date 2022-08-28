/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.dao;

import com.ufpr.tads.web2.beans.CategoriaProduto;
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
public class CategoriaDAO {
    
    public static CategoriaProduto inserir (CategoriaProduto categoria){
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = new ConnectionFactory().getConnection();
            String query = "INSERT INTO categoria_produto (nomeCategoria) VALUES (?);";
            st = conn.prepareStatement(query);
            st.setString(1, categoria.getNome());;
            st.executeUpdate();
            st.close();
            conn.close();
            System.out.println("inseriu");
            return categoria;   
        }
        catch (Exception e){
            System.out.println("nao inseriu");
            e.printStackTrace();
            return null; 
          
        }
    }

    public static int buscaCategoria(String Categoria) {
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        int idCategoria = 0;
        
        try{
            conn = new ConnectionFactory().getConnection();
            String queryc = "SELECT idCategoria From categoria WHERE nomeCategoria = ?";
            st = conn.prepareStatement(queryc);
            st.setString(1,Categoria);
            rs = st.executeQuery();
            while (rs.next()){
                idCategoria = rs.getInt("idCategoria");
            }
            return idCategoria;
        }
        catch (Exception e){
            System.out.println("nao consultou");
            e.printStackTrace();
            return 0; 
       }
    }
    
        
    }
    
    
