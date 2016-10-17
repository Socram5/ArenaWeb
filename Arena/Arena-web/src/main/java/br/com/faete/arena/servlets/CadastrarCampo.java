/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.arena.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marcos
 */
@WebServlet("/adicionarCampo")
public class CadastrarCampo extends HttpServlet{
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    
    String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
        String dataEmTexto = request.getParameter("dataNascimento");

        out.println("<html>");
        out.println("<body>");
        out.println("Contato " + nome
                + " adicionado com sucesso");
        out.println("</body>");
        out.println("</html>");
    
}
}
