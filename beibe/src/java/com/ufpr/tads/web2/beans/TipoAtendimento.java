package com.ufpr.tads.web2.beans;

import java.io.Serializable;


public class TipoAtendimento implements Serializable {
    private int idTipo;
    private String nome;
    
    public TipoAtendimento() {}
    
    public TipoAtendimento(String nome){
        this.nome = nome;
    }
    public int getIdTipo(){
        return this.idTipo;
    }
    public void setIdTipo(int idTipo){
        this.idTipo = idTipo;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
