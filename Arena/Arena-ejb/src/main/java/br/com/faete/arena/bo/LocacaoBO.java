/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.bo;

import br.com.faete.marcos.modelo.modelos.Locacao;
import br.com.faete.arena.dao.CampoDAO;
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
    private LocacaoDAO  locacaoDAO;
    @EJB
    private CampoDAO      campoDAO;
    
   
    
    public Locacao locar(Locacao locacao) throws Exception {
        if (locacao == null) {
            throw new Exception("Locação não pode ser nula!");
        }
        
        if (locacao.getCpfCliente() == null || locacao.getCpfCliente().isEmpty()) {
            throw new Exception("Locação deve ter o CPF do cliente informado!");
        }
        
        if (locacao.getCamposLocados() == null
                || locacao.getCamposLocados().isEmpty()) {
            throw new Exception("Locação deve possuir pelo menos um horario reservado!");
        }
        
       
        
        locacaoDAO.salvar(locacao);
        
        return locacao;
}
    
}
