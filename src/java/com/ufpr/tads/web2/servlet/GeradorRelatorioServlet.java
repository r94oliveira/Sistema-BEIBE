/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ufpr.tads.web2.servlet;

import com.ufpr.tads.web2.dao.ConnectionFactory;
import jakarta.servlet.RequestDispatcher;
import java.sql.Connection;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;

/**
 *
 * @author janai
 */
@WebServlet(name = "GeradorRelatorioServlet", urlPatterns = {"/GeradorRelatorioServlet"})
public class GeradorRelatorioServlet extends HttpServlet {

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
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        



            Connection conn = null;
            response.setContentType("text/html;charset=UTF-8");
            String action = request.getParameter("action");
            ServletContext sc = request.getServletContext();
        
       if ("reclamacaoSelect".equals(action)){
       
           String ReclamacaoSelect = request.getParameter("ReclamacaoSelect");
           
           switch(ReclamacaoSelect){
               
               case "1":
                   RequestDispatcher rd = request.getRequestDispatcher("/GeradorRelatorioServlet?action=listarTodasReclamacoes"); 
                   rd.forward(request, response);
               break;
               
                case "2":
                   RequestDispatcher rd2 = request.getRequestDispatcher("/GeradorRelatorioServlet?action=listarTodasReclamacoesEmAberto"); 
                   rd2.forward(request, response);
               break;
               
                case "3":
                   RequestDispatcher rd3 = request.getRequestDispatcher("/GeradorRelatorioServlet?action=listarTodasReclamacoesFechadas"); 
                   rd3.forward(request, response);
               break;
               
           }
       
       
       
       
       }     
            
            
            
            
            
            
            
            
        if("listarTopReclamacao".equals(action)){    
            try {
                conn = new ConnectionFactory().getConnection();
                // Caminho contextualizado do relatório compilado
                String jasper = request.getContextPath() + "/topReclamacao.jasper";
                // Host onde o servlet esta executando 
                String host = "http://" + request.getServerName() + ":" + request.getServerPort(); 
                System.out.println(host+jasper);
                // URL para acesso ao relatório
                URL jasperURL = new URL(host + jasper);

                // Parâmetros do relatório
                HashMap params = new HashMap();
                // Geração do relatório

                byte[] bytes = JasperRunManager.runReportToPdf(jasperURL.openStream(), params, conn);
                if (bytes != null) { 
                   // A página será mostrada em PDF
                   response.setContentType("application/pdf");
                   // Envia o PDF para o Cliente
                   OutputStream ops = response.getOutputStream();  
                   ops.write(bytes);  
                } 
            } // Fechamento do try

            catch(JRException e) {
               request.setAttribute("mensagem", "Erro no Jasper : " + e.getMessage());
               request.getRequestDispatcher("erro.jsp").forward(request, response);
            } 
        } 
        
         if("listaFuncionarios".equals(action)){    
            try {
                conn = new ConnectionFactory().getConnection();
                // Caminho contextualizado do relatório compilado
                String jasper = request.getContextPath() + "/listaFuncionario.jasper";
                // Host onde o servlet esta executando 
                String host = "http://" + request.getServerName() + ":" + request.getServerPort(); 
                System.out.println(host+jasper);
                // URL para acesso ao relatório
                URL jasperURL = new URL(host + jasper);

                // Parâmetros do relatório
                HashMap params = new HashMap();
                // Geração do relatório

                byte[] bytes = JasperRunManager.runReportToPdf(jasperURL.openStream(), params, conn);
                if (bytes != null) { 
                   // A página será mostrada em PDF
                   response.setContentType("application/pdf");
                   // Envia o PDF para o Cliente
                   OutputStream ops = response.getOutputStream();  
                   ops.write(bytes);  
                } 
            } // Fechamento do try

            catch(JRException e) {
               request.setAttribute("mensagem", "Erro no Jasper : " + e.getMessage());
               request.getRequestDispatcher("erro.jsp").forward(request, response);
            } 
        
        }
    
    
    
     if("listarTodasReclamacoes".equals(action)){    
            try {
                conn = new ConnectionFactory().getConnection();
                // Caminho contextualizado do relatório compilado
                String jasper = request.getContextPath() + "/todasReclamacoes1.jasper";
                // Host onde o servlet esta executando 
                String host = "http://" + request.getServerName() + ":" + request.getServerPort(); 
                System.out.println(host+jasper);
                // URL para acesso ao relatório
                URL jasperURL = new URL(host + jasper);

                // Parâmetros do relatório
                HashMap params = new HashMap();
                // Geração do relatório

                byte[] bytes = JasperRunManager.runReportToPdf(jasperURL.openStream(), params, conn);
                if (bytes != null) { 
                   // A página será mostrada em PDF
                   response.setContentType("application/pdf");
                   // Envia o PDF para o Cliente
                   OutputStream ops = response.getOutputStream();  
                   ops.write(bytes);  
                } 
            } // Fechamento do try

            catch(JRException e) {
               request.setAttribute("mensagem", "Erro no Jasper : " + e.getMessage());
               request.getRequestDispatcher("erro.jsp").forward(request, response);
            } 
        
        }
     
     
     if("listarTodasReclamacoesEmAberto".equals(action)){    
            try {
                conn = new ConnectionFactory().getConnection();
                // Caminho contextualizado do relatório compilado
                String jasper = request.getContextPath() + "/reclamacoesEmAberto.jasper";
                // Host onde o servlet esta executando 
                String host = "http://" + request.getServerName() + ":" + request.getServerPort(); 
                System.out.println(host+jasper);
                // URL para acesso ao relatório
                URL jasperURL = new URL(host + jasper);

                // Parâmetros do relatório
                HashMap params = new HashMap();
                // Geração do relatório

                byte[] bytes = JasperRunManager.runReportToPdf(jasperURL.openStream(), params, conn);
                if (bytes != null) { 
                   // A página será mostrada em PDF
                   response.setContentType("application/pdf");
                   // Envia o PDF para o Cliente
                   OutputStream ops = response.getOutputStream();  
                   ops.write(bytes);  
                } 
            } // Fechamento do try

            catch(JRException e) {
               request.setAttribute("mensagem", "Erro no Jasper : " + e.getMessage());
               request.getRequestDispatcher("erro.jsp").forward(request, response);
            } 
        
        }
     
     
     
     if("listarTodasReclamacoesFechadas".equals(action)){    
            try {
                conn = new ConnectionFactory().getConnection();
                // Caminho contextualizado do relatório compilado
                String jasper = request.getContextPath() + "/reclamacoesFechadas.jasper";
                // Host onde o servlet esta executando 
                String host = "http://" + request.getServerName() + ":" + request.getServerPort(); 
                System.out.println(host+jasper);
                // URL para acesso ao relatório
                URL jasperURL = new URL(host + jasper);

                // Parâmetros do relatório
                HashMap params = new HashMap();
                // Geração do relatório

                byte[] bytes = JasperRunManager.runReportToPdf(jasperURL.openStream(), params, conn);
                if (bytes != null) { 
                   // A página será mostrada em PDF
                   response.setContentType("application/pdf");
                   // Envia o PDF para o Cliente
                   OutputStream ops = response.getOutputStream();  
                   ops.write(bytes);  
                } 
            } // Fechamento do try

            catch(JRException e) {
               request.setAttribute("mensagem", "Erro no Jasper : " + e.getMessage());
               request.getRequestDispatcher("erro.jsp").forward(request, response);
            } 
        
        }
     
     
     if("atendimentoData".equals(action)){    
            try {
                conn = new ConnectionFactory().getConnection();
                // Caminho contextualizado do relatório compilado
                String jasper = request.getContextPath() + "/atendimentoData.jasper";
                // Host onde o servlet esta executando 
                String host = "http://" + request.getServerName() + ":" + request.getServerPort(); 
                System.out.println(host+jasper);
                // URL para acesso ao relatório
                URL jasperURL = new URL(host + jasper);

                // Parâmetros do relatório
                HashMap params = new HashMap();
                
                //String dataIni = request.getParameter("dataAtendimento1");
                
                //String dataFin = request.getParameter("dataAtendimento2");
                
                
                
            
                

                
                
             Timestamp dataInicial = Timestamp.valueOf("2022-08-09 00:00:00");
             System.out.print(dataInicial);
             Timestamp dataFinal = Timestamp.valueOf("2022-09-16 23:00:00");
         
               
               // Timestamp dataFinal = Timestamp.valueOf(dataFin);
                
                
                
                params.put("DATAINICIAL", dataInicial);
                params.put("DATAFINAL", dataFinal);
                
                // Geração do relatório

                byte[] bytes = JasperRunManager.runReportToPdf(jasperURL.openStream(), params, conn);
                if (bytes != null) { 
                   // A página será mostrada em PDF
                   response.setContentType("application/pdf");
                   // Envia o PDF para o Cliente
                   OutputStream ops = response.getOutputStream();  
                   ops.write(bytes);  
                } 
            } // Fechamento do try

            catch(JRException e) {
               request.setAttribute("mensagem", "Erro no Jasper : " + e.getMessage());
               request.getRequestDispatcher("erro.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(GeradorRelatorioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(GeradorRelatorioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
