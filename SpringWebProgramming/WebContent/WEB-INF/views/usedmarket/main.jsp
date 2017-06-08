<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width initial-scale=1 user-scalable=no">
        <title>Used Market</title>
        <link href="<%=application.getContextPath()%>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <script src="<%=application.getContextPath()%>/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="<%=application.getContextPath()%>/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.6/lumen/bootstrap.min.css">
        <link rel="stylesheet" href="https://daneden.github.io/animate.css/animate.min.css">

        <style>
            #user .avatar {
                width: 60px;
            }

            #user .avatar>img {
                width: 50px;
                height: 50px;
                border-radius: 10%;
            }
            /*Card*/

            #user .panel-thumb {
                margin: 5px auto;
                text-align: center;
            }

            #user .panel-thumb .avatar-card {
                text-align: center;
                height: 200px;
                margin: auto;
                overflow: hidden;
            }

            #user .panel-thumb .avatar-card>img {
                max-width: 200px;
                max-height: 200px;
            }
            /* table*/

            #user .panel-table {
                animation-duration: 3s;
            }

            #user .panel-table .panel-body .table {
                margin: 0px;
            }

            #user .panel-table .panel-body {
                padding: 0px;
            }

            #user .panel-table .panel-body .table-bordered>thead>tr>th {
                text-align: center;
            }

            #user .panel-table .panel-footer {
                height: 60px;
                padding: 0px;
            }

            .panel-title {
                font-size: 25px;
                padding-top: 7px;
            }

            #tr {
                text-align: center;
            }
        </style>

    </head>

    <body>
        <div class="container" style="margin-top: 20px;">
            <div class="row">
                <div id="user" class="col-md-12">
                    <div class="panel panel-primary panel-table animated slideInDown">
                        <div class="panel-heading " style="padding: 5px;">
                            <div class="row">
                                <div class="col col-xs-4 text-left"></div>
                                <div class="col col-xs-4 text-center">
                                    <h1 class="panel-title">Used Market</h1>
                                </div>
                                <div class="col col-xs-2 text-right ">
                                    <a href="write" class="btn btn-success ">
                                        ADD NEW <i class="fa fa-plus-square"></i>
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div class="panel-body">
                            <table class="table table-striped table-bordered table-list">

                                <thead>
                                    <tr>
                                        <th>번호</th>
                                        <th>제목</th>
                                        <th>글쓴이</th>
                                        <th>날짜</th>
                                        <th>조회수</th>
                                    </tr>
                                </thead>

                                <tbody>
                                    <c:forEach var="b" items="${list}">
                                        <tr id="tr">
                                            <td>${b.bno}</td>
                                            <td><a href="detail?bno=${b.bno}">${b.btitle}</a></td>
                                            <td>${b.bwriter}</td>
                                            <td>${b.bdate}</td>
                                            <td>${b.bhitcount}</td>
                                        </tr>
                                    </c:forEach>

                                </tbody>
                            </table>
                            <!-- END id="list" -->

                            <!-- END tab-content -->
                        </div>

                        <div class="panel-footer text-center">
                            <ul class="pagination">
                                <li><a href="main?pageNo=1">«</a></li>

                                <c:if test="${groupNo>1}">
                                    <li><a href="main?pageNo=${startPageNo-1}">이전</a></li>
                                    </c:if>

                                <c:forEach var="i" begin="${startPageNo}" end="${endPageNo}">
                                    &nbsp;
                                    <li class="active"><a href="main?pageNo=${i}" <c:if test="${pageNo==i}"> style="font-weight:bold; color:red;" </c:if>>${i}</a></li>
                                        &nbsp;
                                </c:forEach>

                                <c:if test="${groupNo<totalGroupNo}">
                                    <li><a href="main?pageNo=${endPageNo+1}">[다음]</a></li>
                                    </c:if>

                                <li><a href="main?pageNo=${totalPageNo}">»</a></li>


                            </ul>
                        </div>

                        <footer style="padding: 5px 0px 5px 0px; text-align: center;">&copy; 2017 by Sunggeun.Jang &middot;
                            <a href="mailto:busk0821@gmail.com">busk0821@gmail.com</a></footer>

                    </div>
                    <!--END panel-table-->
                </div>
            </div>
        </div>
    </body>

</html>