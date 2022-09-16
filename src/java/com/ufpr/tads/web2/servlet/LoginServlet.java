/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ufpr.tads.web2.servlet;

import com.ufpr.tads.web2.beans.Atendimento;
import com.ufpr.tads.web2.beans.Cliente;
import com.ufpr.tads.web2.beans.Funcionario;
import com.ufpr.tads.web2.beans.Login;
import com.ufpr.tads.web2.beans.LoginBean;
import com.ufpr.tads.web2.exceptions.LoginException;
import com.ufpr.tads.web2.facade.AtendimentoFacade;
import com.ufpr.tads.web2.facade.LoginFacade;
import jakarta.servlet.RequestDispatcher;
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
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
            String email = request.getParameter ("Email");
                String senha = request.getParameter("Senha");
            
            Login log = new Login ();
            log.setEmail(email);
            log.setSenha(senha);
            request.setCharacterEncoding("UTF-8");
            Cliente cliente = LoginFacade.logarCliente(log);
            
            if (0 != cliente.getIdCliente()){
                
                LoginBean loginBean = new LoginBean(cliente.getIdCliente(),cliente.getNomecliente());
                HttpSession session = request.getSession();
                session.setAttribute("logado", loginBean);
                session.setAttribute("id",loginBean.getId());
                //List<Atendimento> atendimentos = new ArrayList<Atendimento>();
                //atendimentos = AtendimentoFacade.consultaAtendimento(cliente.getIdCliente());
                // request.setAttribute("atendimentos", atendimentos);
                RequestDispatcher rd = request.getRequestDispatcher("ClienteServlet?action=login");
                rd.forward(request, response);
            }
            
            Funcionario func = LoginFacade.logarFuncionario(log);
            
            if(1 == func.getCargoFuncionario()){
                
                LoginBean loginBean = new LoginBean (func.getIdFuncionario(),func.getNomeFuncionario());
                HttpSession session = request.getSession();
                session.setAttribute("logado", loginBean);
                session.setAttribute("id",loginBean.getId());
                RequestDispatcher rd = request.getRequestDispatcher("FuncionarioServlet?action=login");
                rd.forward(request, response);
            }
            
            if(2 == func.getCargoFuncionario()){
                LoginBean loginBean = new LoginBean (func.getIdFuncionario(),func.getNomeFuncionario());
                HttpSession session = request.getSession();
                session.setAttribute("logado", loginBean);
                session.setAttribute("id",loginBean.getId());
                RequestDispatcher rd = request.getRequestDispatcher("GerenteServlet?action=listarAtendimentosEmAberto");
                rd.forward(request, response);
            }
            else{
                
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp?falha=true");
                rd.forward(request, response);
            }
        } catch (LoginException ex) {
           Logger.getLogger(CadastroClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
                        request.setAttribute("msgServlet","Parece que tivemos um erro, por favor faça o login novamente");
                            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
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
