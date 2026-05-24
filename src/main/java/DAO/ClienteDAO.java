/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import jakarta.persistence.EntityManager;
import model.CadastrarClientes;

public class ClienteDAO {
    
    EntityManager em = JPAUtil.getEntityManager();
    
    public void inserir (CadastrarClientes c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }
} 
//Como no projeto não há nenhuma operação além de insert, não adicionarei o resto do CRUD.
