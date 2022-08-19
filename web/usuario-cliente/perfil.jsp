<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Home Page - Cliente</title>

    <!-- CSS only -->
    <link rel="stylesheet" href="../css/style.css" />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
      crossorigin="anonymous"
    />
    <link
    href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css"
    rel="stylesheet"
    integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1"
    crossorigin="anonymous"
  />
  </head>

  <body id="home">

    <!-- Página da home -->
    <div class="container-fluid display-table">
      <div class="row display-table-row">
        <!-- Menu lateral  -->
        <div
          class="col-md-2 col-sm-1 hidden-xs display-table-cell v-align box"
          id="navigation"
        >
          <div class="logo">
            <h3 class="m-4">BEIBE</h3>
          </div>
          <div>
            <ul class="navi">
              <li>
                <a href="client-home.html"
                  ><i class="fa fa-tasks" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Meus atendimentos</span></a
                >
              </li>
              <li>
                <a href="client-atend.html"
                  ><i class="fa fa-ticket" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Novo atendimento</span></a
                >
              </li>
              <li  class="active">
                <a href="client-perfil.html"
                  ><i class="fa fa-user" aria-hidden="true"></i
                  ><span class="hidden-xs hidden-sm">Meu cadastro</span></a
                >
              </li>
            </ul>
          </div>
        </div>
        <div class="col-md-10 col-sm-11 display-table-cell v-align">
          <!-- Header  -->
          <div class="row">
            <header class="d-flex flex-row">
              <div class="p-2 col-9 text-left">
                <p>Seja bem vindo(a) Usuário</p>
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
                <h2 class="text-center">Meu Cadastro</h2>
              </div>
            <!-- Formulário  -->

            <div class="form d-flex flex-row w-100">

              <form action="index.html" class="col-12 p-0 m-0">
                <input required type="text" name="Nome" class="form-control col-10" placeholder="Nome Completo" />

                <input required type="text" name="Cpf" class="form-control col-10" value="CPF" readonly="readonly" />

                <input required type="text" name="Email" class="form-control col-5" value="Email" readonly="readonly" />

                <input required type="password" name="Senha" class="form-control col-5" placeholder="Senha" />

                <input required type="number" name="Telefone" class="form-control col-5" placeholder="Telefone" />

                <input required type="text" name="Rua" class="form-control col-5" placeholder="Rua" />

                <input required type="number" name="Numero" class="form-control col-5" placeholder="Numero" />

                <input required type="text" name="Complemento" class="form-control col-5" placeholder="Complemento" />

                <input required type="number" name="Cep" class="form-control col-5" placeholder="CEP" />

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
                
                <div class="col-12 p-0  pt-2">
                  <input type="submit" value="Cancelar" class="btn btn-secondary col-3" />
                  <input type="submit" value="Salvar" class="btn btn-success col-3" />
                </div>
              </form>
            </div>

 
              <!-- FIM DE CONTEÚDO  -->
            </div>
          </div>
        </div>
      </div>
    </div>


    <!-- JS only -->

    <script src="js/main.js"></script>
    <script
      src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
      integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
      integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
      integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
      crossorigin="anonymous"
    ></script>
  </body>
</html>