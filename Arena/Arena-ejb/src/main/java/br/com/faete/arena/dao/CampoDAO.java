/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.dao;

import br.com.faete.marcos.modelo.modelos.Campo;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author marcos
 */
@Stateless
public class CampoDAO extends BaseDAO {
    
        public boolean campoEstaDisponivel(Campo campo, Date inicio, Date fim){
        StringBuilder sb = new StringBuilder();
        sb.append("select count(*) from locacao");
        sb.append(" inner join l.camposLocados v ");
        sb.append(" where c.id = :id ");
        sb.append(" and ((l.horarioInicio <= :inicio and l.horarioFim >= :inicio )");
        sb.append(" or l.horarioInicio >= :inicio and l.horarioFim <= :fim )");

        Query q = getEntityManager().createQuery(sb.toString());
        q.setParameter("id", campo.getId());
        q.setParameter("inicio", inicio);
        q.setParameter("fim", fim);
        try {
            Integer i = (Integer) q.getSingleResult();
            return !(i > 0);
        } catch (Exception ex) {
            return true;
}
    }

    @Override
    public Class getClassNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
