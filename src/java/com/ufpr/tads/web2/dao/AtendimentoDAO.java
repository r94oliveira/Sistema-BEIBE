/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.dao;

import com.ufpr.tads.web2.beans.TipoAtendimento;
import com.ufpr.tads.web2.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
}
