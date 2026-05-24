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

public class ProdutoFornecedor {

  
    CadastrarFornecedores fornecedor;
    CadastrarProdutos produto;

    public ProdutoFornecedor(CadastrarFornecedores fornecedor, CadastrarProdutos produto) {
        this.fornecedor = fornecedor;
        this.produto = produto;
    }
    public ProdutoFornecedor() {
        
    }


    public CadastrarFornecedores getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(CadastrarFornecedores fornecedor) {
        this.fornecedor = fornecedor;
    }

    public CadastrarProdutos getProduto() {
        return produto;
    }

    public void setProduto(CadastrarProdutos produto) {
        this.produto = produto;
    }
    
    public void exibirInfo() {
        System.out.println("Fornecedor:" + fornecedor.getNome() + " | Produto: " + produto.getNome());
    }
}


