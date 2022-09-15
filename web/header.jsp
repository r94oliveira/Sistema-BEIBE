<!-- Importa taglib -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage = "${pageContext.request.contextPath}/erro.jsp" %>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!-- Verifica se est� logado e se n�o redireciona para index.jsp -->
<c:if test="${empty sessionScope.logado}">
    <c:set var= "mensagem" value="Precisa fazer o login" scope="request"/>
    <jsp:forward page="index.jsp" />
</c:if>