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
                    
                    System.out.println("TEM QUE SOLTAR o nome do funcionario AQUI EM BAIXO");
                    System.out.println(funcionario.getNomeFuncionario());
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
}
