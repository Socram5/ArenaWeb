

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.faete.arena.core.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author marcos
 */
@Entity
public class Cargo 
                implements Serializable{
    
@Id
@GeneratedValue
    private Long id;
    private String nome;
    private String atribuicoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtribuicoes() {
        return atribuicoes;
    }

    public void setAtribuicoes(String atribuicoes) {
        this.atribuicoes = atribuicoes;
    }
    


    
    
    
    
}
