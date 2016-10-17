/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.core.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
@SequenceGenerator(name = "locacao_seq", sequenceName = "locacao_seq")
public class Locacao implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "locacao_seq")
    
    private Long id;
    private Date dataDaLocacao;
    private String tipoDeLocacao;
    private BigDecimal valorLocacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataDaLocacao() {
        return dataDaLocacao;
    }

    public void setDataDaLocacao(Date dataDaLocacao) {
        this.dataDaLocacao = dataDaLocacao;
    }

    public String getTipoDeLocacao() {
        return tipoDeLocacao;
    }

    public void setTipoDeLocacao(String tipoDeLocacao) {
        this.tipoDeLocacao = tipoDeLocacao;
    }

    public BigDecimal getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(BigDecimal valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
    

}
