/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ufpr.tads.web2.servlet;

import com.ufpr.tads.web2.beans.CategoriaProduto;
import com.ufpr.tads.web2.facade.CategoriaFacade;
import jakarta.servlet.RequestDispatcher;
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
@WebServlet(name = "CadastroCategoriaServlet", urlPatterns = {"/CadastroCategoriaServlet"})
public class CadastroCategoriaServlet extends HttpServlet {
    
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {   
    
    CategoriaProduto categoria = new CategoriaProduto();
    
    String cat = request.getParameter("Categoria");
    System.out.println("deveria aparecer aqui");
    System.out.println(cat);
    categoria.setNome(cat);
    
    CategoriaFacade.adicionaCategoria(categoria);
    
    request.setAttribute("Categorias", "teste");
    RequestDispatcher rd = request.getRequestDispatcher("/usuario-funcionario/home.jsp?categorias=valor");
    rd.forward(request, response);
    
    
    
    
    
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
