<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <title>Home - Gerente</title>
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
                    Atendimentos efetuados até o momento</p>
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
                    Tipo de atedimento: Reclamação</p>
                  <h4 class="list-group-item-heading count">
                    ${requestScope.todasReclamacoesEmAberto}/${requestScope.todasReclamacoes}</h4>
                </div>
              </div>

            </div>

            <div class="col-md-3 p-2">
              <div class="list-group">
                <div class="list-group-item">
                  <p class="list-group-item-text">
                    Tipo de atedimento: Informação</p>
                  <h4 class="list-group-item-heading count">
                     ${requestScope.todasInformacoesEmAberto}/${requestScope.todasInformacoes}</h4>
                </div>
              </div>
            </div>

            <div class="col-md-3 p-2">
              <div class="list-group">
                <div class="list-group-item">
                  <p class="list-group-item-text">
                    Tipo de atedimento: Sugestão</p>
                  <h4 class="list-group-item-heading count">
                     ${requestScope.todasSugestoesEmAberto}/${requestScope.todasSugestoes}</h4>
                </div>
              </div>
            </div>
                
                
                 <div class="col-md-3 p-2">
              <div class="list-group">
                <div class="list-group-item">
                  <p class="list-group-item-text">
                    Tipo de atedimento: Elogio</p>
                  <h4 class="list-group-item-heading count">
                     ${requestScope.todasElogioEmAberto}/${requestScope.todosElogio}</h4>
                </div>
              </div>
            </div>
                
                
            
               
            

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
                                            <form action="FuncionarioServlet?action=resolver&idAtendimento=${atendimentos.idAtendimento}" method="post" required="true">
                                            <div class="modal-body">
                                                
                                               
                                                <label>Tipo de Atendimento</label>
                                                <input type="text" name="nomeTipoAtendimento" value="<c:out value="${atendimentos.nomeTipoAtendimento}"/>" readonly="readonly" />
                                                <label>Categoria</label>
                                                <input type="text" name="nomeAtendimento" value="<c:out value="${atendimentos.nomeCategoria}"/> " readonly="readonly" />
                                                     <label>Produto</label>
                                                <input type="text" name="nomeProduto" value="<c:out value="${atendimentos.nomeProduto}"/> " readonly="readonly" />
                                                     <label>Descrição</label>
                                               <input type="text" name="descricao" value="<c:out value="${atendimentos.descricao}"/> " readonly="readonly" />
                                                  <label>Solução</label>
                                                  <input name="solucao" type="text" placeholder="Solução" readonly="readonly" maxlength="255" value="<c:out value="${atendimentos.solucao}"/>"/>
                                                  
                                                
                                            
                                            </div>
                                                   
                                              
                                            <div class="modal-footer">
                                                <button type="button" class="cancel" data-dismiss="modal">
                                                    Cancelar
                                                </button>
                                                
                                                   
                                                
                                                
                                            </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach> 

















            <!-- FIM DE CONTEÚDO  -->
          </div>
        </div>
      </div>
    </div>
  </div>
     <%@include file="../footer.jsp" %>
</body>

</html>