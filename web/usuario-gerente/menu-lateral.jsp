      <!-- Menu lateral do gerente  -->
      
      <div class="col-md-2 col-sm-1 hidden-xs display-table-cell v-align box" id="navigation">
        <div class="logo">
          <h3 class="m-4">BEIBE</h3>
        </div>
        <div>
          <ul class="navi">
              <li>
               <a href="${pageContext.request.contextPath}/GerenteServlet?action=listarAtendimentosEmAberto" method="post"
                 ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Atendimentos em Abeto</span></a>
            </li>
              
             <li>
               <a href="${pageContext.request.contextPath}/GerenteServlet?action=listarTodosAtendimentos" method="post"
                 ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Todos os Atendimentos</span></a>
            </li>
            
            
            <li>
               <a href="${pageContext.request.contextPath}/usuario-gerente/relatorios.jsp" method="post"
                 ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Relatórios</span></a>
            </li>
           
            <li>
               <a href="${pageContext.request.contextPath}/GerenteServlet?action=listarFuncionarios" method="post"
                 ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Funcionários</span></a>
            </li>


          </ul>
        </div>
      </div>