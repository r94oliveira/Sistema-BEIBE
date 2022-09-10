/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.web2.beans;

import java.io.Serializable;


public class Funcionario implements Serializable{
    private int idFuncionario;
    private String nomeFuncionario;
    private String sobrenomeFuncionario;
    private String emailFuncionario;
    private String cpfFuncionario;
    private String ruaEnderecoFuncionario;
    private int numeroEndercoFuncionario;
    private String complementoEnderecoFuncionario;
    private String bairroEnderecoFuncionario;
    private String cidadeEnderecoFuncionario;
    private String cepEnderecoFuncionario;
    private String estadoEnderecoFuncionario;
    private String telefoneFuncionario;
    private String senhaFuncionario;
    private int cargoFuncionario;

    public Funcionario() {
    }

    public Funcionario(int idFuncionario, String nomeFuncionario, String sobrenomeFuncionario, String emailFuncionario, String cpfFuncionario, String ruaEnderecoFuncionario, int numeroEndercoFuncionario, String complementoEnderecoFuncionario, String bairroEnderecoFuncionario, String cidadeEnderecoFuncionario, String cepEnderecoFuncionario, String estadoEnderecoFuncionario, String telefoneFuncionario, String senhaFuncionario, int cargoFuncionario) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.sobrenomeFuncionario = sobrenomeFuncionario;
        this.emailFuncionario = emailFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        this.ruaEnderecoFuncionario = ruaEnderecoFuncionario;
        this.numeroEndercoFuncionario = numeroEndercoFuncionario;
        this.complementoEnderecoFuncionario = complementoEnderecoFuncionario;
        this.bairroEnderecoFuncionario = bairroEnderecoFuncionario;
        this.cidadeEnderecoFuncionario = cidadeEnderecoFuncionario;
        this.cepEnderecoFuncionario = cepEnderecoFuncionario;
        this.estadoEnderecoFuncionario = estadoEnderecoFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.senhaFuncionario = senhaFuncionario;
        this.cargoFuncionario = cargoFuncionario;
    }

    

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getSobrenomeFuncionario() {
        return sobrenomeFuncionario;
    }

    public void setSobrenomeFuncionario(String sobrenomeFuncionario) {
        this.sobrenomeFuncionario = sobrenomeFuncionario;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getRuaEnderecoFuncionario() {
        return ruaEnderecoFuncionario;
    }

    public void setRuaEnderecoFuncionario(String ruaEnderecoFuncionario) {
        this.ruaEnderecoFuncionario = ruaEnderecoFuncionario;
    }

    public int getNumeroEndercoFuncionario() {
        return numeroEndercoFuncionario;
    }

    public void setNumeroEndercoFuncionario(int numeroEndercoFuncionario) {
        this.numeroEndercoFuncionario = numeroEndercoFuncionario;
    }

    public String getComplementoEnderecoFuncionario() {
        return complementoEnderecoFuncionario;
    }

    public void setComplementoEnderecoFuncionario(String complementoEnderecoFuncionario) {
        this.complementoEnderecoFuncionario = complementoEnderecoFuncionario;
    }

    public String getBairroEnderecoFuncionario() {
        return bairroEnderecoFuncionario;
    }

    public void setBairroEnderecoFuncionario(String bairroEnderecoFuncionario) {
        this.bairroEnderecoFuncionario = bairroEnderecoFuncionario;
    }

    public String getCidadeEnderecoFuncionario() {
        return cidadeEnderecoFuncionario;
    }

    public void setCidadeEnderecoFuncionario(String cidadeEnderecoFuncionario) {
        this.cidadeEnderecoFuncionario = cidadeEnderecoFuncionario;
    }

    public String getCepEnderecoFuncionario() {
        return cepEnderecoFuncionario;
    }

    public void setCepEnderecoFuncionario(String cepEnderecoFuncionario) {
        this.cepEnderecoFuncionario = cepEnderecoFuncionario;
    }

    public String getEstadoEnderecoFuncionario() {
        return estadoEnderecoFuncionario;
    }

    public void setEstadoEnderecoFuncionario(String estadoEnderecoFuncionario) {
        this.estadoEnderecoFuncionario = estadoEnderecoFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public int getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(int cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }
    
}
