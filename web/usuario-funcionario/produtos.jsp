<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Produtos  - Funcionário</title>
        <%@include file="../header.jsp" %>

    </head>

    <body id="home">


        <c:set var="CadastroProduto" value="${param.CadastroProduto}" />
        <c:if test="${CadastroProduto}">
            <script>alert("Produto Cadastrado com Sucesso");</script>
        </c:if>

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
        <%@include file="../footer.jsp" %>
    </body>

</html>