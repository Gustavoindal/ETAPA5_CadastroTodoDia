/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import jakarta.persistence.EntityManager;
import java.util.List;
import model.CadastrarClientes;
import model.CadastrarProdutos;
import model.Caixa;


public class CaixaDAO {
    
    EntityManager em = JPAUtil.getEntityManager();
    
    public void inserir (Caixa c) {
        em.getTransaction().begin();
        
        CadastrarClientes cliente = em.find(CadastrarClientes.class, c.getCliente().getID());
        CadastrarProdutos produto = em.find(CadastrarProdutos.class, c.getProduto().getID());
        c.setCliente(cliente);
        c.setProduto(produto);
        em.persist(c);
        
        em.getTransaction().commit();
    }
    public List<Caixa> listaCaixa() {
        return em.createQuery("SELECT c FROM Caixa c", Caixa.class).getResultList();
    }
      public List<CadastrarClientes> listaClientes() {
        return em.createQuery("SELECT c FROM CadastrarClientes c", CadastrarClientes.class).getResultList();
    }
        public List<CadastrarProdutos> listaProduto() {
        return em.createQuery("SELECT p FROM CadastrarProdutos p", CadastrarProdutos.class).getResultList();
    }

 //Como no projeto não há nenhuma operação além de insert, não adicionarei o resto do CRUD.
}
