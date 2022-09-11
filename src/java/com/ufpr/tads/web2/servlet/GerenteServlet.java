/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ufpr.tads.web2.servlet;

import com.ufpr.tads.web2.beans.Atendimento;
import com.ufpr.tads.web2.beans.Funcionario;
import com.ufpr.tads.web2.beans.ValidaCPF;
import com.ufpr.tads.web2.exceptions.AtendimentoException;
import com.ufpr.tads.web2.exceptions.FuncionarioException;
import com.ufpr.tads.web2.exceptions.GerenteException;
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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            
            try {
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
                
                if(GerenteFacade.verificaFuncionario(funcionario) == 1){
                    List<Funcionario> funcionarios = new ArrayList<Funcionario>();
                    try {
                        funcionarios = FuncionarioFacade.listarTodosFuncionarios();
                    } catch (FuncionarioException ex) {
                        Logger.getLogger(GerenteServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    request.setAttribute("listarFuncionarios", funcionarios);
                    request.setAttribute("msgServlet","Funcionario não cadastrado! Email ou CPF Já Existem Em Outro Cadastro");
                    RequestDispatcher rd = request.getRequestDispatcher("/usuario-gerente/funcionarios.jsp");
                    rd.forward(request, response);
                }
                
                GerenteFacade.cadastrarFuncionario(funcionario);
                request.setAttribute("msgServlet","Funcionario adicionado!");
                RequestDispatcher rd = request.getRequestDispatcher("/GerenteServlet?action=listarFuncionarios");
                rd.forward(request, response);
            } catch (GerenteException ex) {
                Logger.getLogger(GerenteServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
         if("alterarFuncionario".equals(action)){
            
            try {
                String idFuncionario = request.getParameter("idFuncionario");
                
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
                    RequestDispatcher rd = request.getRequestDispatcher("/GerenteServlet?action=listarFuncionarios");
                    rd.forward(request, response);
                }
                Funcionario funcionario = new Funcionario();
                funcionario.setIdFuncionario(Integer.parseInt(idFuncionario));
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
                
                GerenteFacade.alterarFuncionario(funcionario);
                request.setAttribute("msgServlet","Funcionario adicionado!");
                RequestDispatcher rd = request.getRequestDispatcher("/GerenteServlet?action=listarFuncionarios");
                rd.forward(request, response);
            } catch (GerenteException ex) {
                Logger.getLogger(GerenteServlet.class.getName()).log(Level.SEVERE, null, ex);
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
                RequestDispatcher rd = request.getRequestDispatcher("/usuario-gerente/todos-atendimentos.jsp");
                rd.forward(request, response);
            } catch (AtendimentoException ex) {
                Logger.getLogger(GerenteServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        if("listarAtendimentosEmAberto".equals(action)){
            try {
                HttpSession session = request.getSession();
                List<Atendimento> atendimentos = new ArrayList<Atendimento>();
                try {
                    atendimentos = AtendimentoFacade.listarTodosAtendimentosEmAberto();
                } catch (AtendimentoException ex) {
                    Logger.getLogger(GerenteServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                request.setAttribute("atendimentos", atendimentos);
                //fazer para atulizar os relatorios(facade)
                
                int todosAtendimentos = GerenteFacade.countTodosAtendimentos();
                int todosAtendimentosEmAberto = GerenteFacade.countTodosAtendimentosEmAberto();
                int todasReclamacoes = GerenteFacade.countReclamacoes();
                int todasReclamacoesEmAberto = GerenteFacade.countReclamacoesEmAberto();
                int todasInformacoes = GerenteFacade.countInformacoes();
                int todasInformacoesEmAberto = GerenteFacade.countInformacoesEmAberto();
                int todosElogio = GerenteFacade.countElogio();
                int todasElogioEmAberto = GerenteFacade.countElogioEmAberto();
                int todasSugestoes = GerenteFacade.countSugestao();
                int todasSugestoesEmAberto = GerenteFacade.countSugestaoEmAberto();
                
                
                System.out.println("texto para mostrar o numero de sugestoes");
                System.out.println(todasSugestoes);
                System.out.println( todasSugestoesEmAberto);
                
                
                
                
                int percentual = 0;
                percentual =((todosAtendimentosEmAberto*100)/todosAtendimentos);
                System.out.println(percentual);
                
                
                request.setAttribute("todosAtendimentos",todosAtendimentos);
                request.setAttribute("todosAtendimentosEmAberto",todosAtendimentosEmAberto);
                request.setAttribute("todasReclamacoes",todasReclamacoes);
                request.setAttribute("todasReclamacoesEmAberto",todasReclamacoesEmAberto);
                request.setAttribute("todasInformacoes",todasInformacoes);
                request.setAttribute("todasInformacoesEmAberto",todasInformacoesEmAberto);
                request.setAttribute("todosElogio",todosElogio);
                request.setAttribute("todasElogioEmAberto",todasElogioEmAberto);
                request.setAttribute("todasSugestoes",todasSugestoes);
                request.setAttribute("todasSugestoesEmAberto",todasSugestoesEmAberto);
                request.setAttribute("percentual", percentual);
                
                
                RequestDispatcher rd = request.getRequestDispatcher("/usuario-gerente/home.jsp"); 
                rd.forward(request, response);
            } catch (GerenteException ex) {
                Logger.getLogger(GerenteServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        if("listarFuncionarios".equals(action)){
            try {
                HttpSession session = request.getSession();
                List<Funcionario> funcionarios = new ArrayList<Funcionario>();
                funcionarios = FuncionarioFacade.listarTodosFuncionarios();
                request.setAttribute("listarFuncionarios", funcionarios);
                //fazer para atulizar os relatorios(facade)
                RequestDispatcher rd = request.getRequestDispatcher("/usuario-gerente/funcionarios.jsp"); 
                rd.forward(request, response);
            } catch (FuncionarioException ex) {
                Logger.getLogger(GerenteServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        if("relatorios".equals(action)){
        
            try {
                int todosAtendimentos = GerenteFacade.countTodosAtendimentos();
                int todosAtendimentosEmAberto = GerenteFacade.countTodosAtendimentosEmAberto();
                int todasReclamacoes = GerenteFacade.countReclamacoes();
                int todasReclamacoesEmAberto = GerenteFacade.countReclamacoesEmAberto();
                int todasInformacoes = GerenteFacade.countInformacoes();
                int todasInformacoesEmAberto = GerenteFacade.countInformacoesEmAberto();
                int todosElogio = GerenteFacade.countElogio();
                int todasElogioEmAberto = GerenteFacade.countElogioEmAberto();
                int todasSugestoes = GerenteFacade.countSugestao();
                int todasSugestoesEmAberto = GerenteFacade.countSugestaoEmAberto();
                
                
                System.out.println("texto para mostrar o numero de sugestoes");
                System.out.println(todasSugestoes);
                System.out.println( todasSugestoesEmAberto);
                
                
                
                
                int percentual = 0;
                percentual =((todosAtendimentosEmAberto*100)/todosAtendimentos);
                System.out.println(percentual);
                
                
                request.setAttribute("todosAtendimentos",todosAtendimentos);
                request.setAttribute("todosAtendimentosEmAberto",todosAtendimentosEmAberto);
                request.setAttribute("todasReclamacoes",todasReclamacoes);
                request.setAttribute("todasReclamacoesEmAberto",todasReclamacoesEmAberto);
                request.setAttribute("todasInformacoes",todasInformacoes);
                request.setAttribute("todasInformacoesEmAberto",todasInformacoesEmAberto);
                request.setAttribute("todosElogio",todosElogio);
                request.setAttribute("todasElogioEmAberto",todasElogioEmAberto);
                request.setAttribute("todasSugestoes",todasSugestoes);
                request.setAttribute("todasSugestoesEmAberto",todasSugestoesEmAberto);
                request.setAttribute("percentual", percentual);
                
                
                
                RequestDispatcher rd = request.getRequestDispatcher("/usuario-gerente/relatorios.jsp"); 
                rd.forward(request, response);
            } catch (GerenteException ex) {
                Logger.getLogger(GerenteServlet.class.getName()).log(Level.SEVERE, null, ex);
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
