/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael
 */
public class ConnectionFactory {
    
    public Connection getConnection() {
        try {
//mudar o nome do usuario e adicionar senha caso precissar
             return DriverManager.getConnection("jdbc:mysql://localhost:3306/web2", "root", "");//"rrw@and14"
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
