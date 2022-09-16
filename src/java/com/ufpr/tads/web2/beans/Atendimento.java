package com.ufpr.tads.web2.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class Atendimento implements Serializable{
    private int idAtendimento;
    private String dataHoraAtendimento;
    private String descricao;
    private String solucao;
    private int situacao;
    private int idCliente;
    private int idProduto;
    private int idTipoAtendimento;
    private String nomeProduto;
    private String nomeCategoria;
    private Timestamp horaBanco;

    public Atendimento(int idAtendimento, String dataHoraAtendimento, String descricao, String solucao, int situacao, int idCliente, int idProduto, int idTipoAtendimento, String nomeProduto, String nomeCategoria, Timestamp horaBanco, String nomeTipoAtendimento, int idFuncionario) {
        this.idAtendimento = idAtendimento;
        this.dataHoraAtendimento = dataHoraAtendimento;
        this.descricao = descricao;
        this.solucao = solucao;
        this.situacao = situacao;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.idTipoAtendimento = idTipoAtendimento;
        this.nomeProduto = nomeProduto;
        this.nomeCategoria = nomeCategoria;
        this.horaBanco = horaBanco;
        this.nomeTipoAtendimento = nomeTipoAtendimento;
        this.idFuncionario = idFuncionario;
    }

    public Timestamp getHoraBanco() {
        return horaBanco;
    }

    public void setHoraBanco(Timestamp horaBanco) {
        this.horaBanco = horaBanco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getNomeTipoAtendimento() {
        return nomeTipoAtendimento;
    }

    public void setNomeTipoAtendimento(String nomeTipoAtendimento) {
        this.nomeTipoAtendimento = nomeTipoAtendimento;
    }
    private String nomeTipoAtendimento;

    public void setIdAtendimento(int idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public void setDataHoraAtendimento(String dataHoraAtendimento) {
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
  
    
    public Atendimento() {
    
    }
    
        public int getIdAtendimento() {
        return idAtendimento;
    }

    public String getDataHoraAtendimento() {
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
