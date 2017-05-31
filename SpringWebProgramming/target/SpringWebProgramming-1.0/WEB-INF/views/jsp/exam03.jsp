<%--
[지시자]
1. 작성: <%@ ... %>
2. 종류
<%@page ... %> 
<%@include ... %>
<%@taglib ... %> : JSP에서 추가적으로 사용할 수 있는 커스텀 태그 로딩
--%>
<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
        <title>JSP Page</title>
        <link href="/WebApplication/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="/WebApplication/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="/WebApplication/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
        <script></script>
    </head>
    <body>
        <h3>JSTL(Java Standard Tag Library) 사용하기</h3>
        <%for (int i = 1; i <= 5; i++) {%>
        <img src="/WebApplication/resources/image/member0<%=i%>.png" width="50px" height="50px"/>
        <%}%>

        <c:forEach begin="1" end="5" step="1" varStatus="status">
            <img src="/WebApplication/resources/image/member0${status.count}.png" width="50px" height="50px"/>
        </c:forEach>
    </body>
</html>
