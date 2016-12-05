/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.marcos.modelo;

import br.com.faete.arena.core.modelo.Campo;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author marcos
 */
@ManagedBean
@SessionScoped
public class CampoMB implements Serializable{
    
    private Campo campo = new Campo();
    
    @EJB
    private CampoBo campoBo;
    
    public void salvar(){
        try {
            campoBo.salvar(campo);
            campo = new Campo();
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Sucesso", "Campo cadastrado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Errro!", ex.getMessage()));
            Logger.getLogger(CampoMB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Campo getCampo() {
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    private static class CampoBo {

        public CampoBo() {
        }

        private void salvar(Campo campo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
