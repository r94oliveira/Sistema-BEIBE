<!-- Header contendo taglib import, verificação de login, tags meta e css -->

<!-- Importa taglib -->
<%@page errorPage = "${pageContext.request.contextPath}/erro.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Verifica se está logado e se não redireciona para index.jsp -->
<c:if test="${empty sessionScope.logado}">
    <c:set var= "mensagem" value="Precisa fazer o login" scope="request"/>
    <jsp:forward page="index.jsp" />

</c:if>

<!-- meta tags -->
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<!-- CSS -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
<link
    rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
    crossorigin="anonymous"
    />
<link
    href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css"
    rel="stylesheet"
    integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1"
    crossorigin="anonymous"
    />
