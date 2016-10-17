/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.bo;

import br.com.faete.arena.dao.LocacaoDAO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author marcos
 */
@Stateless
public class LocacaoBO {
    
    @EJB
    private LocacaoDAO locacaoDAO;

    public LocacaoDAO getLocacaoDAO() {
        return locacaoDAO;
    }
    
    
    
}
