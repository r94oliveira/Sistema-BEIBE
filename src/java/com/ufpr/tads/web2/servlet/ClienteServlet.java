/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ufpr.tads.web2.servlet;

import com.ufpr.tads.web2.beans.Atendimento;
import com.ufpr.tads.web2.beans.CategoriaProduto;
import com.ufpr.tads.web2.beans.Cliente;
import com.ufpr.tads.web2.beans.LoginBean;
import com.ufpr.tads.web2.beans.Produto;
import com.ufpr.tads.web2.beans.TipoAtendimento;
import com.ufpr.tads.web2.facade.AtendimentoFacade;
import com.ufpr.tads.web2.facade.CategoriaFacade;
import com.ufpr.tads.web2.facade.ClienteFacade;
import com.ufpr.tads.web2.facade.ProdutosFacade;
import com.ufpr.tads.web2.facade.TipoAtendimentoFacade;
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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/ClienteServlet"})
public class ClienteServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8"); 
       request.setCharacterEncoding("UTF-8");
       
       String action = request.getParameter("action");
       ServletContext sc = request.getServletContext();
       
        if (action.equals("login")){
            HttpSession session = request.getSession();
            List<Atendimento> atendimentos = new ArrayList<Atendimento>();
            int id = (int)session.getAttribute("id");        
            atendimentos = AtendimentoFacade.consultaAtendimento(id);
            request.setAttribute("atendimentos", atendimentos);
           RequestDispatcher rd = request.getRequestDispatcher("/usuario-cliente/home.jsp");
            rd.forward(request, response); 
        }
       
        if (action.equals("consultaCadastro")){
           HttpSession session = request.getSession();
           LoginBean logado = (LoginBean) session.getAttribute("logado");
           int idCliente = logado.getId();
           Cliente cliente = ClienteFacade.consultaCliente(idCliente); 
           request.setAttribute("cliente", cliente);
           
           RequestDispatcher rd = sc.getRequestDispatcher("/usuario-cliente/perfil.jsp");
           rd.forward(request, response);
        }
        
        if("alteraCadastro".equals(action)){
            HttpSession session = request.getSession();
            LoginBean logado = (LoginBean) session.getAttribute("logado");
            
            String idCli = request.getParameter("idCliente");
            int idCliente = Integer.parseInt(idCli);
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

            c.setIdCliente(idCliente);
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

            if (ClienteFacade.alteraCliente(c)== 1){
            //arrumar: enviar um alerta que o usuario foi alterado    
            request.setAttribute("cliente", c);
             List<Atendimento> atendimentos = new ArrayList<Atendimento>();
            int id = (int)session.getAttribute("id");        
            atendimentos = AtendimentoFacade.consultaAtendimento(id);
            request.setAttribute("atendimentos", atendimentos);
            RequestDispatcher rd = request.getRequestDispatcher("ClienteServlet?action=login");
            rd.forward(request, response);
            
            } else {
                
                //arrumar: enviar um alerta que não deu certo alterar
                //alterar para enviar para "/usuario-cliente/home.jsp" (deixei diferente só para ver funcinando
                
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response);
            }
        }
        
        if("atendimento".equals(action)){
            HttpSession session = request.getSession();
            LoginBean logado = (LoginBean) session.getAttribute("logado");
            // na session encontra-se o id do cliente --se precisar--int idCliente = logado.getId();
           
            /*pegar a lista de produtos do banco DEIXEI AQUI, VAI QUE PRECISA
            List<CategoriaProduto> categorias = new ArrayList<CategoriaProduto>();
            categorias = CategoriaFacade.consultaCategoria();
            request.setAttribute("categorias", categorias);*/
            
            //pegar os tipos de atendimentos do banco E
            List<TipoAtendimento> tipoAtendimentos = new ArrayList<TipoAtendimento>();
            tipoAtendimentos = TipoAtendimentoFacade.consultaTipoAtendimento();
            request.setAttribute("tipoAtendimentos", tipoAtendimentos);
            //pegar os produtos relacionados com o tipo escolhido do bacno
            List<Produto> produtos = new ArrayList<Produto>();
            produtos = ProdutosFacade.consultaProdutos();
            request.setAttribute("produtos", produtos);
            
            //verificar como filtrar os produtos de acordo com o tipo
            //se isso é feito em servlet ou se pode ser feito na jsp
            
            RequestDispatcher rd = request.getRequestDispatcher("/usuario-cliente/atendimento.jsp");
            rd.forward(request, response);
        }
        
        
        
        if("novoAtendimento".equals(action)){
            HttpSession session = request.getSession();
            LoginBean logado = (LoginBean) session.getAttribute("logado");
            String idPro = request.getParameter("produto");
            int idProduto = Integer.parseInt(idPro);
            String tipoAten = request.getParameter("tipoAtendimento");
            int idTipoAtendimento = Integer.parseInt(tipoAten);
            String descricao = request.getParameter("descricao");
            int idCliente = logado.getId();
            Atendimento atendimento = new Atendimento();
            atendimento.setDescricao(descricao);
            atendimento.setIdCliente(idCliente);
            atendimento.setIdTipoAtendimento(idTipoAtendimento);
            atendimento.setIdProduto(idProduto);
            AtendimentoFacade.cadastroAtendimento(atendimento);
            
            //enviar alerta de cadastro com sucesso ou nao
            List<Atendimento> atendimentos = new ArrayList<Atendimento>();
            int id = (int)session.getAttribute("id");        
            atendimentos = AtendimentoFacade.consultaAtendimento(id);
            request.setAttribute("atendimentos", atendimentos);
            RequestDispatcher rd = request.getRequestDispatcher("/usuario-cliente/home.jsp");
            rd.forward(request, response);
        }
        
        if ("excluirAtendimento".equals(action)){

            String idAux = request.getParameter("id");
            int id = Integer.parseInt(idAux);
            System.out.println(id);
             System.out.println("IMPRIMIU AQUI EM CIMA O ID");
            AtendimentoFacade.excluirAtendimento(id);
            
            request.setAttribute("msgServlet","O atendimento foi excluído com sucesso!");
            RequestDispatcher rd = request.getRequestDispatcher("ClienteServlet?action=login");
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
