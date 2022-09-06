package com.ufpr.tads.web2.beans;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;


public class Atendimento implements Serializable{
    private int idAtendimento;
    private Date dataHoraAtendimento;
    private String descricao;
    private String solucao;
    private int situacao;
    private int idCliente;
    private int idProduto;
    private int idTipoAtendimento;

    public void setIdAtendimento(int idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public void setDataHoraAtendimento(Date dataHoraAtendimento) {
        this.dataHoraAtendimento = dataHoraAtendimento;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setIdTipoAtendimento(int idTipoAtendimento) {
        this.idTipoAtendimento = idTipoAtendimento;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    private int idFuncionario;
  
    
    public Atendimento() {}
    
    public Atendimento(int idAtendimento,Date dataHoraAtendimento,String descricao,String solucao,int situacao,int idCliente,int idProduto,int idTipoAtendimento,int idFuncionario){
        this.idAtendimento = idAtendimento;
        this.dataHoraAtendimento = dataHoraAtendimento;
        this.descricao = descricao;
        this.solucao = solucao;
        this.situacao = situacao;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.idTipoAtendimento = idTipoAtendimento;
        this.idFuncionario = idFuncionario;
    }

    public int getIdAtendimento() {
        return idAtendimento;
    }

    public Date getDataHoraAtendimento() {
        return dataHoraAtendimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSolucao() {
        return solucao;
    }

    public int getSituacao() {
        return situacao;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getIdTipoAtendimento() {
        return idTipoAtendimento;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

   
}
