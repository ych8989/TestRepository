<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=no">
        <title>JSP Page</title>
        <link href="/WebApplication/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="/WebApplication/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="/WebApplication/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
    </head>

    <body>
        WebApplication Home
        <hr/>
        <h4>HTML 태그</h4>
        <a href="html/exam01"class="btn btn-warning">exam01</a>
        <a href="html/exam02"class="btn btn-warning">exam02</a>
        <a href="html/exam03"class="btn btn-warning">exam03</a>

        <h4>CSS</h4>
        <a href="css/exam01"class="btn btn-success">exam01</a>
        <a href="css/exam02"class="btn btn-success">exam02</a>
        <a href="css/exam03"class="btn btn-success">exam03</a>

        <h4>JavaScript</h4>
        <%for (int i = 1; i <= 11; i++) {
                String exam = "exam";
                if (i < 10) {
                    exam += "0" + i;
                } else {
                    exam += String.valueOf(i);
                }%>
        <a href="javascript/<%=exam%>"><%=exam%></a>
        <%}%>

        <h4>Jquery</h4>
        <%for (int i = 1; i <= 4; i++) {
                String exam = "exam";
                if (i < 10) {
                    exam += "0" + i;
                } else {
                    exam += String.valueOf(i);
                }%>
        <a href="jquery/<%=exam%>"><%=exam%></a>
        <%}%>

        <h4>Bootstrap</h4>
        <%for (int i = 1; i <= 3; i++) {
                String exam = "exam";
                if (i < 10) {
                    exam += "0" + i;
                } else {
                    exam += String.valueOf(i);
                }%>
        <a href="bootstrap/<%=exam%>"><%=exam%></a>
        <%}%>	

        <h4>JSP</h4>
        <%for (int i = 1; i <= 5; i++) {
                String exam = "exam";
                exam += "0" + i;
        %>
        <a href="JSP/<%=exam%>"class="btn btn-primary"><%=exam%></a>
        <%}%>
        <h4>HTTP 요청 방식</h4>
        GET방식:<a href="http/exam01"class="btn btn-primary">exam01</a>
        POST방식:
        <form method="post" action="http/exam01"style="display:inline">
            <input type="submit" value="exam01"class="btn btn-primary"/>
        </form>
        <h4>요청 HTTP 정보 얻기</h4>
        <a href="http/exam02?type=freeboard&bno=5&hobby=baseball&hobby=soccer"class="btn btn-primary">exam02</a>
        <a href="http/exam03?type=freeboard&bno=5&hobby=baseball&hobby=soccer"class="btn btn-primary">exam03</a>
    </body>
</html>

