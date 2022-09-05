        <!-- Menu lateral do cliente -->
        
        <div
          class="col-md-2 col-sm-1 hidden-xs display-table-cell v-align box"
          id="navigation"
        >
          <div class="logo">
            <h3 class="m-4">BEIBE</h3>
          </div>
          <div>
            <ul class="navi">
                <a href="${pageContext.request.contextPath}/usuario-cliente/home.jsp" method="post" ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Meus atendimentos</span></a
                >
              <li>
                <a href="${pageContext.request.contextPath}/ClienteServlet?action=atendimento" method="post" ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Novo Atendimento</span></a
                >
              </li>
              <li >
                      <a href="${pageContext.request.contextPath}/ClienteServlet?action=consultaCadastro" method="post" ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Meus Dados</span></a
                >                    
              </li>
            </ul>
          </div>
        </div>
       