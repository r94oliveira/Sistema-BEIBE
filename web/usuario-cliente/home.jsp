<%@include file="../header.jsp" %>
<!DOCTYPE html>
<html>
    <head>  
        <title>Home - Cliente</title> 
        <%@include file="../head.jsp" %>
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
                            <!-- Texto Título -->
                            <div class="w-100 py-4">
                                <h2 class="text-center">Meus Atendimentos</h2>
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
                                            <th>Abrir</th>
                                            <th>Excluir</th>

                                        </tr>
                                    </thead>
                                    <tbody>                                       
                                        <c:forEach var="atendimentos" items="${requestScope.atendimentos}">
                                            <tr> 
                                                <td>
                                                    <p class="fw-normal mb-1"> <c:out value="${atendimentos.idAtendimento}"/> </p>                            
                                                </td>
                                                <td>
                                                    <p class="fw-normal mb-1"> <c:out value="${atendimentos.nomeProduto}"/> </p>
                                                </td>
                                                <td>
                                                    <p class="fw-normal mb-1"> <c:out value="${atendimentos.dataHoraAtendimento}"/> </p>
                                                </td>
                                                <td>
                                                    <p> ${atendimentos.situacao == 0 ? '<span class="badge badge-success rounded-pill d-inline">Aberto</span>' : '<span class="badge badge-secondary rounded-pill d-inline">Encerrado</span>'} </p>
                                                </td>

                                                <td>
                                                    <a href="#" data-toggle="modal" data-target="#modalAtendimento<c:out value="${atendimentos.idAtendimento}"/>"><button type="button" class="btn btn-link btn-sm btn-rounded">
                                                            Abrir
                                                        </button></a>
                                                </td>
                                                
                                                <td>
                                                    <a href="#" data-toggle="modal" data-target="#confirm-deleteAtendimento" data-title="Delete" data-delete ="${atendimentos.idAtendimento} "> ${atendimentos.situacao == 0 ? '<button type="button" class="btn btn-link btn-sm btn-rounded">Excluir</button></a>':''}
                                                </td>
                                                
                                               
                                                
                                            </tr>
                                        </c:forEach>                                          
                                    </tbody>
                                </table>
                            </div>

                            <c:forEach var="atendimentos" items="${requestScope.atendimentos}">
                                <!-- Modal form -->
                                
                               
                                <div id="modalAtendimento<c:out value="${atendimentos.idAtendimento}"/>" class="modal fade" role="dialog">
                                    <div class="modal-dialog">
                                        <!-- Modal content-->
                                        <div class="modal-content">
                                            <div class="modal-header login-header">
                                                <h4 class="modal-title">Informações Atendimento</h4>
                                            </div>
                                            <div class="modal-body">
                                                <label>Tipo de Atendimento</label>
                                                <input type="text" name="tipoAtendimento" value="<c:out value="${atendimentos.nomeTipoAtendimento}"/>" readonly="readonly" />
                                                <label>Categoria</label>
                                                <input type="text" name="categoriaAtendimento" value="<c:out value="${atendimentos.nomeCategoria}"/> " readonly="readonly" />
                                                     <label>Produto</label>
                                                <input type="text" name="produto" value="<c:out value="${atendimentos.nomeProduto}"/> " readonly="readonly" />
                                                     <label>Descrição</label>
                                               <input type="text" name="produto" value="<c:out value="${atendimentos.descricao}"/> " readonly="readonly" />
                                                  <label>Solução</label>
                                                   <input type="text" name="produto" value="<c:out value="${atendimentos.solucao}"/> " readonly="readonly" />
                                            
                                            
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="cancel" data-dismiss="modal">
                                                    Fechar
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>  
                            
 <!-- Modal confirm -->
                            <div id="confirm-deleteAtendimento" class="modal fade" role="dialog">
                                <div class="modal-dialog">
                                    <!-- Modal content-->
                                    <div class="modal-content">
                                        <div class="modal-header login-header">
                                            <h4 class="modal-title">Realmente deseja excluir esse chamado?</h4>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="add-modal" id="delBtn">
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
