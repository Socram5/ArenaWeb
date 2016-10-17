/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author marcos
 */
public abstract class BaseDAO {
    
    @PersistenceContext( unitName = "arenaPU")
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }
    public abstract Class getClassUnit();
    
    public void save(Object obj){
        entityManager.persist(obj);
    }
    
    public Object update(Object obj){
        entityManager.merge(obj);
        return null;
        
    }
    public List listAll() {
        Query q = entityManager.createQuery("from " + getClassUnit().getSimpleName());
        return q.getResultList();
}
}