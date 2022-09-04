/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.web2.beans;

import java.io.Serializable;


public class Produto implements Serializable{
    private int idProduto;
    private String nome;
    private String descricao;
    private int categoria;
    private double peso;

    
    public Produto() {}
    
    public Produto(String nome, String descricao, int categoria ,double peso){
        this.nome                  = nome;
        this.descricao             = descricao;
        this.categoria             = categoria;
        this.peso                  = peso;

    }
    
    public int getIdProduto(){
        return this.idProduto;
    }
    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public int getCategoria(){
        return this.categoria;
    }
    public void setCategoria(int categoria){
        this.categoria = categoria;
    }

    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
}    