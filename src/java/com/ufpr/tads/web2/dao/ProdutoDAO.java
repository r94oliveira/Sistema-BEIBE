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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author janai
 */
public class  ProdutoDAO {

    public static Produto inserir(Produto produto) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = new ConnectionFactory().getConnection();
            String query = "INSERT INTO produto (descricaoProduto, pesoProduto, fk_Categoria_Produto_idCategoria, nomeProduto) VALUES (?,?,?,?);";
            st = conn.prepareStatement(query);
            st.setString(1,produto.getDescricao());
            st.setDouble(2,produto.getPeso());
            st.setInt(3,produto.getCategoria());
            st.setString(4,produto.getNome());
            st.executeUpdate();
            st.close();
            conn.close();
            System.out.println("inseriu um produto novo");
            return produto;   
        }
        catch (Exception e){
            System.out.println("nao inseriu");
            e.printStackTrace();
            return null; 
          
        }
    }

    public static List<Produto> consultaProdutos() {
         Connection conn = null;
         PreparedStatement st = null;
         ResultSet rs = null;
         List<Produto> produtos = new ArrayList<Produto>();
         
            try{
                conn = new ConnectionFactory().getConnection();
                String queryc = "SELECT * From produto";
                st = conn.prepareStatement(queryc);
                rs = st.executeQuery();
                while (rs.next()){
                    Produto produto = new Produto();
                    produto.setCategoria(rs.getInt("fk_Categoria_Produto_idCategoria"));
                    produto.setDescricao(rs.getString("descricaoProduto"));
                    produto.setIdProduto(rs.getInt("idProduto"));
                    produto.setNome(rs.getString("nomeProduto"));
                    produto.setPeso(rs.getDouble("pesoProduto"));
                     System.out.println("TEM QUE SOLTAR UM NOME AQUI EM BAIXO");
                    System.out.println(produto.getNome());
                    produtos.add(produto);
                }
                return produtos;
            }
            catch (Exception e){
                System.out.println("nao consultou");
                e.printStackTrace();
                return null; 
           }
    }

    public static void excluirProduto(String id) {
                   
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        int idProduto = Integer.parseInt(id);
        
        try{
            conn = new ConnectionFactory().getConnection();
            String queryc = "DELETE from produto WHERE idProduto= ? ;";
            st = conn.prepareStatement(queryc);
            st.setInt(1, idProduto);
            st.executeUpdate();
            st.close();
            conn.close();
            System.out.println("excluiu o produto");
            return;   
        }
        catch (Exception e){
            System.out.println("nao excluiu");
            e.printStackTrace();
            return ; 
          
        
    }
    }

    public static int verificaExisteProduto(String p) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        String produtoBanco = null;
         
            try{
                conn = new ConnectionFactory().getConnection();
                String queryProduto = "SELECT nomeProduto FROM produto WHERE nomeProduto = ?";
                st = conn.prepareStatement(queryProduto);
                st.setString(1, p);
                rs = st.executeQuery();
                
                while (rs.next()){
                    produtoBanco = rs.getString("nomeProduto");
                 
                    if(produtoBanco != null){
                    return 1;   
                    }              
                }
            }
                
            catch (Exception e){
                System.out.println("nao buscou no banco");
                e.printStackTrace();
                return 0; 
            }
             return 0;
    }
    
}