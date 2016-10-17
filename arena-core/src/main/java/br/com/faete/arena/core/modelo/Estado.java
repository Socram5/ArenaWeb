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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author marcos
 */
@Entity
public class Estado implements 
        Serializable{
    
@Id
@GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String nome;
    private String sigla;
    @ManyToOne
    private Pais pais;
    @OneToMany
    private List<Cidade> cidades;

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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public String toString() {
        return "Estado{" + "id=" + id + ", nome=" + nome + ", sigla=" + sigla + ", pais=" + pais + ", cidades=" + cidades + '}';
    }
    
    
    
    
}
