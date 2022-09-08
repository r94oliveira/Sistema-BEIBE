/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.dao;

import com.ufpr.tads.web2.beans.Atendimento;
import com.ufpr.tads.web2.beans.TipoAtendimento;
import com.ufpr.tads.web2.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class AtendimentoDAO {

    public static List<TipoAtendimento> consultaTipoAtendimento() {
         Connection conn = null;
         PreparedStatement st = null;
         ResultSet rs = null;
         List<TipoAtendimento> tipoAtendimento = new ArrayList<TipoAtendimento>();
         
         try{
                conn = new ConnectionFactory().getConnection();
                String queryc = "SELECT * From tipo_atendimento";
                st = conn.prepareStatement(queryc);
                rs = st.executeQuery();
                while (rs.next()){
                    TipoAtendimento tipoAtendi = new TipoAtendimento();
                    tipoAtendi.setNome(rs.getString("nomeTipoAtendimento"));
                    tipoAtendi.setIdTipo(rs.getInt("idTipoAtendimento"));
                    System.out.println(tipoAtendi.getIdTipo());
                    System.out.println(tipoAtendi.getNome());
                    tipoAtendimento.add(tipoAtendi);
                }
                return tipoAtendimento;
            }
            catch (Exception e){
                System.out.println("nao consultou");
                e.printStackTrace();
                return null; 
           }
    }

    public static Atendimento cadastroAtendimento(Atendimento atendimento) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try {
            conn = new ConnectionFactory().getConnection();
            String query = "INSERT INTO atendimento (descricaoAtendimento, situacaoAtendimento, fk_Cliente_idPessoa, fk_Produto_idProduto, fk_Tipo_Atendimento_idTipoAtendimento) VALUES (?,?,?,?,?);";
            st = conn.prepareStatement(query);
            st.setString(1, atendimento.getDescricao());
            st.setInt(2, atendimento.getSituacao());
            st.setInt(3, atendimento.getIdCliente());
            st.setInt(4, atendimento.getIdProduto());
            st.setInt(5, atendimento.getIdTipoAtendimento());
            st.executeUpdate();
            st.close();
            conn.close();
            System.out.println("inseriu");
            return atendimento;   
        }
        catch (Exception e){
            System.out.println("nao inseriu");
            e.printStackTrace();
            return null; 
          
        }
    }

    public static List<Atendimento> consultaAtendimento(int idCliente) {
         Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Atendimento> atendimentos = new ArrayList<Atendimento>();
        
        try {
            conn = new ConnectionFactory().getConnection();
            String query = "SELECT idAtendimento, dataHoraAtendimento, descricaoAtendimento, solucaoApresentada, situacaoAtendimento, nomeCliente, nomeProduto, nomeCategoria , nomeTipoAtendimento from atendimento, cliente, produto, categoria_produto, tipo_atendimento WHERE fk_Produto_idProduto = idProduto AND fk_Cliente_idPessoa = idPessoa AND fk_Categoria_Produto_idCategoria = idCategoria AND fk_Tipo_Atendimento_idTipoAtendimento = idTipoAtendimento AND idPessoa = ? ORDER BY dataHoraAtendimento DESC";
            st = conn.prepareStatement(query);
            st.setInt(1, idCliente);
            rs = st.executeQuery();
            while(rs.next()){
                Atendimento atendimento = new Atendimento();
                atendimento.setIdAtendimento(rs.getInt("idAtendimento"));
                LocalDate dt1 = rs.getDate("dataHoraAtendimento").toLocalDate();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                atendimento.setDataHoraAtendimento(dt1.format(formatter));
                atendimento.setDescricao(rs.getString("descricaoAtendimento"));
                atendimento.setSolucao(rs.getString("solucaoApresentada"));
                atendimento.setSituacao(rs.getInt("situacaoAtendimento"));
                atendimento.setNomeProduto(rs.getString("nomeProduto"));
                atendimento.setNomeCategoria(rs.getString("nomeCategoria"));
                atendimento.setNomeTipoAtendimento(rs.getString("nomeTipoAtendimento"));
                atendimentos.add(atendimento);
                //comentario
            }
            st.close();
            conn.close();
            return atendimentos;   
        }
        catch (Exception e){
            System.out.println("nao consultou");
            e.printStackTrace();
            return null; 
          
        }
    }

    public static List<Atendimento> listarTodosAtendimentos() {
          Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Atendimento> atendimentos = new ArrayList<Atendimento>();
        
        try {
            conn = new ConnectionFactory().getConnection();
            String query = "SELECT idAtendimento, dataHoraAtendimento, descricaoAtendimento, solucaoApresentada, situacaoAtendimento, nomeCliente, nomeProduto, nomeCategoria , nomeTipoAtendimento from atendimento, cliente, produto, categoria_produto, tipo_atendimento WHERE fk_Produto_idProduto = idProduto AND fk_Cliente_idPessoa = idPessoa AND fk_Categoria_Produto_idCategoria = idCategoria AND fk_Tipo_Atendimento_idTipoAtendimento = idTipoAtendimento AND situacaoAtendimento = 0 ORDER BY dataHoraAtendimento ASC";
            st = conn.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next()){
                Atendimento atendimento = new Atendimento();
                atendimento.setIdAtendimento(rs.getInt("idAtendimento"));
                LocalDate dt1 = rs.getDate("dataHoraAtendimento").toLocalDate();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                atendimento.setDataHoraAtendimento(dt1.format(formatter));
                atendimento.setDescricao(rs.getString("descricaoAtendimento"));
                atendimento.setSolucao(rs.getString("solucaoApresentada"));
                atendimento.setSituacao(rs.getInt("situacaoAtendimento"));
                atendimento.setNomeProduto(rs.getString("nomeProduto"));
                atendimento.setNomeCategoria(rs.getString("nomeCategoria"));
                atendimento.setNomeTipoAtendimento(rs.getString("nomeTipoAtendimento"));
                atendimentos.add(atendimento);
                //comentario
            }
            st.close();
            conn.close();
            return atendimentos;   
        }
        catch (Exception e){
            System.out.println("nao consultou");
            e.printStackTrace();
            return null; 
        }
    }

    public static Atendimento resolverAtendimento(Atendimento atendimento) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try {
            conn = new ConnectionFactory().getConnection();
            String query = "UPDATE atendimento SET solucaoApresentada = ? ,situacaoAtendimento = ? ,fk_Funcionario_idFuncionario = ? WHERE idAtendimento = ?;";
            st = conn.prepareStatement(query);
            st.setString(1, atendimento.getSolucao());
            st.setInt(2, atendimento.getSituacao());
            st.setInt(3, atendimento.getIdFuncionario());
            st.executeUpdate();
            st.close();
            conn.close();
            System.out.println("inseriu");
            return atendimento;   
        }
        catch (Exception e){
            System.out.println("nao inseriu");
            e.printStackTrace();
            return null; 
          
        }
    }
    
}
