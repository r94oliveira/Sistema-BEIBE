/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ufpr.tads.web2.servlet;

import com.ufpr.tads.web2.beans.Atendimento;
import com.ufpr.tads.web2.beans.CategoriaProduto;
import com.ufpr.tads.web2.beans.LoginBean;
import com.ufpr.tads.web2.beans.Produto;
import com.ufpr.tads.web2.exceptions.AtendimentoException;
import com.ufpr.tads.web2.exceptions.CategoriaException;
import com.ufpr.tads.web2.exceptions.FuncionarioException;
import com.ufpr.tads.web2.exceptions.ProdutoException;
import com.ufpr.tads.web2.facade.AtendimentoFacade;
import com.ufpr.tads.web2.facade.CategoriaFacade;
import com.ufpr.tads.web2.facade.FuncionarioFacade;
import com.ufpr.tads.web2.facade.ProdutosFacade;
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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
@WebServlet(name = "FuncionarioServlet", urlPatterns = {"/FuncionarioServlet"})
public class FuncionarioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        ServletContext sc = request.getServletContext();
        
     
        
        if("login".equals(action)){
            try {
                HttpSession session = request.getSession();
                List<Atendimento> atendimentos = new ArrayList<Atendimento>();
                atendimentos = AtendimentoFacade.listarTodosAtendimentosEmAberto();
                request.setAttribute("atendimentos", atendimentos);
                RequestDispatcher rd = request.getRequestDispatcher("/usuario-funcionario/home.jsp"); 
                rd.forward(request, response);
            } catch (AtendimentoException ex) {
                Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
        if ("categoria".equals(action)){
            try {
                HttpSession session = request.getSession();
                List<CategoriaProduto> categorias = CategoriaFacade.consultaCategoria();
                request.setAttribute("categorias",categorias);
                RequestDispatcher rd = request.getRequestDispatcher("/usuario-funcionario/categorias.jsp");    
                rd.forward(request, response);
            } catch (CategoriaException ex) {
                Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if("cadastroCategoria".equals(action)){
            CategoriaProduto categoria = new CategoriaProduto();
            String cat = request.getParameter("Categoria");
            System.out.println(cat);
            
            
            if("".equals(cat)){
             request.setAttribute("msgServlet","É necessário digitar algo como o nome da categoria!");
           
            } else {
                try {
                    CategoriaFacade.verificaExisteCategoria(cat);
                    if(CategoriaFacade.verificaExisteCategoria(cat) == 1){
                        request.setAttribute("msgServlet","A categoria que você tentou adicionar já existe! NÃO FOI ADICIONADA");
                        RequestDispatcher rd = request.getRequestDispatcher("FuncionarioServlet?action=categoria");
                        rd.forward(request, response);
                        
                        
                    }
                    categoria.setNome(cat);
                    CategoriaFacade.adicionaCategoria(categoria);
                    response.setContentType("text/html;charset=UTF-8");
                    request.setAttribute("msgServlet","A categoria "+categoria.getNome()+ " foi adicionada!");
                } catch (CategoriaException ex) {
                    Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }      
             
            RequestDispatcher rd = request.getRequestDispatcher("FuncionarioServlet?action=categoria");
            rd.forward(request, response);
        }
        
        if ("excluirCategoria".equals(action)){

            try {
                String id = request.getParameter("id");
                CategoriaFacade.excluirCategoria(id);
                request.setAttribute("msgServlet","A categoria foi excluída com sucesso!");
                RequestDispatcher rd = request.getRequestDispatcher("FuncionarioServlet?action=categoria");    
                rd.forward(request, response);
            } catch (CategoriaException ex) {
                Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        if("resolver".equals(action)){
            try {
                HttpSession session = request.getSession();
                Atendimento atendimento = new Atendimento();
                String idAtendimentoAux = request.getParameter("idAtendimento");
                int idAtendimento = Integer.parseInt(idAtendimentoAux);
                atendimento.setIdAtendimento(idAtendimento);
                atendimento.setSolucao(request.getParameter("solucao"));
                int id = (int)session.getAttribute("id");
                atendimento.setIdFuncionario(id);
                atendimento.setSituacao(1);
                
                AtendimentoFacade.resolverAtendimento(atendimento);
                
                RequestDispatcher rd = request.getRequestDispatcher("FuncionarioServlet?action=login");
                rd.forward(request, response);
            } catch (AtendimentoException ex) {
                Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        
        if ("listarTodosAtendimentos".equals(action)){
            try {
                HttpSession session = request.getSession();
                List<Atendimento> atendimentos = new ArrayList<Atendimento>();
                atendimentos = AtendimentoFacade.listarTodosAtendimentos();
                request.setAttribute("atendimentos", atendimentos);
                for(Atendimento atendimento:atendimentos){
                    System.out.println(atendimento.getIdAtendimento());
                }
                RequestDispatcher rd = request.getRequestDispatcher("/usuario-funcionario/todos-atendimentos.jsp");
                rd.forward(request, response);
            } catch (AtendimentoException ex) {
                Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        }
       
        
        if ("listarProdutos".equals(action)){
            try {
                HttpSession session = request.getSession();
                List<Produto> produtos = ProdutosFacade.consultaProdutos();
                request.setAttribute("produtos",produtos);
                List<CategoriaProduto> categorias = new ArrayList<CategoriaProduto>();
                try {
                    categorias = CategoriaFacade.consultaCategoria();
                } catch (CategoriaException ex) {
                    Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                request.setAttribute("categorias", categorias);
                
                RequestDispatcher rd = request.getRequestDispatcher("/usuario-funcionario/produtos.jsp");
                  
                rd.forward(request, response);
            } catch (ProdutoException ex) {
                Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
   
        
                
        if ("produtos".equals(action)){
            try {
                HttpSession session = request.getSession();
                List<CategoriaProduto> categorias = new ArrayList<CategoriaProduto>();
                categorias = CategoriaFacade.consultaCategoria();
                request.setAttribute("categorias", categorias);
                //LoginBean logado = (LoginBean) session.getAttribute("logado");
                //pode ser que precise passar mais coisas por session ou request
                RequestDispatcher rd = request.getRequestDispatcher("/usuario-funcionario/produtos.jsp");    
                rd.forward(request, response);
            } catch (CategoriaException ex) {
                Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ("cadastroProduto".equals(action)){
            try {
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
                
                
                int verifica = ProdutosFacade.verificaExisteProduto(nomeProduto);
                if(verifica == 1){
                    request.setAttribute("msgServlet","O Produto que você tentou adicionar já existe! NÃO FOI ADICIONADO");
                    List<Produto> produtos = ProdutosFacade.consultaProdutos();
                    request.setAttribute("produtos",produtos);
                    List<CategoriaProduto> categorias = new ArrayList<CategoriaProduto>();
                    try {
                        categorias = CategoriaFacade.consultaCategoria();
                    } catch (CategoriaException ex) {
                        Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    request.setAttribute("categorias", categorias);
                    RequestDispatcher rd = request.getRequestDispatcher("FuncionarioServlet?action=produtos");
                    rd.forward(request, response);
                    
                    
                } else {
                    try {
                        FuncionarioFacade.cadastrarProduto(p);
                    } catch (FuncionarioException ex) {
                        Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    //HttpSession session = request.getSession();
                    //LoginBean logado = (LoginBean) session.getAttribute("logado");
                    //Arrumar: enviar um alerta para dizer que foi cadastrado
                    List<Produto> produtos = ProdutosFacade.consultaProdutos();
                    request.setAttribute("produtos",produtos);
                    List<CategoriaProduto> categorias = new ArrayList<CategoriaProduto>();
                    try {
                        categorias = CategoriaFacade.consultaCategoria();
                    } catch (CategoriaException ex) {
                        Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    request.setAttribute("categorias", categorias);
                    request.setAttribute("msgServlet","Produto Cadastrado com Sucesso");
                    
                    RequestDispatcher rd = request.getRequestDispatcher("/usuario-funcionario/produtos.jsp");
                    rd.forward(request, response);
                }   } catch (ProdutoException ex) {
                Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        
        
            
        
    }
        if ("excluirProduto".equals(action)){

            try {
                String idProduto = request.getParameter("idProduto");
                
                ProdutosFacade.excluirProduto(idProduto);
                request.setAttribute("msgServlet","O produto foi excluído com sucesso!");
                
                List<Produto> produtos = ProdutosFacade.consultaProdutos();
                request.setAttribute("produtos",produtos);
                List<CategoriaProduto> categorias = new ArrayList<CategoriaProduto>();
                try {
                    categorias = CategoriaFacade.consultaCategoria();
                } catch (CategoriaException ex) {
                    Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                request.setAttribute("categorias", categorias);
                
                RequestDispatcher rd = request.getRequestDispatcher("/usuario-funcionario/produtos.jsp");    
                rd.forward(request, response);
            } catch (ProdutoException ex) {
                Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
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
