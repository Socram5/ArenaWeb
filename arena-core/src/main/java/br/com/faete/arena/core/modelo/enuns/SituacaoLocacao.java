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
public enum SituacaoLocacao {
    ABERTA("Locação Aberta"),
    PAGA("Locação paga"),
    AGUARDANDO_CAMPO("Locação paga e aguardando campo vago!"),
    FINALIZADA("Locação finalizada");
    
    private String descricao;
    
    SituacaoLocacao(String d) {
        this.descricao = d;
    }
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
  
    
}
