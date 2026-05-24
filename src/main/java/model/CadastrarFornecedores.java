/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author indal
 */
@Entity
public class CadastrarFornecedores {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID;
    
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String rua;
    private String bairro;
    private String estado;
    private String CEP;
    private String CNPJ;
    private String historicoFornecimento;
    private String ramoAtuacao;

    public CadastrarFornecedores(String nome, String email, String telefone, String endereco, String rua, String bairro, String estado, String CEP, String CNPJ, String historicoFornecimento, String ramoAtuacao) {
 
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.rua = rua;
        this.bairro = bairro;
        this.estado = estado;
        this.CEP = CEP;
        this.CNPJ = CNPJ;
        this.historicoFornecimento = historicoFornecimento;
        this.ramoAtuacao = ramoAtuacao;
    }
    public CadastrarFornecedores () {
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelfone() {
        return telefone;
    }

    public void setTelfone(String telfone) {
        this.telefone = telfone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getHistoricoFornecimento() {
        return historicoFornecimento;
    }

    public void setHistoricoFornecimento(String historicoFornecimento) {
        this.historicoFornecimento = historicoFornecimento;
    }

    public String getRamoAtuacao() {
        return ramoAtuacao;
    }

    public void setRamoAtuacao(String ramoAtuacao) {
        this.ramoAtuacao = ramoAtuacao;
    }
    
    
    
}
