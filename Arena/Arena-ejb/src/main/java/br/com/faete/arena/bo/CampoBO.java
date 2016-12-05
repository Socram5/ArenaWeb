/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.bo;


import br.com.faete.marcos.modelo.modelos.Campo;
import br.com.faete.arena.dao.CampoDAO;
import java.util.List;
import java.util.Objects;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author marcos
 */
@Stateless
public class CampoBO {
    
    @EJB
    private CampoDAO campoDAO;

    
    
    public void salvar(Campo campo) throws Exception {

        if (campo == null) {
            throw new Exception("Campo não pode ser nulo");
        }
               if (campo.getTamanho() == null || campo.getTamanho().isEmpty()) {

        
            throw new Exception("Informe o tamanho do campo!");
        }
        if (campo.getId() == null) {
            List lista = campoDAO.findByField("chassi", campo.getTamanho());
            if (lista != null && !lista.isEmpty()) {
                throw new Exception("Já existe um horario reservado para esse campo!");
            }
            campoDAO.salvar(campo);
        } else {
            List<Campo> lista = campoDAO.findByField("tamanho", campo.getTamanho());
            if (lista != null && !lista.isEmpty()) {
                for (Campo c : lista) {
                    if (!Objects.equals(c.getId(), campo.getId())) {
                        throw new Exception("Já existe um veículo no banco com este Chassi!");
                    }
                }
            }
            campoDAO.atualizar(campo);
        }
    }

        
        
 public CampoDAO getCampoDAO() {
        return campoDAO;
 }
    
}

