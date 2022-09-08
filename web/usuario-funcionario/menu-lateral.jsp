      <!-- Menu lateral do funcionario -->
      
      <div class="col-md-2 col-sm-1 hidden-xs display-table-cell v-align box" id="navigation">
        <div class="logo">
          <h3 class="m-4">BEIBE</h3>
        </div>
        <div>
          <ul class="navi">

            <li>
              <a href="${pageContext.request.contextPath}/usuario-funcionario/home.jsp" method="post"
                 ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Atendimentos em Aberto</span></a>
            </li>
            <li>
               <a href="${pageContext.request.contextPath}/FuncionarioServlet?action=categoria" method="post"
                 ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Categorias</span></a>  
             
              
            </li>
            <li>
              <a href="${pageContext.request.contextPath}/FuncionarioServlet?action=produtos" method="post"
                 ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Produtos</span></a>  
            </li>

          </ul>
        </div>
      </div>