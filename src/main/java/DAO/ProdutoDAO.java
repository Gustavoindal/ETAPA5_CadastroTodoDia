/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import jakarta.persistence.EntityManager;
import model.CadastrarProdutos;



public class ProdutoDAO {
    
    EntityManager em = JPAUtil.getEntityManager();
    
    public void inserir (CadastrarProdutos p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
 //Como no projeto não há nenhuma operação além de insert, não adicionarei o resto do CRUD.
}
