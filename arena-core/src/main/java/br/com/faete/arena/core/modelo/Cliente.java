/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.core.modelo;


import java.util.List;

/**
 *
 * @author marcos
 */
public class Cliente extends Pessoa{
    
    private Long id;
    private List<OrdemDeServico> servicos;

    
    public Long getId() {
        return id;
    }

 
    public void setId(Long id) {
        this.id = id;
    }

    public List<OrdemDeServico> getServicos() {
        return servicos;
    }

    public void setServicos(List<OrdemDeServico> servicos) {
        this.servicos = servicos;
    }
    
    
   
    
}
