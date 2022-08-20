/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rafael
 */
public class ConnectionFactory {
   
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";   
    private static final String URL = "jdbc:mysql://localhost:3306/web2?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";     
    private static final String USER = "root";     
    private static final String PASS = ""; 

    public static Connection getConnection() {
         try {
            Class.forName(DRIVER);
             System.out.println("conectou");
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("nao conectou");
            throw new RuntimeException("Erro na conexão: " + ex.getMessage(), ex);
        }
    }
}
    
