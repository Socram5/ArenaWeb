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
public enum FormaDePagamento {
    AVISTA("À vista"),
    CARTAO_CREDITO("Cartão de Crédito");
    
    private String descricao;
    
    FormaDePagamento(String d) {
        this.descricao = d;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
