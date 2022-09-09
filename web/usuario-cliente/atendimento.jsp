<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>  
        <title>Novo atendimento - Cliente</title> 
        <meta charset="UTF-8">
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
                            <!-- Texto Título -->
                            <div class="w-100 py-4">
                                <h2 class="text-center">Novo Atedimento</h2>
                            </div>

                            <!-- Formulário  -->

                            <div class="form d-flex flex-row w-100">

                                <form action="ClienteServlet?action=novoAtendimento" method="post" class="col-12 p-0 m-0">

                                    <select name="tipoAtendimento" class="form-control col-10 mb-3 p-2" class="form-select" aria-label="Default select example" required="true">
                                        <option selected value="">Selecione o tipo de atendimento</option>
                                        <c:forEach var="tipoAtendimentos" items="${requestScope.tipoAtendimentos}">
                                            <option  value="<c:out value="${tipoAtendimentos.idTipo}"/>"> <c:out value="${tipoAtendimentos.nome}"/> </options>
                                        </c:forEach>
                                    </select>
                                    <select name="produto" class="form-control col-10 mb-3 p-2" class="form-select" aria-label="Default select example" required="true">
                                        <option selected value="">Selecione o nome do produto</option>
                                        <c:forEach var="produtos" items="${requestScope.produtos}">
                                            <option  value="<c:out value="${produtos.idProduto}"/>"> <c:out value="${produtos.nome}"/> </options>
                                        </c:forEach>
                                    </select>
                                    <textarea name="descricao"  class="form-control col-10 pb-4"  placeholder="Descrição" required="true" maxlength="255"></textarea>
                                    <div class="col-12 p-0 pt-2">
                                        <input type="submit" value="Cancelar" class="btn btn-secondary col-3" />
                                        <input type="submit" value="Criar" class="btn btn-success col-3" />

                                    </div>
                                </form>
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

