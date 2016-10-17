/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.core.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author marcos
 */

@Entity
@SequenceGenerator(name = "gerador_pais",
        sequenceName = "pais_seq")
public class Pais implements 
        Serializable{

@Id
@GeneratedValue(strategy
            = GenerationType.SEQUENCE,
            generator = "gerador_pais")
    private Long id;
    private String nome;
    private String sigla;
    @OneToMany
    private List<Estado> estados;

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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

    @Override
    public String toString() {
        return "Pais{" + "id=" + id + ", nome=" + nome + ", sigla=" + sigla + ", estados=" + estados + '}';
    }
    
    
    
    
    
}
