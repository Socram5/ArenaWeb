/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.dao;

import br.com.faete.arena.core.modelo.Locacao;
import javax.ejb.Stateless;

/**
 *
 * @author marcos
 */
@Stateless
public class LocacaoDAO extends BaseDAO{
    
    @Override
    public Class getClassUnit(){
        return Locacao.class;
    }
    
}
