<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <title>Atendimentos - Gerente</title>
          <%@include file="../header.jsp" %>
</head>

<body id="home">
    
  <!-- Página da home -->
  <div class="container-fluid display-table">
    <div class="row display-table-row">
    <%@include file="menu-lateral.jsp" %>
      <div class="col-md-10 col-sm-11 display-table-cell v-align">
   <%@include file="../menu-topo.jsp" %>

        <div class="user-dashboard">
          <div class="row">
            <!-- INICIO DE CONTEÚDO  -->
            <!-- Texto Título -->
            <div class="w-100 py-4">
              <h2 class="text-center">Atendimentos</h2>
            </div>
        <!-- tabela -->
        <div class="table-responsive-sm w-100 py-2">
          <div class="dropdown">
            <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Filtro
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
              <a class="dropdown-item" href="#">Todos os Atendimentos</a>
              <a class="dropdown-item" href="#">Atendimentos em aberto</a>
            </div>
          </div>
          <table class="table align-middle mb-0 bg-white">
            <thead class="bg-light">
              <tr>
                <th>ID</th>
                <th>Produto</th>
                <th>Abertura</th>
                <th>Status</th>
                <th></th>

              </tr>
            </thead>
            <tbody>
              <tr>
                <td>
                  <p class="fw-normal mb-1">123</p>
                </td>
                <td>
                  <p class="fw-normal mb-1">Creme</p>
                </td>
                <td>
                  <p class="fw-normal mb-1">14/05/2022</p>
                </td>
                <td>
                  <span class="badge badge-success rounded-pill d-inline">Aberto</span>
                </td>
                
                <td>
                  <a href="#" data-toggle="modal" data-target="#modal-form"><button type="button" class="btn btn-link btn-sm btn-rounded">
                    Abrir
                  </button></a>
                </td>
              </tr>
              <tr>
                <td>
                  <p class="fw-normal mb-1">123</p>
                </td>
                <td>
                  <p class="fw-normal mb-1">Creme</p>
                </td>
                <td>
                  <p class="fw-normal mb-1">14/05/2022</p>
                </td>
                <td>
                  <span class="badge badge-secondary rounded-pill d-inline">Encerrado</span>
                </td>
                </td>
                <td>
                  <a href="#" data-toggle="modal" data-target="#modal-form"><button type="button" class="btn btn-link btn-sm btn-rounded">
                    Abrir
                  </button></a>
                </td>
              </tr>
              <tr>
                <td>
                  <p class="fw-normal mb-1">123</p>
                </td>
                <td>
                  <p class="fw-normal mb-1">Creme</p>
                </td>
                <td>
                  <p class="fw-normal mb-1">14/05/2022</p>
                </td>
                <td>
                  <span class="badge badge-success rounded-pill d-inline">Aberto</span>
                </td>
                <td>
                  <a href="#" data-toggle="modal" data-target="#modal-form"><button type="button" class="btn btn-link btn-sm btn-rounded">
                    Abrir
                  </button></a>
                </td>
              </tr>

            </tbody>
          </table>
        </div>

          <!-- Modal form -->
          <div id="modal-form" class="modal fade" role="dialog">
            <div class="modal-dialog">
              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header login-header">
                  <h4 class="modal-title">Informações Atendimento</h4>
                </div>
                <div class="modal-body">
                  <input type="text" placeholder="Tipo de Atendimento" name="tipoAtendimento" />
                  <input type="text" placeholder="Categoria" name="categoriaAtendimento" />
                  <input type="text" placeholder="Produto" name="produto" />
                  <textarea placeholder="Descrição"></textarea>
                </div>
                <div class="modal-footer">
                  <button type="button" class="cancel" data-dismiss="modal">
                    Fechar
                  </button>                  
                </div>
              </div>
            </div>
          </div>

          
            <!-- FIM DE CONTEÚDO  -->
          </div>
        </div>
      </div>
    </div>
  </div>
     <%@include file="../footer.jsp" %>
</body>

</html>