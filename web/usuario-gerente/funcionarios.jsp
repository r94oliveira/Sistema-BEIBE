<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <li>
              <a href="gerente-atend.html"><i class="fa fa-tasks" aria-hidden="true"></i><span
                  class="hidden-xs hidden-sm">Atendimentos</span></a>
            </li>
            <li class="active">
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
              <p>Seja bem vindo(a) Gerente</p>
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
              <a href="#" class="add-modal" data-toggle="modal" data-target="#modal-project">Novo Funcionário</a>
            </li>

            <!-- Texto Título -->
            <div class="w-100">
              <h2 class="text-center">Lista de Funcionários</h2>
            </div>

            <!-- tabela -->
            <div class="table-responsive-sm w-100 py-2">
              <table class="table align-middle mb-0 bg-white">
                <thead class="bg-light">
                  <tr>
                    <th>Cargo</th>
                    <th>Nome Completo</th>
                    <th></th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>
                      <p class="fw-normal mb-1">Gerente</p>
                    </td>
                    <td>
                      <p class="fw-normal mb-1">John Doe</p>
                    </td>               
                    <td>
                      <a href="#" data-toggle="modal" data-target="#modal-form"><button type="button" class="btn btn-link btn-sm btn-rounded">
                        Abrir
                      </button></a>
                    </td>
                  </tr>
                  <tr>
                    <td>
                      <p class="fw-normal mb-1">Atendente</p>
                    </td>
                    <td>
                      <p class="fw-normal mb-1">John Galt</p>
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


            <!-- Modal project -->
            <div id="modal-project" class="modal fade" role="dialog">
              <div class="modal-dialog">
                <!-- Modal content-->
                <div class="modal-content">
                  <div class="modal-header login-header">
                    <h4 class="modal-title">Novo Funcionário</h4>
                  </div>
                  <div class="modal-body">
                    <div class="form d-flex flex-row w-100">

                      <form action="index.html" class="custom-control custom-checkbox mb-3">
                        <input required type="text" name="Nome" class="form-control col-10" placeholder="Nome Completo" />
        
                        <input required type="text" name="Cpf" class="form-control col-10" placeholder="CPF"  />
        
                        <input required type="email" name="Email" class="form-control col-5" placeholder="E-mail" />
        
                        <input required type="password" name="Senha" class="form-control col-5" placeholder="Senha" />
        
                        <input required type="tel" name="Telefone" class="form-control col-5" placeholder="Telefone" />
        
                        <input required type="text" name="Rua" class="form-control col-5" placeholder="Rua" />
        
                        <input required type="number" name="Numero" class="form-control col-5" placeholder="Numero" />
        
                        <input required type="text" name="Complemento" class="form-control col-5" placeholder="Complemento" />
        
                        <input required type="text" name="Cep" class="form-control col-5" placeholder="CEP" />
        
                        <input required type="text" name="Bairro" class="form-control col-5" placeholder="Bairro" />
        
                        <select required placeholder="Estado" class="form-control col-5 mb-3" name="Estado" >
                          <option value="AC">Estado</option>
                          <option value="AC">Acre</option>
                          <option value="AL">Alagoas</option>
                          <option value="AP">Amapá</option>
                          <option value="AM">Amazonas</option>
                          <option value="BA">Bahia</option>
                          <option value="CE">Ceará</option>
                          <option value="DF">Distrito Federal</option>
                          <option value="ES">Espírito Santo</option>
                          <option value="GO">Goiás</option>
                          <option value="MA">Maranhão</option>
                          <option value="MT">Mato Grosso</option>
                          <option value="MS">Mato Grosso do Sul</option>
                          <option value="MG">Minas Gerais</option>
                          <option value="PA">Pará</option>
                          <option value="PB">Paraíba</option>
                          <option value="PR">Paraná</option>
                          <option value="PE">Pernambuco</option>
                          <option value="PI">Piauí</option>
                          <option value="RJ">Rio de Janeiro</option>
                          <option value="RN">Rio Grande do Norte</option>
                          <option value="RS">Rio Grande do Sul</option>
                          <option value="RO">Rondônia</option>
                          <option value="RR">Roraima</option>
                          <option value="SC">Santa Catarina</option>
                          <option value="SP">São Paulo</option>
                          <option value="SE">Sergipe</option>
                          <option value="TO">Tocantins</option>
                          <option value="EX">Estrangeiro</option>
                        </select>        
                        <input required type="text" name="Cidade" class="form-control col-5" placeholder="Cidade" />                        
                        
                      </form>
                    </div>
                  </div>
                  <div class="modal-footer">
                    <button type="button" class="cancel" data-dismiss="modal">
                      Fechar
                    </button>
                    <button type="button" class="add-modal" data-dismiss="modal">
                      Salvar
                    </button>
                  </div>
                </div>
              </div>
            </div>

          

            <!-- Modal confirm -->
            <div id="modal-form" class="modal fade" role="dialog">
              <div class="modal-dialog">
                <!-- Modal content-->
                <div class="modal-content">
                  <div class="modal-header login-header">
                    <h4 class="modal-title">Deseja realizar essa ação?</h4>
                  </div>
                                      <div class="modal-body">
                    <div class="form d-flex flex-row w-100">

                      <form action="index.html" class="custom-control custom-checkbox mb-3">
                        <input required type="text" name="Nome" class="form-control col-10" placeholder="Nome Completo" />
        
                        <input required type="text" name="Cpf" class="form-control col-10" placeholder="CPF"  />
        
                        <input required type="email" name="Email" class="form-control col-5" placeholder="E-mail" />
        
                        <input required type="password" name="Senha" class="form-control col-5" placeholder="Senha" />
        
                        <input required type="tel" name="Telefone" class="form-control col-5" placeholder="Telefone" />
        
                        <input required type="text" name="Rua" class="form-control col-5" placeholder="Rua" />
        
                        <input required type="number" name="Numero" class="form-control col-5" placeholder="Numero" />
        
                        <input required type="text" name="Complemento" class="form-control col-5" placeholder="Complemento" />
        
                        <input required type="text" name="Cep" class="form-control col-5" placeholder="CEP" />
        
                        <input required type="text" name="Bairro" class="form-control col-5" placeholder="Bairro" />
        
                        <select required placeholder="Estado" class="form-control col-5 mb-3" name="Estado" >
                          <option value="AC">Estado</option>
                          <option value="AC">Acre</option>
                          <option value="AL">Alagoas</option>
                          <option value="AP">Amapá</option>
                          <option value="AM">Amazonas</option>
                          <option value="BA">Bahia</option>
                          <option value="CE">Ceará</option>
                          <option value="DF">Distrito Federal</option>
                          <option value="ES">Espírito Santo</option>
                          <option value="GO">Goiás</option>
                          <option value="MA">Maranhão</option>
                          <option value="MT">Mato Grosso</option>
                          <option value="MS">Mato Grosso do Sul</option>
                          <option value="MG">Minas Gerais</option>
                          <option value="PA">Pará</option>
                          <option value="PB">Paraíba</option>
                          <option value="PR">Paraná</option>
                          <option value="PE">Pernambuco</option>
                          <option value="PI">Piauí</option>
                          <option value="RJ">Rio de Janeiro</option>
                          <option value="RN">Rio Grande do Norte</option>
                          <option value="RS">Rio Grande do Sul</option>
                          <option value="RO">Rondônia</option>
                          <option value="RR">Roraima</option>
                          <option value="SC">Santa Catarina</option>
                          <option value="SP">São Paulo</option>
                          <option value="SE">Sergipe</option>
                          <option value="TO">Tocantins</option>
                          <option value="EX">Estrangeiro</option>
                        </select>        
                        <input required type="text" name="Cidade" class="form-control col-5" placeholder="Cidade" />                        
                        
                      </form>
                    </div>
                  </div>
                  <div class="modal-footer">
                    <button type="button" class="add-modal" data-dismiss="modal">
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