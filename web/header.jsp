<!-- Importa taglib -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage = "${pageContext.request.contextPath}/erro.jsp" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- Verifica se está logado e se não redireciona para index.jsp -->
<c:if test="${empty sessionScope.logado}">
    <c:set var= "mensagem" value="Precisa fazer o login" scope="request"/>
    <jsp:forward page="index.jsp" />
</c:if>