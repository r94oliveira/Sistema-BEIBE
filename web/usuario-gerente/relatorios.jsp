<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <title>Home - Gerente</title>
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

            <!-- quadros com quantidades -->

            <div class="col-md-6  py-2">
              <div class="list-group">
                <div class="list-group-item">
                  <h3 class="pull-right">
                    <i class="fa fa-bar-chart" aria-hidden="true"></i>
                  </h3>
                  <h4 class="list-group-item-heading count">
                    1000</h4>
                  <p class="list-group-item-text">
                    Atendimentos efetuados até o momento</p>
                </div>
              </div>

            </div>

            <div class="col-md-6 py-2">
              <div class="list-group">
                <div class="list-group-item">
                  <h3 class="pull-right">
                    <i class="fa fa-bar-chart" aria-hidden="true"></i>
                  </h3>
                  <h4 class="list-group-item-heading count">
                    100 | 10% </h4>
                  <p class="list-group-item-text">
                    Atendimentos em aberto </p>
                </div>
              </div>

            </div>

            <div class="col-md-3 p-2">
              <div class="list-group">
                <div class="list-group-item">
                  <p class="list-group-item-text">
                    Tipo de atedimento: Reclamação</p>
                  <h4 class="list-group-item-heading count">
                    15/100</h4>
                </div>
              </div>

            </div>

            <div class="col-md-3 p-2">
              <div class="list-group">
                <div class="list-group-item">
                  <p class="list-group-item-text">
                    Tipo de atedimento: Reclamação</p>
                  <h4 class="list-group-item-heading count">
                    15/100</h4>
                </div>
              </div>
            </div>

            <div class="col-md-3 p-2">
              <div class="list-group">
                <div class="list-group-item">
                  <p class="list-group-item-text">
                    Tipo de atedimento: Reclamação</p>
                  <h4 class="list-group-item-heading count">
                    15/100</h4>
                </div>
              </div>
            </div>
            
                        <div class="col-md-3 p-2">
              <div class="list-group">
                <div class="list-group-item">
                  <p class="list-group-item-text">
                    Tipo de atedimento: Reclamação</p>
                  <h4 class="list-group-item-heading count">
                    15/100</h4>
                </div>
              </div>
            </div>
            
            <!-- tabela -->
            <div class="table-responsive-sm w-100 py-2">
              <table class="table align-middle mb-0 bg-white">
                <thead class="bg-light">
                  <tr>
                    <th>Tipo do Relatório</th>
                    <th>Especificações para Emissão</th>
                    <th>Emitir relatório</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>
                      <p class="fw-normal mb-1">Cadastro de Funcionários</p>
                    </td>
                    <td></td>
                    <td>
                    <a href="#" data-toggle="modal" data-target="#modal-form"><button type="button" class="btn btn-link btn-sm btn-rounded">
                        Emitir
                      </button></a>
                    </td>
                  </tr>
                  <tr>
                    <td>
                      <p class="fw-normal mb-1">Produtos Mais Reclamados</p>
                    </td>
                    <td></td>
                    <td>
                    <a href="#" data-toggle="modal" data-target="#modal-form"><button type="button" class="btn btn-link btn-sm btn-rounded">
                        Emitir
                      </button></a>
                    </td>
                  </tr>
                  <tr>
                    <td>
                      <p class="fw-normal mb-1">Atendimentos em Aberto</p>
                    </td>
                    <td>
                      <div class="container">
                        <div class="row">
                          <div class="col-sm">
                            <div class="input-group mb-3">
                              <select class="custom-select" id="inputGroupSelect01">
                                <option selected>Dia</option>
                                <option value="1">01</option>
                                <option value="2">02</option>                      
                              </select>
                            </div>
                          </div>
                          <div class="col-sm">
                            <div class="input-group mb-3">
                              <select class="custom-select" id="inputGroupSelect01">
                                <option selected>Mês</option>
                                <option value="1">Janeiro</option>
                                <option value="2">Fevereiro</option>                      
                              </select>
                            </div>
                          </div>
                          <div class="col-sm">
                            <div class="input-group mb-3">
                              <select class="custom-select" id="inputGroupSelect01">
                                <option selected>Ano</option>
                                <option value="1">2022</option>
                                <option value="2">2021</option>                      
                              </select>
                            </div>
                          </div>
                  </td>
                    <td>
                    <a href="#" data-toggle="modal" data-target="#modal-form"><button type="button" class="btn btn-link btn-sm btn-rounded">
                        Emitir
                      </button></a>
                    </td>
                  </tr>
                  <tr>
                    <td>
                      <p class="fw-normal mb-1">Reclamações</p>
                    </td>
                    <td>
                      <div class="input-group mb-3">
                        
                        <select class="custom-select" id="inputGroupSelect01">
                          <option selected>Tipo</option>
                          <option value="1">Todas</option>
                          <option value="2">Em Aberto</option>                      
                        </select>
                        <span id="reclamation-span"></span>
                      </div>
                    
                    <td>
                    <a href="#" data-toggle="modal" data-target="#modal-form"><button type="button" class="btn btn-link btn-sm btn-rounded">
                        Emitir
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
                <div class="modal-content">
                  <div class="modal-header login-header">
                    <h4 class="modal-title">Relatório</h4>
                  </div>
                  <div class="modal-body">
                    Relatório...
                  </div>
                  <div class="modal-footer">
                    <button type="button" class="cancel" data-dismiss="modal">
                      Close
                    </button>
                    <button type="button" class="add-modal" data-dismiss="modal">
                      Download
                    </button>
                  </div>
                </div>
              </div>
            </div>

            <!-- Modal form -->
            <div id="modal-form" class="modal fade" role="dialog">
              <div class="modal-dialog">
                <!-- Modal content-->
                <div class="modal-content">
                  <div class="modal-header login-header">
                    <h4 class="modal-title">Add Project</h4>
                  </div>
                  <div class="modal-body">
                    <input type="text" placeholder="Project Title" name="name" />
                    <input type="text" placeholder="Post of Post" name="mail" />
                    <input type="text" placeholder="Author" name="passsword" />
                    <textarea placeholder="Description"></textarea>
                  </div>
                  <div class="modal-footer">
                    <button type="button" class="cancel" data-dismiss="modal">
                      Close
                    </button>
                    <button type="button" class="add-modal" data-dismiss="modal">
                      Save
                    </button>
                  </div>
                </div>
              </div>
            </div>

            <!-- Modal confirm -->
            <div id="modal-confirm" class="modal fade" role="dialog">
              <div class="modal-dialog">
                <!-- Modal content-->
                <div class="modal-content">
                  <div class="modal-header login-header">
                    <h4 class="modal-title">Deseja realizar essa ação?</h4>
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
     <%@include file="../footer.jsp" %>
</body>

</html>