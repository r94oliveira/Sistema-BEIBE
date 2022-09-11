<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Funcionários - Gerente</title>
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
                                            <th>Nome</th>
                                            <th>Sobrenome</th>
                                            <th>Editar</th>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="funcionario" items ="${requestScope.listarFuncionarios}">
                                            <tr>
                                                <td>
                                                    ${funcionario.cargoFuncionario == 1 ? '<p class="fw-normal mb-1">Funcionario</p>' : '<p class="fw-normal mb-1">Gerente</p>'}
                                                </td>


                                                <td>
                                                    <p class="fw-normal mb-1"><c:out value="${funcionario.nomeFuncionario}"/></p>
                                                </td>
                                                <td>
                                                    <p class="fw-normal mb-1"><c:out value="${funcionario.sobrenomeFuncionario}"/></p>
                                                </td>

                                                <td>
                                                    <a href="#" data-toggle="modal" data-target="#modal-form-${funcionario.idFuncionario}"><button type="button" class="btn btn-link btn-sm btn-rounded">
                                                            Abrir
                                                        </button></a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>


                            <!-- Modal abrir funcionario -->


                            <c:forEach var="funcionario" items ="${requestScope.listarFuncionarios}">

                                <!-- Modal confirm -->
                                <div id="modal-form-${funcionario.idFuncionario}" class="modal fade" role="dialog">
                                    <div class="modal-dialog">
                                        <!-- Modal content-->
                                        <div class="modal-content">
                                            <div class="modal-header login-header">
                                                <h4 class="modal-title">Atualizar funcionário</h4>
                                            </div>
                                            <div class="modal-body">
                                                <div class="form d-flex flex-row w-100">

                                                    <form action="${pageContext.request.contextPath}/GerenteServlet?action=atualizarFuncionario" method="post" class="custom-control custom-checkbox mb-3">
                                                        <input required type="text" name="nome" class="form-control col-10" placeholder="Nome" value="${funcionario.nomeFuncionario}" />
                                                            <input required type="text" name="sobrenomeFuncionario" class="form-control col-10" placeholder="sobrenome" value="${funcionario.sobrenomeFuncionario}" />

                                                        <input required type="text" name="Cpf" class="form-control col-10" placeholder="CPF"  value="${funcionario.cpfFuncionario}"  />

                                                        <input required type="email" name="Email" class="form-control col-5" placeholder="E-mail" value="${funcionario.emailFuncionario}"/>

                                                        <input required type="password" name="Senha" class="form-control col-5" placeholder="Senha" value="${funcionario.senhaFuncionario}" />

                                                        <input required type="tel" name="Telefone" class="form-control col-5" placeholder="Telefone" value="${funcionario.telefoneFuncionario}"/>

                                                        <input required type="text" name="Rua" class="form-control col-5" placeholder="Rua" value="${funcionario.ruaEnderecoFuncionario}" />

                                                        <input required type="number" name="Numero" class="form-control col-5" placeholder="Numero" value="${funcionario.numeroEndercoFuncionario}"/>

                                                        <input required type="text" name="Complemento" class="form-control col-5" placeholder="Complemento" value="${funcionario.complementoEnderecoFuncionario}"/>

                                                        <input required type="text" name="Cep" class="form-control col-5" placeholder="CEP" value="${funcionario.cepEnderecoFuncionario}" />

                                                        <input required type="text" name="Bairro" class="form-control col-5" placeholder="Bairro" value="${funcionario.bairroEnderecoFuncionario}"/>
                                                        <input required type="text" name="Cidade" class="form-control col-5" placeholder="Cidade" value="${funcionario.cidadeEnderecoFuncionario}"/> 

                                                        <select required placeholder="Estado" class="form-control col-5 mb-3" name="Estado">
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
                                                                               

                                                        
                                                                                                    <div class="modal-footer">
                                                <button type="button" class="btn btn-secondary" data-dismiss="modal">
                                                    Fechar
                                                </button>
                                                                                                                                                        <button type="submit" class="btn btn-success">
                                                    Atualizar
                                                </button>
                                            </div>
                                                    </form>
                                                        
                                                </div>
                                            </div>

                                        </div>
                                    </div>
                                </div>

                            </c:forEach>





                            <!-- Modal novo funcionario -->

                            <div id="modal-project" class="modal fade" role="dialog">
                                <div class="modal-dialog">
                                    <!-- Modal content-->
                                    <div class="modal-content">
                                        <div class="modal-header login-header">
                                            <h4 class="modal-title">Novo Funcionário</h4>
                                        </div>

                                        <div class="form d-flex flex-row w-100">

                                            <form action="${pageContext.request.contextPath}/GerenteServlet?action=cadastrarFuncionario" class="custom-control custom-checkbox mb-3" method="post">
                                                <div class="modal-body">

                                                    <input required type="text" name="nome" class="form-control col-10" placeholder="Nome" />

                                                    <input required type="text" name="sobrenomeFuncionario" class="form-control col-10" placeholder="Sobrenome" />

                                                    <input required type="text" name="cpf" class="form-control col-10" placeholder="CPF"  />

                                                    <input required type="email" name="email" class="form-control col-5" placeholder="E-mail" />

                                                    <input required type="password" name="senha" class="form-control col-5" placeholder="Senha" />

                                                    <input required type="tel" name="telefone" class="form-control col-5" placeholder="Telefone" />

                                                    <input required type="text" name="rua" class="form-control col-5" placeholder="Rua" />

                                                    <input required type="number" name="numero" class="form-control col-5" placeholder="Numero" />

                                                    <input required type="text" name="complemento" class="form-control col-5" placeholder="Complemento" />

                                                    <input required type="text" name="cep" class="form-control col-5" placeholder="CEP" />

                                                    <input required type="text" name="bairro" class="form-control col-5" placeholder="Bairro" />

                                                    <input required type="text" name="estado" class="form-control col-5" placeholder="Estado" />

                                                    <input required type="text" name="cidade" class="form-control col-5" placeholder="Cidade" />

                                                    <input required type="text" name="cargo" class="form-control col-5" placeholder="Func = 1 Gerente = 2" />

                                                </div>

                                                <div class="modal-footer">
                                                    <button type="button" class="cancel" data-dismiss="modal" >
                                                        Fechar
                                                    </button>
                                                    <input type="submit" value="Salvar" class="btn btn-success btn-block"/>

                                                </div>

                                            </form>
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