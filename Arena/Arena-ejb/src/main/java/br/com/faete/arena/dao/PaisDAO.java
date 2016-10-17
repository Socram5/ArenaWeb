/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author marcos
 */
public class PaisDAO {
    
    static EntityManagerFactory factory
            = Persistence.createEntityManagerFactory("arenaPU");
    static EntityManager manager;
    
    static {
        manager = factory.createEntityManager();
    }
    
    private static PaisDAO paisDAO;
    
   
    
    public static PaisDAO instance() {
        if (paisDAO == null) {
            paisDAO = new PaisDAO();
        }
        return paisDAO;
    }
}
