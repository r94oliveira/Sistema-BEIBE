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
            st.setString(2, );
            st.setString(3, );
            st.setString(4, );
            st.setString(5, );
            st.setString(5, );
            st.setString(6, );
            st.setInt(7, );
            st.setString(8, );
            st.setString(9, );
            st.setString(10, );
            st.setString(11, );
            st.setString(12, );
            st.setString(13, );
            st.setString(14, );
            st.setString(15, );
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
