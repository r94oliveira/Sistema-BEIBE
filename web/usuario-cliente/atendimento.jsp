<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>  
        <title>Novo atendimento - Cliente</title> 
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

                                <form action="client-atend.html" class="col-12 p-0 m-0">

                                    <select name="tipoAtendimento" class="form-control col-10 mb-3 p-2" class="form-select" aria-label="Default select example">
                                        <option selected>Selecione o tipo de atendimento</option>
                                        <option value="reclamacao">Reclamação</option>
                                        <option value="problema">Problema</option>
                                        <option value="sugestao">Sugestão</option>
                                        <option value="critica">Critica</option>
                                    </select>
                                    <select nome="categoriaProduto" class="form-control col-10 mb-3 p-2" class="form-select" aria-label="Default select example">
                                        <option selected>Selecione a categoria do produto</option>
                                        <option value="categoria1">Categoria 1</option>
                                        <option value="categoria2">Categoria 2</option>
                                        <option value="categoria3">Categoria 3</option>
                                    </select>
                                    <select name="produto" class="form-control col-10 mb-3 p-2" class="form-select" aria-label="Default select example">
                                        <option selected>Selecione o nome do produto</option>
                                        <option value="categoria1">Produto 1</option>
                                        <option value="categoria2">Produto 2</option>
                                        <option value="categoria3">Produto 3</option>
                                    </select>
                                    <textarea name="descricao"  class="form-control col-10 pb-4"  placeholder="Descrição"></textarea>
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

