<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>  
        <title>Meus Dados - Cliente</title> 
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
                                <h2 class="text-center">Meu Cadastro</h2>
                            </div>
                            <!-- Formulário  -->

                            <div class="form d-flex flex-row w-100">





                                <form action="${pageContext.request.contextPath}/ClienteServlet?action=alteraCadastro&idCliente=${cliente.idCliente}" method="post" class="col-12 p-0 m-0 submit-jsp">

                                    
                                    
                                    
                                    <label class="col-2">Nome:</label> <input required type="text" name="Nome" class="form-control col-9" value="${cliente.nomecliente}" maxlength="255" />

                                    <label class="col-2">Sobrenome:</label> <input required type="text" name="Sobrenome" class="form-control col-9" value="${cliente.sobrenomeCliente}" maxlength="255" />

                                    <label class="col-2">CPF:</label> <input required type="text" name="Cpf" class="form-control col-9" value="${cliente.cpfCliente}" readonly="readonly" />

                                    <label class="col-2">Email:</label> <input required type="text" name="Email" class="form-control col-9" value="${cliente.emailCliente}" readonly="readonly" />

                                    <label class="col-2">Rua:</label> <input required type="text" name="Rua" class="form-control col-9" value="${cliente.ruaEnderecoCliente}" maxlength="255" />

                                    <label class="col-2">Numero:</label> <input required type="number" name="Numero" class="form-control col-9" value="${cliente.numeroEndercoCliente}" maxlength="255" />

                                    <label class="col-2">Complemento:</label> <input type="text" name="Complemento" class="form-control col-9" value="${cliente.complementoEnderecoCliente}" maxlength="255"/>

                                    <label class="col-2">Bairro:</label> <input required type="text" name="Bairro" class="form-control col-9" value="${cliente.bairroEnderecoCliente}" maxlength="255"/>

                                    <label class="col-2">Cidade:</label> <input required type="text" name="Cidade" class="form-control col-9" value="${cliente.cidadeEnderecoCliente}" maxlength="255" />

                                    <label class="col-2">Cep:</label> <input required type="text" name="Cep" class="form-control col-9" value="${cliente.cepEnderecoCliente}" maxlength="255" />

                                    <label class="col-2">Estado:</label> <input required type="text" name="Estado" class="form-control col-9" value="${cliente.estadoEnderecoCliente}" maxlength="255" />

                                    <label class="col-2">Telefone:</label> <input required type="text" name="Telefone" class="form-control col-9" value="${cliente.telefoneCliente}" maxlength="255"/>
                                    
                                    <label class="col-2">Senha:</label> <input required type="text" name="senha" class="form-control col-9" maxlength="255"/>

                                    <div class="col-12 p-0  pt-2">
                                        
                                        <input type="submit" value="Salvar" class="btn btn-success col-3" />
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
