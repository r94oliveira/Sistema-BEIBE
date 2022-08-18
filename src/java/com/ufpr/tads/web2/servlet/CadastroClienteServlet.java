/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ufpr.tads.web2.servlet;

import com.ufpr.tads.web2.beans.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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

        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String email = request.getParameter("email");
        String cpf = request.getParameter("cpf");
        String rua = request.getParameter("rua");
        String num = request.getParameter("numero");
        int numero = Integer.parseInt(num);
        String complemento = request.getParameter("complemento");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String cep = request.getParameter("cep");
        String estado = request.getParameter("estado");
        String telefone = request.getParameter("telefone");
        String senha = request.getParameter("senha");
        
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
        
        //chamar/enviar para facede Cadastro para enviar para ClienteDAO
        
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
