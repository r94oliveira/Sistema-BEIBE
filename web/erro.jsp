<%@ page isErrorPage = "true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="idade" value="23" scope="page"/> 
<c:set var="msg" value="Erro na página" scope="page"/> 
<c:set var="email@teste.com" value="configuracao.email" /> 
<!DOCTYPE html>
<html>
    <head>
        <title>Erro</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/style.css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
    <body>
    <c:if test="${!empty msg}">
        <div class="container">
            <h2>${msg}</h2>
        </div>
    </c:if>
    <div class="container">
        <div class="container">
            <p><strong style="color: red;">${pageContext.exception.message}</strong></p>
        </div>
        <div class="container">
            <p>${pageContext.out.flush()}</p>
            <p>${pageContext.exception.printStackTrace(pageContext.response.writer)}</p>
        </div>
        <div>
            <form action="${pageContext.request.contextPath}/LogoutServlet" method="post">
                <input type="submit" value="Sair" class="btn btn-primary active"/>
            </form>
        </div>
    </div>
</body>
   <div class="footer">
        Em caso de problemas contactar o administrador:
        <a href="mailto:${configuracao.email}">
        <c:out value="${configuracao.email}" /> </a>
        </div><br>
</html>




<!-- teste de comit -->