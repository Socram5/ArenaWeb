/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.core.modelo;

import br.com.faete.arena.core.modelo.enuns.TipoCampo;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author marcos
 */
@Entity
@SequenceGenerator(name = "campo_seq", sequenceName = "campo_seq")
public class Campo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "campo_seq")
    private Long id;
    @Column( nullable = false)
    private TipoCampo tipoCampo;
    private BigDecimal horarioInicial;
    private BigDecimal horarioFinal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getHorarioInicial() {
        return horarioInicial;
    }

    public void setHorarioInicial(BigDecimal horarioInicial) {
        this.horarioInicial = horarioInicial;
    }

    public BigDecimal getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(BigDecimal horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public TipoCampo getTipoCampo() {
        return tipoCampo;
    }

    public void setTipoCampo(TipoCampo tipoCampo) {
        this.tipoCampo = tipoCampo;
    }

    public Object getTamanho() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
