/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.dao;

import com.ufpr.tads.web2.beans.Cliente;
import com.ufpr.tads.web2.beans.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author janai
 */
public class GerenteDAO {

    public static void cadastrarFuncionario(Funcionario funcionario) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try {
            conn = new ConnectionFactory().getConnection();
            String query = "INSERT INTO funcionario(nomeFuncionario,sobrenomeFuncionario,emailFuncionario,cpfFuncionario,ruaEnderecoFuncionario,numeroEndercoFuncionario,complementoEnderecoFuncionario,bairroEnderecoFuncionario,cidadeEnderecoFuncionario,cepEnderecoFuncionario,estadoEnderecoFuncionario,telefoneFuncionario,senhaFuncionario,cargo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,aes_encrypt(?,'beibe'),?);";
            st = conn.prepareStatement(query);
            st.setString(1,funcionario.getNomeFuncionario());
            System.out.print(funcionario.getSobrenomeFuncionario());
            st.setString(2,funcionario.getSobrenomeFuncionario());
            st.setString(3,funcionario.getEmailFuncionario());
            st.setString(4,funcionario.getCpfFuncionario());
            st.setString(5,funcionario.getRuaEnderecoFuncionario());
            st.setInt(6, funcionario.getNumeroEndercoFuncionario());
            st.setString(7,funcionario.getComplementoEnderecoFuncionario());
            st.setString(8,funcionario.getBairroEnderecoFuncionario());
            st.setString(9,funcionario.getCidadeEnderecoFuncionario());
            st.setString(10,funcionario.getCepEnderecoFuncionario());
            st.setString(11,funcionario.getEstadoEnderecoFuncionario());
            st.setString(12,funcionario.getTelefoneFuncionario());
            st.setString(13,funcionario.getSenhaFuncionario());
            st.setInt(14, funcionario.getCargoFuncionario());
            System.out.println(st);
            st.executeUpdate();
            st.close();
            conn.close();
            System.out.println("inseriu");
           
        }
        catch (Exception e){
            System.out.println("nao inseriu");
            e.printStackTrace();
            
          
        }
   

      
    }

    public static List<Funcionario> listarTodosFuncionarios() {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
         
            try{
                conn = new ConnectionFactory().getConnection();
                String queryc = "SELECT * FROM funcionario";
                st = conn.prepareStatement(queryc);
                rs = st.executeQuery();
                while (rs.next()){
                    Funcionario funcionario = new Funcionario();
                    funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                    funcionario.setNomeFuncionario(rs.getString("nomeFuncionario"));
                    funcionario.setSobrenomeFuncionario(rs.getString("sobrenomeFuncionario"));
                    funcionario.setEmailFuncionario(rs.getString("emailFuncionario"));
                    funcionario.setCpfFuncionario(rs.getString("cpfFuncionario"));
                    funcionario.setRuaEnderecoFuncionario(rs.getString("ruaEnderecoFuncionario"));
                    funcionario.setNumeroEndercoFuncionario(rs.getInt("numeroEndercoFuncionario"));
                    funcionario.setComplementoEnderecoFuncionario(rs.getString("complementoEnderecoFuncionario"));
                    funcionario.setBairroEnderecoFuncionario(rs.getString("bairroEnderecoFuncionario"));
                    funcionario.setCidadeEnderecoFuncionario(rs.getString("cidadeEnderecoFuncionario"));
                    funcionario.setCepEnderecoFuncionario(rs.getString("cepEnderecoFuncionario"));
                    funcionario.setEstadoEnderecoFuncionario(rs.getString("estadoEnderecoFuncionario"));
                    funcionario.setTelefoneFuncionario(rs.getString("telefoneFuncionario"));
                    funcionario.setSenhaFuncionario(rs.getString("senhaFuncionario"));
                    funcionario.setCargoFuncionario(rs.getInt("cargo"));               
                    funcionarios.add(funcionario);
                }
                return funcionarios;
            }
            catch (Exception e){
                System.out.println("nao consultou");
                e.printStackTrace();
                return null; 
           }
    }

    public static int verificaFuncionario(Funcionario funcionario) {
        Connection conn = null;
        PreparedStatement st = null;
        PreparedStatement st2 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        String cpfFuncionario = null;
        String emailFuncionario = null;
        
        try{
            conn = new ConnectionFactory().getConnection();
            String queryc = "SELECT cpfFuncionario From funcionario WHERE cpfFuncionario = ?";
            String queryEmail = "SELECT emailFuncionario From funcionario WHERE emailFuncionario = ?";
            st = conn.prepareStatement(queryc);
            st2 = conn.prepareStatement(queryEmail);
            st.setString(1,funcionario.getCpfFuncionario());
            st2.setString(1,funcionario.getEmailFuncionario());
            rs = st.executeQuery();
            rs2 = st2.executeQuery();
            while (rs.next()){
                cpfFuncionario = rs.getString("cpfFuncionario");
            }
            
            while(rs2.next()){
                emailFuncionario = rs2.getString("emailFuncionario");
            
            }
            // se cpf funcionario DIFERENTE DE NULL e email diferente de null quer dizer que tem o dado no banco então retorna 1
            if (cpfFuncionario!=null || cpfFuncionario!=null){
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

    public static int countTodosAtendimentos() {
      
        Connection conn = null;
         PreparedStatement st = null;
         ResultSet rs = null;
         int countTodosAtendimentos = 0;
         
         try{
                conn = new ConnectionFactory().getConnection();
                String queryc = "SELECT COUNT(*) FROM atendimento";
                st = conn.prepareStatement(queryc);
                rs = st.executeQuery();
                while (rs.next()){
                    countTodosAtendimentos = rs.getInt("COUNT(*)");
                    System.out.println("TODOS ATENDIMENTOS");
                    System.out.println(countTodosAtendimentos);
                    
                }
                return countTodosAtendimentos ;
            }
            catch (Exception e){
                System.out.println("nao consultou");
                e.printStackTrace();
                return 0; 
           }
      
     
    }
    
    public static int countTodosAtendimentosEmAberto() {
      
        Connection conn = null;
         PreparedStatement st = null;
         ResultSet rs = null;
         int countTodosAtendimentosEmAberto = 0;
         
         try{
                conn = new ConnectionFactory().getConnection();
                String queryc = "SELECT COUNT(*) FROM atendimento WHERE situacaoAtendimento = 0";
                st = conn.prepareStatement(queryc);
                rs = st.executeQuery();
                while (rs.next()){
                    countTodosAtendimentosEmAberto = rs.getInt("COUNT(*)");
                    System.out.println("TODOS ATENDIMENTOS EM ABERTO");
                    System.out.println(countTodosAtendimentosEmAberto);
                    
                }
                return countTodosAtendimentosEmAberto ;
            }
            catch (Exception e){
                System.out.println("nao consultou");
                e.printStackTrace();
                return 0; 
           }
      
     
    }
    
    public static int countReclamacoes() {
      
        Connection conn = null;
         PreparedStatement st = null;
         ResultSet rs = null;
         int countReclamacoes = 0;
         
         try{
                conn = new ConnectionFactory().getConnection();
                String queryc = "SELECT COUNT(*) FROM atendimento WHERE fk_Tipo_Atendimento_idTipoAtendimento = 1";
                st = conn.prepareStatement(queryc);
                rs = st.executeQuery();
                while (rs.next()){
                    countReclamacoes = rs.getInt("COUNT(*)");
                    System.out.println("Reclamacoes total");
                    System.out.println(countReclamacoes);
                    
                }
                return countReclamacoes ;
            }
            catch (Exception e){
                System.out.println("nao consultou");
                e.printStackTrace();
                return 0; 
           }
      
     
    }

    public static int countReclamacoesEmAberto() {
        Connection conn = null;
         PreparedStatement st = null;
         ResultSet rs = null;
         int countReclamacoesEmAberto = 0;
         
         try{
                conn = new ConnectionFactory().getConnection();
                String queryc = "SELECT COUNT(*) FROM atendimento WHERE fk_Tipo_Atendimento_idTipoAtendimento = 1 AND situacaoAtendimento = 0";
                st = conn.prepareStatement(queryc);
                rs = st.executeQuery();
                while (rs.next()){
                    countReclamacoesEmAberto = rs.getInt("COUNT(*)");
                    System.out.println("Reclamacoes em aberto");
                    System.out.println(countReclamacoesEmAberto);
                    
                }
                return countReclamacoesEmAberto ;
            }
            catch (Exception e){
                System.out.println("nao consultou");
                e.printStackTrace();
                return 0; 
           }
    }
    
     public static int countInformacao() {
      
        Connection conn = null;
         PreparedStatement st = null;
         ResultSet rs = null;
         int countInformacao = 0;
         
         try{
                conn = new ConnectionFactory().getConnection();
                String queryc = "SELECT COUNT(*) FROM atendimento WHERE fk_Tipo_Atendimento_idTipoAtendimento = 3";
                st = conn.prepareStatement(queryc);
                rs = st.executeQuery();
                while (rs.next()){
                    countInformacao = rs.getInt("COUNT(*)");
                    System.out.println("INFORMACAO total");
                    System.out.println(countInformacao);
                    
                }
                return countInformacao ;
            }
            catch (Exception e){
                System.out.println("nao consultou");
                e.printStackTrace();
                return 0; 
           }
      
     
    }

    public static int countInformacoesEmAberto() {
        Connection conn = null;
         PreparedStatement st = null;
         ResultSet rs = null;
         int countInformacoesEmAberto = 0;
         
         try{
                conn = new ConnectionFactory().getConnection();
                String queryc = "SELECT COUNT(*) FROM atendimento WHERE fk_Tipo_Atendimento_idTipoAtendimento = 3 AND situacaoAtendimento = 0";
                st = conn.prepareStatement(queryc);
                rs = st.executeQuery();
                while (rs.next()){
                    countInformacoesEmAberto = rs.getInt("COUNT(*)");
                    System.out.println("Informacoes em aberto");
                    System.out.println(countInformacoesEmAberto);
                    
                }
                return countInformacoesEmAberto ;
            }
            catch (Exception e){
                System.out.println("nao consultou");
                e.printStackTrace();
                return 0; 
           }
    }
    
    
    public static int countElogio() {
      
        Connection conn = null;
         PreparedStatement st = null;
         ResultSet rs = null;
         int countElogio = 0;
         
         try{
                conn = new ConnectionFactory().getConnection();
                String queryc = "SELECT COUNT(*) FROM atendimento WHERE fk_Tipo_Atendimento_idTipoAtendimento = 2";
                st = conn.prepareStatement(queryc);
                rs = st.executeQuery();
                while (rs.next()){
                    countElogio = rs.getInt("COUNT(*)");
                    System.out.println("Elogio total");
                    System.out.println(countElogio);
                    
                }
                return countElogio ;
            }
            catch (Exception e){
                System.out.println("nao consultou");
                e.printStackTrace();
                return 0; 
           }
      
     
    }

    public static int countElogioEmAberto() {
        Connection conn = null;
         PreparedStatement st = null;
         ResultSet rs = null;
         int countElogioEmAberto = 0;
         
         try{
                conn = new ConnectionFactory().getConnection();
                String queryc = "SELECT COUNT(*) FROM atendimento WHERE fk_Tipo_Atendimento_idTipoAtendimento = 2 AND situacaoAtendimento = 0";
                st = conn.prepareStatement(queryc);
                rs = st.executeQuery();
                while (rs.next()){
                    countElogioEmAberto = rs.getInt("COUNT(*)");
                    System.out.println("Elogio em aberto");
                    System.out.println(countElogioEmAberto);
                    
                }
                return countElogioEmAberto ;
            }
            catch (Exception e){
                System.out.println("nao consultou");
                e.printStackTrace();
                return 0; 
           }
    }
    
    public static int countSugestao() {
      
        Connection conn = null;
         PreparedStatement st = null;
         ResultSet rs = null;
         int countSugestao = 0;
         
         try{
                conn = new ConnectionFactory().getConnection();
                String queryc = "SELECT COUNT(*) FROM atendimento WHERE fk_Tipo_Atendimento_idTipoAtendimento = 4";
                st = conn.prepareStatement(queryc);
                rs = st.executeQuery();
                while (rs.next()){
                    countSugestao = rs.getInt("COUNT(*)");
                    System.out.println("Sugestao total");
                    System.out.println(countSugestao);
                    
                }
                return countSugestao ;
            }
            catch (Exception e){
                System.out.println("nao consultou");
                e.printStackTrace();
                return 0; 
           }
      
     
    }

    public static int countSugestaoEmAberto() {
        Connection conn = null;
         PreparedStatement st = null;
         ResultSet rs = null;
         int countSugestaoEmAberto = 0;
         
         try{
                conn = new ConnectionFactory().getConnection();
                String queryc = "SELECT COUNT(*) FROM atendimento WHERE fk_Tipo_Atendimento_idTipoAtendimento = 4 AND situacaoAtendimento = 0";
                st = conn.prepareStatement(queryc);
                rs = st.executeQuery();
                while (rs.next()){
                    countSugestaoEmAberto = rs.getInt("COUNT(*)");
                    System.out.println("Sugestoes em aberto");
                    System.out.println(countSugestaoEmAberto);
                    
                }
                return countSugestaoEmAberto;
            }
            catch (Exception e){
                System.out.println("nao consultou");
                e.printStackTrace();
                return 0; 
           }
    }
    
    
}
