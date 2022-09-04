package com.ufpr.tads.web2.beans;

import java.io.Serializable;


public class CategoriaProduto implements Serializable {
    private int idCategoria;
    private String nome;
    
    public CategoriaProduto() {}
    
    public CategoriaProduto(String nome, int IdCategoria){
        this.nome = nome;
        this.idCategoria = idCategoria;
    }
    
    
    public int getIdCategoria(){
        return this.idCategoria;
    }
    public void setIdCategoria(int idCategoria){
        this.idCategoria = idCategoria;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
