/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.dao;

import java.util.List;
import java.util.Map;
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
    public abstract Class getClassNome();
    
    public void salvar(Object obj){
        getEntityManager().persist(obj);
    }
    
    public Object atualizar (Object obj){
        getEntityManager().merge(obj);
        return null;
                
    }
    
    public void deletar (Long id) {
        Query q = getEntityManager().createQuery("Delete from " + getClassNome() + " where id = :id ");
        q.setParameter("id", id);
        q.executeUpdate();
    }
    
    public List listarTodos() {
        return getEntityManager().createQuery("from " + getClassNome()).getResultList();
    }
    
    public Object findById(Long id) {
        Query q = getEntityManager().createQuery("from " + getClassNome() + " where id = :id");
        q.setParameter("id", id);
        try {
            return q.getSingleResult();
        } catch (Exception ex) {
            return null;
        }
    }
    
    public List findByFields(Map<String, String> mapa) {
        StringBuilder sql = new StringBuilder();
        sql.append("from ").append(getClassNome());
        if (mapa != null) {
            sql.append(" where 1 = 1");
            for (String s : mapa.keySet()) {
                sql.append(" and ").append(s).append(" = :").append(s);
            }
        }
        Query q = getEntityManager().createQuery(sql.toString());
        if (mapa != null) {
            for (String s : mapa.keySet()) {
                q.setParameter(s, mapa.get(s));
            }
        }
        try {
            return q.getResultList();
        } catch (Exception ex) {
            return null;
        }
        
    }
    
    public List findByField(String campo, Object valor) {
        Query q = getEntityManager().createQuery("from " + getClassNome() + " where " + campo + " = :valor");
        q.setParameter("valor", valor);
        try {
            return q.getResultList();
        } catch (Exception ex) {
            return null;
        }
        
}
}