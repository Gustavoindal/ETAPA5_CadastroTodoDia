/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("etapa4_persistencia");
    
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
