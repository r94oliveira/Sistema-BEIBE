/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ufpr.tads.web2.servlet;

import com.ufpr.tads.web2.beans.Atendimento;
import com.ufpr.tads.web2.beans.Funcionario;
import com.ufpr.tads.web2.beans.ValidaCPF;
import com.ufpr.tads.web2.facade.AtendimentoFacade;
import com.ufpr.tads.web2.facade.FuncionarioFacade;
import com.ufpr.tads.web2.facade.GerenteFacade;
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
            String sobrenome = request.getParameter("sobrenomeFuncionario");
            String cpf = request.getParameter("cpf");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            String telefone = request.getParameter("telefone");
            String rua = request.getParameter("rua");
            String numeroAux = request.getParameter("numero");
            int numero = Integer.parseInt(numeroAux);
            String complemento = request.getParameter("complemento");
            String bairro = request.getParameter("bairro");
            String cep = request.getParameter("cep");
            String estado = request.getParameter("estado");
            String cidade = request.getParameter("cidade");
            String cargoAux = request.getParameter("cargo");
            
            int cargo = Integer.parseInt(cargoAux);
            
            boolean cpfb = ValidaCPF.isCPF(cpf);
            
            if (!cpfb){
                request.setAttribute("msgServlet","CPF inválido");
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response);
            }
            
            
            
            Funcionario funcionario = new Funcionario();
            
            funcionario.setNomeFuncionario(nome);
            funcionario.setSobrenomeFuncionario(sobrenome);
            funcionario.setCpfFuncionario(cpf);
            funcionario.setEmailFuncionario(email);
            funcionario.setSenhaFuncionario(senha);
            funcionario.setTelefoneFuncionario(telefone);
            funcionario.setRuaEnderecoFuncionario(rua);
            funcionario.setNumeroEndercoFuncionario(numero);
            funcionario.setComplementoEnderecoFuncionario(complemento);
            funcionario.setBairroEnderecoFuncionario(bairro);
            funcionario.setCepEnderecoFuncionario(cep);
            funcionario.setEstadoEnderecoFuncionario(estado);
            funcionario.setCidadeEnderecoFuncionario(cidade);
            funcionario.setCargoFuncionario(cargo);
            
            GerenteFacade.cadastrarFuncionario(funcionario);
            request.setAttribute("msgServlet","Funcionario adicionado!");
            RequestDispatcher rd = request.getRequestDispatcher("/GerenteServlet?action=listarFuncionarios");
            rd.forward(request, response); 
            
        }
        if ("listarTodosAtendimentos".equals(action)){
        
            HttpSession session = request.getSession();
            List<Atendimento> atendimentos = new ArrayList<Atendimento>();                   
            atendimentos = AtendimentoFacade.listarTodosAtendimentos();
            request.setAttribute("atendimentos", atendimentos);
            for(Atendimento atendimento:atendimentos){
                System.out.println(atendimento.getIdAtendimento());
            }
            RequestDispatcher rd = request.getRequestDispatcher("/usuario-gerente/todos-atendimentos.jsp");
            rd.forward(request, response); 
        
        }
        
        if("listarAtendimentosEmAberto".equals(action)){
            HttpSession session = request.getSession();
            List<Atendimento> atendimentos = new ArrayList<Atendimento>();                   
            atendimentos = AtendimentoFacade.listarTodosAtendimentosEmAberto();
            request.setAttribute("atendimentos", atendimentos);
            //fazer para atulizar os relatorios(facade)
            RequestDispatcher rd = request.getRequestDispatcher("/usuario-gerente/home.jsp");
            rd.forward(request, response); 
            
        }
        
        
        if("listarFuncionarios".equals(action)){
            HttpSession session = request.getSession();
            List<Funcionario> funcionarios = new ArrayList<Funcionario>();                   
            funcionarios = FuncionarioFacade.listarTodosFuncionarios();
            request.setAttribute("listarFuncionarios", funcionarios);
            //fazer para atulizar os relatorios(facade)
            RequestDispatcher rd = request.getRequestDispatcher("/usuario-gerente/funcionarios.jsp");
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
