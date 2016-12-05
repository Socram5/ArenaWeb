/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.marcos.modelo.modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
      


/**
 *
 * @author marcos
 */
@Entity
public class Locacao implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    

    private String nomeCliente;
    private String cpfCliente;

    private BigDecimal valorHorario;

    public BigDecimal getValorHorario() {
        return valorHorario;
    }

    public void setValorHorario(BigDecimal valorHorario) {
        this.valorHorario = valorHorario;
    }

    public Calendar getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Calendar horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Calendar getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(Calendar horarioFim) {
        this.horarioFim = horarioFim;
    }
    
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar horarioInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar horarioFim;

    @ManyToMany
    private Set<Campo> camposLocados;
    

    public List<Campo> getListCampos() {
        if(camposLocados==null){
            camposLocados = new HashSet<>();
        }
        return new ArrayList<>(camposLocados);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

  

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    

    public Set<Campo> getCamposLocados() {
        return camposLocados;
    }

    public void setCamposLocados(Set<Campo> camposLocados) {
        this.camposLocados = camposLocados;
}
    
}
