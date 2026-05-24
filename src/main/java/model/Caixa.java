/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author indal
 */
@Entity
public class Caixa {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID;
    
    @ManyToOne
    @JoinColumn(name="Cliente")
    CadastrarClientes cliente;
    
    @ManyToOne
    @JoinColumn(name="Produto")
    CadastrarProdutos produto;
    
    private String formaPagamento;
    private int quantidadeVendida;

    public Caixa(CadastrarClientes cliente, CadastrarProdutos produto, String formaPagamento, int quantidadeVendida) {
        this.cliente = cliente;
        this.produto = produto;
        this.formaPagamento = formaPagamento;
        this.quantidadeVendida = quantidadeVendida;
    }
    public Caixa() {
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public CadastrarClientes getCliente() {
        return cliente;
    }

    public void setCliente(CadastrarClientes cliente) {
        this.cliente = cliente;
    }

    public CadastrarProdutos getProduto() {
        return produto;
    }

    public void setProduto(CadastrarProdutos produto) {
        this.produto = produto;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

}
