/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.servlets.campo;

import br.com.faete.arena.bo.CampoBO;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marcos
 */
@WebServlet("/campo")
public class CampoServlet extends HttpServlet{
    
    @EJB
    private CampoBO campoBO;
    
    @Override
    protected void service(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("listar") != null
                && !request.getParameter("listar").isEmpty()) {
            listar(request, response);
        } else if (request.getParameter("salvar") != null
                && !request.getParameter("salvar").isEmpty()) {
            salvar(request, response);
        }

}

    private void listar(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void salvar(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
