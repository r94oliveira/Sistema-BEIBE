/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.dao;

import com.ufpr.tads.web2.beans.Funcionario;
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
public class FuncionarioDAO {
    public static boolean inserir (Funcionario f){
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = new ConnectionFactory().getConnection();
            String query = "INSERT INTO Funcionario ("
                            + "idFuncionario,\n" 
                            + "nomeFuncionario,\n" 
                            + "sobrenomeFuncionario,\n" 
                            + "emailFuncionario,\n" 
                            + "cpfFuncionario,\n" 
                            + "ruaEnderecoFuncionario,\n" 
                            + "numeroEndercoFuncionario,\n" 
                            + "complementoEnderecoFuncionario)\n"
                            + "bairroEnderecoFuncionario,\n" 
                            + "cidadeEnderecoFuncionario,\n" 
                            + "cepEnderecoFuncionario,\n" 
                            + "estadoEnderecoFuncionario,\n" 
                            + "telefoneFuncionario,\n" 
                            + "senhaFuncionario,\n"
                            + "cargoFuncionario,\n" 
                            + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            st = conn.prepareStatement(query);
            st.setInt(1, f.getIdFuncionario());
            st.setString(2,f.getNomeFuncionario());
            st.setString(3,f.getSobrenomeFuncionario());
            st.setString(4,f.getEmailFuncionario());
            st.setString(5,f.getCpfFuncionario());
            st.setString(6,f.getRuaEnderecoFuncionario());
            st.setInt(7,f.getNumeroEndercoFuncionario());
            st.setString(8,f.getComplementoEnderecoFuncionario());
            st.setString(9,f.getBairroEnderecoFuncionario());
            st.setString(10,f.getBairroEnderecoFuncionario());
            st.setString(11,f.getCidadeEnderecoFuncionario());
            st.setString(12,f.getCepEnderecoFuncionario());
            st.setString(13,f.getEstadoEnderecoFuncionario());
            st.setString(14,f.getSenhaFuncionario());
            st.setInt(15,f.getCargoFuncionario());
            st.executeUpdate();
            st.close();
            conn.close();
            return true;    
        }
        catch (Exception e){
          //ver qual exception usa    
        return false;    
        }
    }
}
