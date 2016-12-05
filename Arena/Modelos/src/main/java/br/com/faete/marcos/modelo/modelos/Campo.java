/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.marcos.modelo.modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author marcos
 */
@Entity
public class Campo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Column(nullable = false)
    private String tamanho;
    private BigDecimal valorHorario;
    private Calendar horarioInicio;
    private Calendar horarioFinal;

    public Calendar getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Calendar horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Calendar getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(Calendar horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public BigDecimal getValorHorario() {
        return valorHorario;
    }

    public void setValorHorario(BigDecimal valorHorario) {
        this.valorHorario = valorHorario;
    }
}
    