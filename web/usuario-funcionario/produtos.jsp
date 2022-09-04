<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Home Page</title>

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
    
    
    <c:set var="CadastroProduto" value="${param.CadastroProduto}" />
                <c:if test="${CadastroProduto}">
                    <script>alert("Produto Cadastrado com Sucesso");</script>
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
              <a href="func-home.html"><i class="fa fa-tasks" aria-hidden="true"></i><span
                  class="hidden-xs hidden-sm">Atendimentos</span></a>
            </li>
            <li>
              <a href="func-categ.html"><i class="fa fa-tasks" aria-hidden="true"></i><span
                  class="hidden-xs hidden-sm">Categorias</span></a>
            </li>
            <li class="active">
              <a href="func-prod.html"><i class="fa fa-tasks" aria-hidden="true"></i><span
                  class="hidden-xs hidden-sm">Produtos</span></a>
            </li>

          </ul>
        </div>
      </div>
      <div class="col-md-10 col-sm-11 display-table-cell v-align">
        <!-- Header  -->
        <div class="row">
          <header class="d-flex flex-row">
            <div class="p-2 col-9 text-left">
              <p>Seja bem vindo(a) Funcionário</p>
            </div>
            <div class="p-2 col-3 text-right">
              <p><a href="login.html">Sair</a></p>
            </div>
          </header>
        </div>

        <div class="user-dashboard">
          <div class="row">
            <!-- INICIO DE CONTEÚDO  -->

            <!-- Botão para abrir modal  -->

            <li class="pt-4">
              <a href="#" class="add-modal" data-toggle="modal" data-target="#modal-project">Cadastrar produto</a>
            </li>

            <!-- Texto Título -->
            <div class="w-100">
              <h2 class="text-center">Produtos</h2>
            </div>

            <!-- tabela -->
            <div class="table-responsive-sm w-100 py-2">
              <table class="table align-middle mb-0 bg-white">
                <thead class="bg-light">
                  <tr>
                    <th>ID</th>
                    <th>Nome do Produto</th>
                    <th>Categoria</th>
                    <th>Peso</th>
                    <th>Descrição</th>
                    <th>Remover produto</th>

                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>
                      <p class="fw-normal mb-1">123</p>
                    </td>
                    <td>
                      <p class="fw-normal mb-1">Creme Bonito</p>
                    </td>
                    <td>
                      <p class="fw-normal mb-1">Beleza</p>
                    </td>
                    <td>
                      <p class="fw-normal mb-1">100g</p>
                    </td>
                    <td>
                      <p class="fw-normal mb-1">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. </p>
                    </td>
                    <td>
                      <a href="#" data-toggle="modal" data-target="#modal-confirm"><button type="button" class="btn btn-link btn-sm btn-rounded">
                        Excluir
                      </button></a>
                    </td>
                  </tr>
                  <tr>
                    <td>
                      <p class="fw-normal mb-1">123</p>
                    </td>
                    <td>
                      <p class="fw-normal mb-1">Creme Bonito</p>
                    </td>
                    <td>
                      <p class="fw-normal mb-1">Beleza</p>
                    </td>
                    <td>
                      <p class="fw-normal mb-1">100g</p>
                    </td>
                    <td>
                      <p class="fw-normal mb-1">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. </p>
                    </td>
                    <td>
                      <a href="#" data-toggle="modal" data-target="#modal-confirm"><button type="button" class="btn btn-link btn-sm btn-rounded">
                        Excluir
                      </button></a>
                    </td>
                  </tr>
                  <tr>
                    <td>
                      <p class="fw-normal mb-1">123</p>
                    </td>
                    <td>
                      <p class="fw-normal mb-1">Creme Bonito</p>
                    </td>
                    <td>
                      <p class="fw-normal mb-1">Beleza</p>
                    </td>
                    <td>
                      <p class="fw-normal mb-1">100g</p>
                    </td>
                    <td>
                      <p class="fw-normal mb-1">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. </p>
                    </td>
                    <td>
                      <a href="#" data-toggle="modal" data-target="#modal-confirm"><button type="button" class="btn btn-link btn-sm btn-rounded">
                        Excluir
                      </button></a>
                    </td>
                  </tr>


                </tbody>
              </table>
            </div>

            <!-- Modal project -->
            <div id="modal-project" class="modal fade" role="dialog">
              <div class="modal-dialog">
                <!-- Modal content-->
                <form action="FuncionarioServlet?action=cadastroProduto" method="post">
                    <div class="modal-content">
                      <div class="modal-header login-header">
                        <h4 class="modal-title">Adicionar novo produto</h4>
                      </div>
                      <div class="modal-body">
                         
                            <select name="categoriaProduto" class="form-control" class="form-select" aria-label="Default select example">
                                <option selected>Selecione a categoria do produto</option>
                                <c:forEach var="categoria" items="${requestScope.categorias}">
                                    <option  value="<c:out value="${categoria.idCategoria}"/>"> <c:out value="${categoria.nome}"/> </options>
                                </c:forEach>
                            </select>
                          
                        <input name="nome" type="text" placeholder="Nome"  />
                        <input name="peso" type="number" placeholder="Peso" class="form-control" />
                        <input name="descricao" type="text" placeholder="Descrição" />
                      </div>
                      <div class="modal-footer">
                        <button type="button" class="cancel" data-dismiss="modal">
                          Fechar
                        </button>
                        <input type="submit" value="Salvar" class="btn btn-success btn-block"/>
                      </div>
                    </div>
                </form>   
              </div>
            </div>

            <!-- Modal confirm -->
            <div id="modal-confirm" class="modal fade" role="dialog">
              <div class="modal-dialog">
                <!-- Modal content-->
                <div class="modal-content">
                  <div class="modal-header login-header">
                    <h4 class="modal-title">Realmente deseja excluir esse produto?</h4>
                  </div>
                  <div class="modal-footer">
                    <button type="button" class="add-modal" data-dismiss="modal">
                      Sim
                    </button>
                    <button type="button" class="cancel" data-dismiss="modal">
                      Não
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