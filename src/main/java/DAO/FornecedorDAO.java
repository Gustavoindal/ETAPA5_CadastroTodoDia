/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import jakarta.persistence.EntityManager;
import java.util.List;
import model.CadastrarFornecedores;


public class FornecedorDAO {
    
    EntityManager em = JPAUtil.getEntityManager();
    
     public void inserir (CadastrarFornecedores f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }
    
    public List<CadastrarFornecedores> lista() {
        return em.createQuery("SELECT f From CadastrarFornecedores f", CadastrarFornecedores.class).getResultList();
    }
 //Como no projeto não há nenhuma operação além de insert, não adicionarei o resto do CRUD.
    
}
