/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.core.modelo.enuns;

/**
 *
 * @author marcos
 */
public enum TipoCampo {
    FUT7("QUADRA PARA PRATICA DE FUTEBOL SOCIETY! "),
    AREIA("QUADRA PARA PRATICA DE VOLEI OU FUTVOLEI! ");
    
    private String descricao;
    
    TipoCampo(String d) {
        this.descricao = d;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
