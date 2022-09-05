          <!-- Menu do topo contendo nome do usuário e botão de logout  -->
          
          <div class="row">
            <header class="d-flex flex-row">
              <div class="p-2 col-9 text-left">
                  
                  <p>Seja bem vindo(a) <c:out value="${logado.nome}"/>! </p>
              </div>
              <div class="p-2 col-3 text-right">
                <p><a href="${pageContext.request.contextPath}/LogoutServlet" method="post" class="float-right btn btn-danger rounded">Sair</a></p>
              </div>
            </header>
          </div>