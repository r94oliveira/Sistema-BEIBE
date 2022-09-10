/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ufpr.tads.web2.servlet;

import com.ufpr.tads.web2.beans.Funcionario;
import com.ufpr.tads.web2.facade.GerenteFacade;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author janai
 */
@WebServlet(name = "GerenteServlet", urlPatterns = {"/GerenteServlet"})
public class GerenteServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        ServletContext sc = request.getServletContext();
        
        if("cadastrarFuncionario".equals(action)){
            
            String nome = request.getParameter("nome");
            String sobrenome = request.getParameter("sobrenome");
            String cpfAux = request.getParameter("cpf");
            int cpf = Integer.parseInt(cpfAux);
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            String telefone = request.getParameter("telefone");
            String rua = request.getParameter("rua");
            String numeroAux = request.getParameter("numero");
            int numero = Integer.parseInt(numeroAux);
            String complemento = request.getParameter("complemento");
            String cep = request.getParameter("cep");
            String estado = request.getParameter("estado");
            String cidade = request.getParameter("cidade");
            String cargoAux = request.getParameter("cargo");
            int cargo = Integer.parseInt(cargoAux);
            
            Funcionario funcionario = new Funcionario();
            
            funcionario.setNomeFuncionario(nome);
            funcionario.setSobreNome(sobrenome);
            funcionario.setCpf(cpf);
            funcionario.setEmailFuncionario(email);
            funcionario.setSenhaFuncionario(senha);
            funcionario.setTelefone(telefone);
            funcionario.setRuaEnderecoFuncionario(rua);
            funcionario.setNumeroEndercoFuncionario(numero);
            funcionario.setComplementoEnderecoFuncionario(complemento);
            funcionario.setCepEnderecoFuncionario(cep);
            funcionario.setEstadoEnderecoFuncionario(estado);
            funcionario.setCidadeEnderecoFuncionario(cidade);
            funcionario.setCargoFuncionario(cargo);
            
            GerenteFacade.cadastrarFuncionario(funcionario);
            
            
            
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
