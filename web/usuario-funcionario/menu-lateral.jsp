      <!-- Menu lateral do funcionario -->
      
      <div class="col-md-2 col-sm-1 hidden-xs display-table-cell v-align box" id="navigation">
        <div class="logo">
          <h3 class="m-4">BEIBE</h3>
        </div>
        <div>
          <ul class="navi">

            <li>
              <a href="${pageContext.request.contextPath}/FuncionarioServlet?action=login" method="post"
                 ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Atendimentos em Aberto</span></a>
            </li>
            
            <li>
              <a href="${pageContext.request.contextPath}/FuncionarioServlet?action=listarTodosAtendimentos" method="post"
                 ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Todos os Atendimentos</span></a>
            </li>
            
            
            <li>
               <a href="${pageContext.request.contextPath}/FuncionarioServlet?action=categoria" method="post"
                 ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Categorias</span></a>  
             
              
            </li>
            <li>
              <a href="${pageContext.request.contextPath}/FuncionarioServlet?action=listarProdutos" method="post"
                 ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Produtos</span></a>  
            </li>

          </ul>
        </div>
      </div>