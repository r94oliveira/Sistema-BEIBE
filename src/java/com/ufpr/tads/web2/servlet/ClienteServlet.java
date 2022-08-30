/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ufpr.tads.web2.servlet;

import com.ufpr.tads.web2.beans.Cliente;
import com.ufpr.tads.web2.beans.LoginBean;
import com.ufpr.tads.web2.facade.ClienteFacade;
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

/**
 *
 * @author Rafael
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/ClienteServlet"})
public class ClienteServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      // HttpSession session = request.getSession();
       String action = request.getParameter("action");
       ServletContext sc = request.getServletContext();
       
       
        if (action.equals("consultaCadastro")){
           HttpSession session = request.getSession();
           LoginBean logado = (LoginBean) session.getAttribute("logado");
           int idCliente = logado.getId();
           Cliente cliente = ClienteFacade.consultaCliente(idCliente); 
           System.out.println(cliente.getSobrenomeCliente());
           System.out.println(cliente.getNomecliente());
           request.setAttribute("cliente", cliente);
           
           RequestDispatcher rd = sc.getRequestDispatcher("/usuario-cliente/perfil.jsp");
           rd.forward(request, response);
        }
        
        if(action.equals("alterarCadastro")){
                //Arrumar: pegar idCliente
            //verifica os dados do cliente logado, o id do cliente tem  que vir pela Session.
            //idCliente = 0; // o que vier da session


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

            Cliente c = new Cliente();

           // c.setIdCliente(idCliente);
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

            int x = ClienteFacade.alteraCliente(c);

            if (x==1){

            // Arrumar : enviar o cliente para a home.
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
            } else {
                // Arrumar: Enviar alerta
                //enviar uma mensagem de não alteração dos dados
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
