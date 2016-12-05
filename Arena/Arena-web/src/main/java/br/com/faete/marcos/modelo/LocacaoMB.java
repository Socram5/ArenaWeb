/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.marcos.modelo;

import br.com.faete.arena.bo.LocacaoBO;
import br.com.faete.arena.core.modelo.Campo;
import br.com.faete.arena.core.modelo.Locacao;
import java.io.Serializable;
import java.util.HashSet;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author marcos
 */
@ManagedBean
@SessionScoped
public class LocacaoMB implements Serializable{
    
    
    private Locacao locacao = new Locacao();
    @EJB
    private LocacaoBO locacaoBO;
    
    public void adicionarCampo(Campo campo){
        if (locacao.getCampoLocados() == null){
            locacao.setCampoLocados(new HashSet<Campo>());
            
        }
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }
    
}
