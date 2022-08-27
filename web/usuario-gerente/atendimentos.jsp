<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Home Page Gerente</title>

  <!-- CSS only -->
  <link rel="stylesheet" href="../css/style.css" />
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous" />
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet"
    integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous" />
</head>

<body id="home">
    
    <c:if test="${empty sessionScope.logado}">
        <c:set var= "mensagem" value="Precisa fazer o login" scope="request"/>
        <jsp:forward page="index.jsp" />
    </c:if>

  <!-- Página da home -->
  <div class="container-fluid display-table">
    <div class="row display-table-row">
      <!-- Menu lateral  -->
      <div class="col-md-2 col-sm-1 hidden-xs display-table-cell v-align box" id="navigation">
        <div class="logo">
          <h3 class="m-4">BEIBE</h3>
        </div>
        <div>
          <ul class="navi">
            <li>
              <a href="gerente-home.html"><i class="fa fa-tasks" aria-hidden="true"></i><span
                  class="hidden-xs hidden-sm">Relatórios</span></a>
            </li>
            <li class="active">
              <a href="gerente-atend.html"><i class="fa fa-tasks" aria-hidden="true"></i><span
                  class="hidden-xs hidden-sm">Atendimentos</span></a>
            </li>
            <li>
              <a href="gerente-func.html"><i class="fa fa-tasks" aria-hidden="true"></i><span
                  class="hidden-xs hidden-sm">Funcionários</span></a>
            </li>


          </ul>
        </div>
      </div>
      <div class="col-md-10 col-sm-11 display-table-cell v-align">
        <!-- Header  -->
        <div class="row">
          <header class="d-flex flex-row">
            <div class="p-2 col-9 text-left">
              <p>Seja bem vindo(a) GERENTE</p>
            </div>
            <div class="p-2 col-3 text-right">
              <p><a href="login.html">Sair</a></p>
            </div>
          </header>
        </div>

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
  <!-- JS only -->

  <script src="js/main.js"></script>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    crossorigin="anonymous"></script>
</body>

</html>