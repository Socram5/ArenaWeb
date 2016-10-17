/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.dao;

import br.com.faete.arena.core.modelo.Campo;
import javax.ejb.Stateless;

/**
 *
 * @author marcos
 */
@Stateless
public class CampoDAO {

   public Class getClassUnit(){
       return Campo.class;
   }

    public void save(Campo campo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
