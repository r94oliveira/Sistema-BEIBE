<%@include file="../header.jsp" %>
<!DOCTYPE html>
<html>

    <head>
        <title>Produtos  - Funcion�rio</title>
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
                                <a href="#" class="add-modal" data-toggle="modal" data-target="#modal-project">Cadastrar produto</a>
                            </li>

                            <!-- Texto T�tulo -->
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
                                            <th>Descri��o</th>
                                            <th>Remover produto</th>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="produtos" items="${requestScope.produtos}">
                                            <tr> 
                                                <td>
                                                    <p class="fw-normal mb-1"> <c:out value="${produtos.idProduto}"/> </p>                            
                                                </td>
                                                <td>
                                                    <p class="fw-normal mb-1"> <c:out value="${produtos.nome}"/> </p>
                                                </td>
                                                <td>
                                                    <p class="fw-normal mb-1"> <c:out value="${produtos.categoria}"/> </p>
                                                </td>                                                
                                                <td>
                                                    <p class="fw-normal mb-1"> <c:out value="${produtos.peso}"/> </p>
                                                </td>                                                
                                                <td>
                                                    <p class="fw-normal mb-1"> <c:out value="${produtos.descricao}"/> </p>
                                                </td>                                                
                                                <td>
                                                    <a href="#" data-toggle="modal" data-target="#confirm-deleteProduto" data-title="Delete" data-delete ="${produtos.idProduto}">
                                                        Excluir
                                                        </a>
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
                                    <form action="${pageContext.request.contextPath}/FuncionarioServlet?action=cadastroProduto" method="post">
                                        <div class="modal-content">
                                            <div class="modal-header login-header">
                                                <h4 class="modal-title">Adicionar novo produto</h4>
                                            </div>
                                            <div class="modal-body">

                                                <select name="categoriaProduto" class="form-control" class="form-select" aria-label="Default select example" required = "true">
                                                    <option selected value="">Selecione a categoria do produto</option>
                                                    <c:forEach var="categoria" items="${requestScope.categorias}">
                                                        <option  value="<c:out value="${categoria.idCategoria}"/>"> <c:out value="${categoria.nome}"/> </options>
                                                        </c:forEach>
                                                </select>

                                                <input name="nome" type="text" placeholder="Nome" required="true" maxlength="255" />
                                                <input name="peso" type="number" placeholder="Peso" class="form-control" required="true"/>
                                                <input name="descricao" type="text" placeholder="Descri��o" required="true" maxlength="255" />
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
                                <div id="confirm-deleteProduto" class="modal fade" role="dialog">
                                <div class="modal-dialog">
                                    <!-- Modal content-->
                                    <div class="modal-content">
                                        <div class="modal-header login-header">
                                            <h4 class="modal-title">Realmente deseja excluir esse Produto? </h4>
                                            
                                        </div>
                                        <div class="modal-body">
                                            <p>TODOS OS ATENDIMENTOS RELACIONADOS A ELE SER�O EXCLU�DOS TAMB�M!<p>
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