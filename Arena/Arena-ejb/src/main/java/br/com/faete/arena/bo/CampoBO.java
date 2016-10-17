/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.bo;

import br.com.faete.arena.core.modelo.Campo;
import br.com.faete.arena.dao.CampoDAO;
import br.com.faete.arena.exceptions.ValidacaoException;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author marcos
 */
@Stateless
public class CampoBO {
    
    @EJB
    private CampoDAO campoDAO;

    
    
    public void salvarVeiculo(Campo campo) throws ValidacaoException {

        if (campo == null) {
            throw new ValidacaoException("Campo não pode ser nulo");
        }
       
        
        campoDAO.save(campo);
}
    public CampoDAO getCampoDAO() {
        return campoDAO;
    }
}
