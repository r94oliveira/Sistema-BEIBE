/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.web2.beans;

import java.io.Serializable;


public class Cliente extends Pessoa implements Serializable{
    private int idCliente;
    private String nomecliente;
    private String sobrenomeCliente;
    private String emailCliente;
    private String cpfCliente;
    private String ruaEnderecoCliente;
    private int numeroEndercoCliente;
    private String complementoEnderecoCliente;
    private String bairroEnderecoCliente;
    private String cidadeEnderecoCliente;
    private String cepEnderecoCliente;
    private String estadoEnderecoCliente;
    private String telefoneCliente;
    private String senhaCliente;

    public Cliente() {
    }

    public Cliente( String nomecliente, String sobrenomeCliente, String emailCliente, String cpfCliente, String ruaEnderecoCliente, int numeroEndercoCliente, String complementoEnderecoCliente, String bairroEnderecoCliente, String cidadeEnderecoCliente, String cepEnderecoCliente, String estadoEnderecoCliente, String telefoneCliente, String senhaCliente, String primeiroNome, String sobreNome, long cpf, Endereco endereco, String telefone) {
        super(primeiroNome, sobreNome, cpf, endereco, telefone);
        this.nomecliente = nomecliente;
        this.sobrenomeCliente = sobrenomeCliente;
        this.emailCliente = emailCliente;
        this.cpfCliente = cpfCliente;
        this.ruaEnderecoCliente = ruaEnderecoCliente;
        this.numeroEndercoCliente = numeroEndercoCliente;
        this.complementoEnderecoCliente = complementoEnderecoCliente;
        this.bairroEnderecoCliente = bairroEnderecoCliente;
        this.cidadeEnderecoCliente = cidadeEnderecoCliente;
        this.cepEnderecoCliente = cepEnderecoCliente;
        this.estadoEnderecoCliente = estadoEnderecoCliente;
        this.telefoneCliente = telefoneCliente;
        this.senhaCliente = senhaCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getSobrenomeCliente() {
        return sobrenomeCliente;
    }

    public void setSobrenomeCliente(String sobrenomeCliente) {
        this.sobrenomeCliente = sobrenomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getRuaEnderecoCliente() {
        return ruaEnderecoCliente;
    }

    public void setRuaEnderecoCliente(String ruaEnderecoCliente) {
        this.ruaEnderecoCliente = ruaEnderecoCliente;
    }

    public int getNumeroEndercoCliente() {
        return numeroEndercoCliente;
    }

    public void setNumeroEndercoCliente(int numeroEndercoCliente) {
        this.numeroEndercoCliente = numeroEndercoCliente;
    }

    public String getComplementoEnderecoCliente() {
        return complementoEnderecoCliente;
    }

    public void setComplementoEnderecoCliente(String complementoEnderecoCliente) {
        this.complementoEnderecoCliente = complementoEnderecoCliente;
    }

    public String getBairroEnderecoCliente() {
        return bairroEnderecoCliente;
    }

    public void setBairroEnderecoCliente(String bairroEnderecoCliente) {
        this.bairroEnderecoCliente = bairroEnderecoCliente;
    }

    public String getCidadeEnderecoCliente() {
        return cidadeEnderecoCliente;
    }

    public void setCidadeEnderecoCliente(String cidadeEnderecoCliente) {
        this.cidadeEnderecoCliente = cidadeEnderecoCliente;
    }

    public String getCepEnderecoCliente() {
        return cepEnderecoCliente;
    }

    public void setCepEnderecoCliente(String cepEnderecoCliente) {
        this.cepEnderecoCliente = cepEnderecoCliente;
    }

    public String getEstadoEnderecoCliente() {
        return estadoEnderecoCliente;
    }

    public void setEstadoEnderecoCliente(String estadoEnderecoCliente) {
        this.estadoEnderecoCliente = estadoEnderecoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getSenhaCliente() {
        return senhaCliente;
    }

    public void setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
    }
}
