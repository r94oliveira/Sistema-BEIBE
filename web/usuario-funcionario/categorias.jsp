<%@include file="../header.jsp" %>
<!DOCTYPE html>
<html>

    <head>
        <title>Categorias - Funcion�rio</title> 
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

                            <!-- Bot�o para abrir modal  -->

                            <li class="pt-4">
                                <a href="#" class="add-modal" data-toggle="modal" data-target="#modal-project">Cadastrar categoria</a>
                            </li>

                            <!-- Texto T�tulo -->
                            <div class="w-100">
                                <h2 class="text-center">Categorias</h2>
                            </div>

                            <!-- tabela -->
                            <div class="table-responsive-sm w-100 py-2">
                                <table class="table align-middle mb-0 bg-white">
                                    <thead class="bg-light">
                                        <tr>
                                         
                                            <th>Nome da categoria</th>
                                            <th>Remover categoria</th>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="categoria" items="${requestScope.categorias}">
                                            <tr>

                                                <td>
                                                    <p class="fw-normal mb-1"> <c:out value="${categoria.nome}"/></p>
                                                </td>
                                                <td>
                                                    <a href="#" data-toggle="modal" data-target="#confirm-delete" data-title="Delete" data-delete ="${categoria.idCategoria}">
                                                        Excluir
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

                                       

                                        <form action="${pageContext.request.contextPath}/FuncionarioServlet?action=cadastroCategoria" method="post">
                                            <div class="modal-header login-header">
                                                <h4 class="modal-title">Adicionar nova categoria</h4>
                                            </div>
                                            <div class="modal-body">

                                                <input type="text" placeholder="Nome da categoria" name="Categoria" required="true" maxlength="255" />
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

                            <!-- Modal confirm -->
                            <div id="confirm-delete" class="modal fade" role="dialog">
                                <div class="modal-dialog">
                                    <!-- Modal content-->
                                    <div class="modal-content">
                                        <div class="modal-header login-header">
                                            <h4 class="modal-title">Realmente deseja excluir essa categoria?</h4>
                                        </div>
                                        
                                          <div class="modal-body">
                                            <p>TODOS OS ATENDIMENTOS RELACIONADOS A ESTA CATEGORIA SER�O EXCLU�DOS TAMB�M!<p>
                                        </div>
                                        
                                        <div class="modal-footer">
                                            <button type="button" class="add-modal" id="delBtn">
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