<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage = "${pageContext.request.contextPath}/erro.jsp" %>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Página de Login</title>

    <!-- CSS only -->
    <link rel="stylesheet" href="css/style.css" />
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
  
  <body id="login">
    <!-- Página de login -->

    <div class="d-flex justify-content-center align-items-center mt-5 mb-5">
      <div class="card">
        <!-- Menu de abas de login e cadastro -->

        <ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
          <li class="nav-item text-center w-50">
            <a
              class="nav-link active btl"
              id="pills-login-tab"
              data-toggle="pill"
              href="#pills-login"
              role="tab"
              aria-controls="pills-login"
              aria-selected="true"
              >Login</a
            >
          </li>
          <li class="nav-item text-center w-50">
            <a
              class="nav-link btr"
              id="pills-cadastro-tab"
              data-toggle="pill"
              href="#pills-cadastro"
              role="tab"
              aria-controls="pills-cadastro"
              aria-selected="false"
              >Cadastre-se</a
            >
          </li>
        </ul>

        <!--Conteúdo de login e cadastro -->

        <div class="tab-content" id="pills-tabContent">
          <!-- Login -->

          <div
            class="tab-pane fade show active"
            id="pills-login"
            role="tabpanel"
            aria-labelledby="pills-login-tab"
          >
            <div class="form px-4 h-auto">
              <img
                src="img/logo.png"
                class="rounded mx-auto d-block"
                height="100"
                width="85"
                alt="..."
              />
              <h3 class="text-center">BEIBE</h3>

              <p class="text-center">Digite seu email e senha para entrar</p>
              <form action="${pageContext.request.contextPath}/LoginServlet" method="post">
                <input
                  required
                  type="email"
                  name="Email"
                  class="form-control mt-4"
                  placeholder="Email"
                />

                <input
                  required
                  type="password"
                  name="Senha"
                  class="form-control"
                  placeholder="Senha"
                />
                <input
                  type="submit"
                  value="Entrar"
                  class="btn btn-success btn-block"
                />
                
                
                <c:set var="falha" value="${param.falha}" />
                <c:if test="${falha}">
                    <h5>Usuário ou Senha Inválidos</h5>
                    <br>
                </c:if>

                
                
              </form>
            </div>
          </div>

          <!-- Cadastro -->

          <div
            class="tab-pane fade"
            id="pills-cadastro"
            role="tabpanel"
            aria-labelledby="pills-cadastro-tab"
          >
            <div class="form px-4 h-auto">
              <h3 class="text-center">BEIBE</h3>
              <p class="text-center">
                Digite as informações para criar sua conta
              </p>
              <form action="${pageContext.request.contextPath}/CadastroClienteServlet" class="submit-jsp" method="post">
                <input
                  required
                  type="text"
                  name="Nome"
                  class="form-control"
                  placeholder="Nome"
                />
 
                <input
                  required
                  type="text"
                  name="Sobrenome"
                  class="form-control"
                  placeholder="Sobrenome"
                />
                
                <input
                  required
                  type="email"
                  name="Email"
                  class="form-control"
                  placeholder="Email"
                />

                <input
                  required
                  type="text"
                  name="Cpf"
                  class="form-control"
                  placeholder="CPF"
                />
                <input
                  required
                  type="text"
                  name="Cep"
                  class="form-control"
                  placeholder="CEP"
                />
                <input
                  required
                  type="text"
                  name="Rua"
                  class="form-control"
                  placeholder="Rua"
                />
                <input
                  required
                  type="number"
                  name="Numero"
                  class="form-control"
                  placeholder="Número"
                />

                <input
                  
                  type="text"
                  name="Complemento"
                  class="form-control"
                  placeholder="Complemento"
                />
                <input
                  required
                  type="text"
                  name="Bairro"
                  class="form-control"
                  placeholder="Bairro"
                />

                <input
                  required
                  type="text"
                  name="Cidade"
                  class="form-control"
                  placeholder="Cidade"
                />

                <input
                  required
                  type="text"
                  name="Estado"
                  class="form-control"
                  placeholder="Estado"
                />           


                <input
                  required
                  type="tel"
                  name="Telefone"
                  class="form-control"
                  placeholder="Telefone"
                />
                <input
                  required
                  type="password"
                  name="Senha"
                  class="form-control"
                  placeholder="Senha"
                />

                <input
                  type="submit"
                  value="Cadastrar-se"
                  class="btn btn-success btn-block"
                />
                <!-- ENVIA PARA CadastroClienteServlet -->

              </form>
            </div>
          </div>
        </div>
      </div>
    </div>

  <%@include file="footer.jsp" %>
  
  </body>
</html>
