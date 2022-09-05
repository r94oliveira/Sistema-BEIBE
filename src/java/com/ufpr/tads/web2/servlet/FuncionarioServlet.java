/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ufpr.tads.web2.servlet;

import com.ufpr.tads.web2.beans.CategoriaProduto;
import com.ufpr.tads.web2.beans.LoginBean;
import com.ufpr.tads.web2.beans.Produto;
import com.ufpr.tads.web2.facade.CategoriaFacade;
import com.ufpr.tads.web2.facade.FuncionarioFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
@WebServlet(name = "FuncionarioServlet", urlPatterns = {"/FuncionarioServlet"})
public class FuncionarioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        ServletContext sc = request.getServletContext();
        
        if ("categoria".equals(action)){
            System.out.println(action);
            HttpSession session = request.getSession();
            List<CategoriaProduto> categorias = CategoriaFacade.consultaCategoria();
            request.setAttribute("categorias",categorias);
            RequestDispatcher rd = request.getRequestDispatcher("/usuario-funcionario/categorias.jsp");
            rd.forward(request, response);    
        }
        
        if("cadastroCategoria".equals(action)){
            CategoriaProduto categoria = new CategoriaProduto();
            String cat = request.getParameter("Categoria");
            
            if("".equals(cat)){
             request.setAttribute("msgServlet","É necessário digitar algo como o nome da categoria!");
           
            } else {
                categoria.setNome(cat);
                CategoriaFacade.adicionaCategoria(categoria);
                request.setAttribute("msgServlet","A categoria "+categoria.getNome()+ " foi adicionada!");
            }      
             
            RequestDispatcher rd = request.getRequestDispatcher("FuncionarioServlet?action=categoria&CadastroCategoria=true");
            rd.forward(request, response);
        }
        
        if ("excluirCategoria".equals(action)){

            String id = request.getParameter("id");
            CategoriaFacade.excluirCategoria(id);
            request.setAttribute("msgServlet","A categoria foi excluída com sucesso!");
            RequestDispatcher rd = request.getRequestDispatcher("FuncionarioServlet?action=categoria");
            rd.forward(request, response);    
        }
                
        if ("produtos".equals(action)){
            HttpSession session = request.getSession();
            List<CategoriaProduto> categorias = new ArrayList<CategoriaProduto>();
            categorias = CategoriaFacade.consultaCategoria();
            request.setAttribute("categorias", categorias);
            //LoginBean logado = (LoginBean) session.getAttribute("logado");
            //pode ser que precise passar mais coisas por session ou request
            RequestDispatcher rd = request.getRequestDispatcher("/usuario-funcionario/produtos.jsp");
            rd.forward(request, response);    
        }
        if ("cadastroProduto".equals(action)){
            String nomeProduto = request.getParameter("nome");
            String descricao = request.getParameter("descricao");
            String pes = request.getParameter("peso");
            Double peso = Double.parseDouble(pes);
            String categoriaProd = request.getParameter("categoriaProduto");
            int categoriaProduto = Integer.parseInt(categoriaProd);
            
            Produto p = new Produto();
            p.setCategoria(categoriaProduto);
            p.setDescricao(descricao);
            p.setNome(nomeProduto);
            p.setPeso(peso);
            
            FuncionarioFacade.cadastrarProduto(p);
            
            //HttpSession session = request.getSession();
            //LoginBean logado = (LoginBean) session.getAttribute("logado");
            //Arrumar: enviar um alerta para dizer que foi cadastrado
            RequestDispatcher rd = request.getRequestDispatcher("/usuario-funcionario/produtos.jsp?CadastroProduto=true");
            rd.forward(request, response);    
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
