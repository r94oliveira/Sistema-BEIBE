/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.dao;

import com.ufpr.tads.web2.beans.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author janai
 */
public class ProdutoDAO {

    public static Produto inserir(Produto produto) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = new ConnectionFactory().getConnection();
            String query = "INSERT INTO produto (descricaoProduto, pesoProduto, fk_Categoria_Produto_idCategoria, nomeProduto) VALUES (?,?,?,?);";
            st = conn.prepareStatement(query);
            st.setString(1,produto.getDescricao());
            st.setFloat(2,produto.getPeso());
            st.setInt(3,produto.getCategoria());
            st.setString(4,produto.getNome());
            
            st.executeUpdate();
            st.close();
            conn.close();
            System.out.println("inseriu");
            return produto;   
        }
        catch (Exception e){
            System.out.println("nao inseriu");
            e.printStackTrace();
            return null; 
          
        }
    }
    
}