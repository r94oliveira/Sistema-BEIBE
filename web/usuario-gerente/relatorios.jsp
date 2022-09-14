<%@include file="../header.jsp" %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <title>Home - Gerente</title>
        <%@include file="../head.jsp" %>
    </head>

    <body id="home">

        <!-- P�gina da home -->
        <div class="container-fluid display-table">
            <div class="row display-table-row">
                <%@include file="menu-lateral.jsp" %>
                <div class="col-md-10 col-sm-11 display-table-cell v-align">
                    <%@include file="../menu-topo.jsp" %>

                    <div class="user-dashboard">
                        <div class="row">
                            <!-- INICIO DE CONTE�DO  -->

                            <!-- quadros com quantidades -->

                            <div class="col-md-6  py-2">
                                <div class="list-group">
                                    <div class="list-group-item">
                                        <h3 class="pull-right">
                                            <i class="fa fa-bar-chart" aria-hidden="true"></i>
                                        </h3>
                                        <h4 class="list-group-item-heading count">
                                            ${requestScope.todosAtendimentos}</h4>
                                        <p class="list-group-item-text">
                                            Atendimentos efetuados at� o momento</p>
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
                                            ${requestScope.todosAtendimentosEmAberto} | ${requestScope.percentual} %</h4>
                                        <p class="list-group-item-text">
                                            Atendimentos em aberto </p>
                                    </div>
                                </div>

                            </div>

                            <div class="col-md-3 p-2">
                                <div class="list-group">
                                    <div class="list-group-item">
                                        <p class="list-group-item-text">
                                            Tipo de atedimento: <br>Reclama��o</p>
                                        <h4 class="list-group-item-heading count">
                                            ${requestScope.todasReclamacoesEmAberto}/${requestScope.todasReclamacoes}</h4>
                                    </div>
                                </div>

                            </div>

                            <div class="col-md-3 p-2">
                                <div class="list-group">
                                    <div class="list-group-item">
                                        <p class="list-group-item-text">
                                            Tipo de atedimento: <br>Informa��o</p>
                                        <h4 class="list-group-item-heading count">
                                            ${requestScope.todasInformacoesEmAberto}/${requestScope.todasInformacoes}</h4>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 p-2">
                                <div class="list-group">
                                    <div class="list-group-item">
                                        <p class="list-group-item-text">
                                            Tipo de atedimento: <br>Sugest�o</p>
                                        <h4 class="list-group-item-heading count">
                                            ${requestScope.todasSugestoesEmAberto}/${requestScope.todasSugestoes}</h4>
                                    </div>
                                </div>
                            </div>







                            <div class="col-md-3 p-2">
                                <div class="list-group">
                                    <div class="list-group-item">
                                        <p class="list-group-item-text">
                                            Tipo de atedimento: <br>Elogio</p>
                                        <h4 class="list-group-item-heading count">
                                            ${requestScope.todasElogioEmAberto}/${requestScope.todosElogio}</h4>
                                    </div>
                                </div>
                            </div>

                            <!-- tabela -->
                            <div class="table-responsive-sm w-100 py-2">
                                <table class="table align-middle mb-0 bg-white">
                                    <thead class="bg-light">
                                        <tr>
                                            <th>Tipo do Relat�rio</th>
                                            <th>Especifica��es para Emiss�o</th>
                                            <th>Emitir relat�rio</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>
                                                <p class="fw-normal mb-1">Cadastro de Funcion�rios</p>
                                            </td>
                                            <td>

                                            </td>
                                            <td>
                                                <a href="${pageContext.request.contextPath}/GeradorRelatorioServlet?action=listaFuncionarios"><button type="button" class="btn btn-link btn-sm btn-rounded">
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
                                                <a href="${pageContext.request.contextPath}/GeradorRelatorioServlet?action=listarTopReclamacao"><button type="button" class="btn btn-link btn-sm btn-rounded">
                                                        Emitir
                                                    </button></a>
                                            </td>
                                        </tr>
                                        <tr>
                                    <form action="${pageContext.request.contextPath}/GeradorRelatorioServlet?action=atendimentoData" method="post">
                                        <td>
                                            <p class="fw-normal mb-1">Atendimentos em Aberto</p>
                                        </td>
                                        <td>
                                            <label>Inicial</label> <input type="date" id="data-atendimento1" name="dataAtendimento1">

                                            <label>Final</label> <input type="date" id="data-atendimento2" name="dataAtendimento2">
                                        </td>
                                        <td>
                                            <button type="submit" class="btn btn-link btn-sm btn-rounded">
                                                Emitir
                                            </button></a>
                                        </td>
                                    </form>
                                    </tr>
                                    <tr>
                                    <form action="${pageContext.request.contextPath}/GeradorRelatorioServlet?action=reclamacaoSelect" method="post">
                                        <td>
                                            <p class="fw-normal mb-1">Reclama��es</p>
                                        </td>
                                        <td>
                                            <div class="input-group mb-3">

                                                <select class="custom-select" id="ReclamacaoSelect" name="ReclamacaoSelect" required>

                                                    <option value="1">Todas</option>
                                                    <option value="2">Em Aberto</option>
                                                    <option value="3">Fechados</option>
                                                </select>
                                            </div>
                                        </td>
                                        <td>
                                            <button type="submit" class="btn btn-link btn-sm btn-rounded">
                                                Emitir
                                            </button>
                                        </td>

                                    </form>
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
                                            <h4 class="modal-title">Relat�rio</h4>
                                        </div>
                                        <div class="modal-body">
                                            Relat�rio...
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
                                            <h4 class="modal-title">Deseja realizar essa a��o?</h4>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="add-modal" data-dismiss="modal">
                                                Sim
                                            </button>
                                            <button type="button" class="cancel" data-dismiss="modal">
                                                N�o
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>


                            <!-- FIM DE CONTE�DO  -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="../footer.jsp" %>
    </body>

</html>