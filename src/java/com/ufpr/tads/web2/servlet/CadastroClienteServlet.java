/*jakarta Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ufpr.tads.web2.servlet;

import com.ufpr.tads.web2.beans.Cliente;
import com.ufpr.tads.web2.beans.ValidaCPF;
import com.ufpr.tads.web2.exceptions.ClienteException;
import com.ufpr.tads.web2.facade.ClienteFacade;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
@WebServlet(name = "CadastroClienteServlet", urlPatterns = {"/CadastroClienteServlet"})
public class CadastroClienteServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            
            String nome = request.getParameter("Nome");
            String sobrenome = request.getParameter("Sobrenome");
            String email = request.getParameter("Email");
            String cpf = request.getParameter("Cpf");
            String rua = request.getParameter("Rua");
            String num = request.getParameter("Numero");
            int numero = Integer.parseInt(num);
            String complemento = request.getParameter("Complemento");
            String bairro = request.getParameter("Bairro");
            String cidade = request.getParameter("Cidade");
            String cep = request.getParameter("Cep");
            String estado = request.getParameter("Estado");
            String telefone = request.getParameter("Telefone");
            String senha = request.getParameter("Senha");
            
            boolean cpfb = ValidaCPF.isCPF(cpf);
            
            if (!cpfb){
                request.setAttribute("msgServlet","CPF inválido");
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response);
            }
            
            
            
            
            
            Cliente c = new Cliente();

            c.setNomecliente(nome);
            c.setSobrenomeCliente(sobrenome);
            c.setEmailCliente(email);
            c.setCpfCliente(cpf);
            c.setRuaEnderecoCliente(rua);
            c.setNumeroEndercoCliente(numero);
            c.setComplementoEnderecoCliente(complemento);
            c.setBairroEnderecoCliente(bairro);
            c.setCidadeEnderecoCliente(cidade);
            c.setCepEnderecoCliente(cep);
            c.setEstadoEnderecoCliente(estado);
            c.setTelefoneCliente(telefone);
            c.setSenhaCliente(senha);
            
            
            if(ClienteFacade.verificaCliente(c)== 1){
            
                request.setAttribute("msgServlet","Cliente não cadastrado! Email ou CPF Já Existem Em Outro Cadastro");
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response);
            }
            
            
            
        
            if(ClienteFacade.adicionaCliente(c) == null){
                //falha em add o cliente
                request.setAttribute("msgServlet","Cliente não cadastrado! Refaça o cadastro");
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response); 
            } else {
                request.setAttribute("msgServlet","Cliente cadastrado com sucesso. Faça o login!");
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response); 
            }
        } catch (ClienteException ex) {
            Logger.getLogger(CadastroClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
