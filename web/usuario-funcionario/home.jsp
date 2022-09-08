<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>

        <title>Home - Funcionário</title>
        <%@include file="../header.jsp" %>
    </head>
    <body id="home">

        <!-- Página da home -->

        <c:set var="CadastroCategoria" value="${param.CadastroCategoria}" />
        <c:if test="${CadastroCategoria}">
            <script>alert("Categoria Cadastrada com Sucesso");</script>
        </c:if>


        <div class="container-fluid display-table">
            <div class="row display-table-row">

                <%@include file="menu-lateral.jsp" %>

                <div class="col-md-10 col-sm-11 display-table-cell v-align">
                    <%@include file="../menu-topo.jsp" %>

                    <div class="user-dashboard">
                        <div class="row">
                            <!-- INICIO DE CONTEÚDO  -->



                            <!-- Texto Título -->
                            <div class="w-100">
                                <h2 class="text-center">Atendimentos em Aberto</h2>
                            </div>

                            <!-- tabela -->
                            <div class="table-responsive-sm w-100 py-2">
                                <table class="table align-middle mb-0 bg-white">
                                    <thead class="bg-light">
                                        <tr>
                                            <th>ID</th>
                                            <th>Produto</th>
                                            <th>Abertura</th>
                                            <th>Status</th>
                                            <th>Resolver</th>
                                         

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="atendimentos" items="${requestScope.atendimentos}">
                                            <tr> 
                                                <td>
                                                    <p class="fw-normal mb-1"> <c:out value="${atendimentos.idAtendimento}"/> </p>                            
                                                </td>
                                                <td>
                                                    <p class="fw-normal mb-1"> <c:out value="${atendimentos.idProduto}"/> </p>
                                                </td>
                                                <td>
                                                    <p class="fw-normal mb-1"> <c:out value="${atendimentos.dataHoraAtendimento}"/> </p>
                                                </td>
                                                <td>
                                                    <p> ${atendimentos.situacao == 0 ? '<span class="badge badge-success rounded-pill d-inline">Aberto</span>' : '<span class="badge badge-secondary rounded-pill d-inline">Encerrado</span>'} </p>
                                                </td>

                                                <td>
                                                    <a href="#" data-toggle="modal" data-target="#modal-form"><button type="button" class="btn btn-link btn-sm btn-rounded">
                                                           Resolver
                                                        </button></a>
                                                </td>
                                            </tr>
                                        </c:forEach>                    
                                    </tbody>
                                </table>
                            </div>

                            <!-- Modal project -->
                            <div id="modal-project" class="modal fade" role="dialog">
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
                                            <textarea placeholder="Desicrption"></textarea>
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

                            <!-- Modal form -->
                            <div id="modal-form" class="modal fade" role="dialog">
                                <div class="modal-dialog">
                                    <!-- Modal content-->
                                    <div class="modal-content">
                                        <div class="modal-header login-header">
                                            <h4 class="modal-title">Editar atendimento</h4>
                                        </div>
                                        <div class="modal-body">
                                            <input type="text" placeholder="Project Title" name="name" />
                                            <input type="text" placeholder="Post of Post" name="mail" />
                                            <input type="text" placeholder="Author" name="passsword" />
                                            <textarea placeholder="Description"></textarea>
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
                            <div id="modal-confirm" class="modal fade" role="dialog">
                                <div class="modal-dialog">
                                    <!-- Modal content-->
                                    <div class="modal-content">
                                        <div class="modal-header login-header">
                                            <h4 class="modal-title">Realmente deseja resolver esse atendimento?</h4>
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