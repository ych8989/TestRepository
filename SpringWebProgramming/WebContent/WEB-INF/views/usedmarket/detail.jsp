<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
        <title>Used Market</title>
        <link href="<%=application.getContextPath()%>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">
        <script src="<%=application.getContextPath()%>/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="<%=application.getContextPath()%>/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.6/lumen/bootstrap.min.css">
        <link rel="stylesheet" href="https://daneden.github.io/animate.css/animate.min.css">


        <script type="text/javascript">
            function handleBtnUpdate() {
                var bpassword = $("#bpassword").val();
                if (bpassword == "") {
                    $("#bpassword").attr("placeholder", "비밀번호를 입력하셔야 합니다.");
                    $("#bpassword").attr("style", "border-color : red");
                    return;
                }
                $.ajax({
                    url: "checkBpassword",
                    method: "post",
                    // data: "bno=${board.bno}&bpassword" + bpassword
                    data: {
                        "bno": "${board.bno}",
                        "bpassword": bpassword
                    },
                    success: function (data) {
                        console.log(data.result);
                        if (data.result == "success") {
                            location.href = "update?bno=${board.bno}"
                            console.log("success");

                        } else {
                            $("#bpassword").val("");
                            $("#bpassword").attr("placeholder", "비밀번호가 다릅니다.");
                            $("#bpassword").attr("style", "border-color : red");
                        }
                    }
                });
            }

            function handleBtnDelete() {
                var bpassword = $("#bpassword").val();
                if (bpassword == "") {
                    $("#bpassword").attr("placeholder", "비밀번호를 입력하셔야 합니다.");
                    $("#bpassword").attr("style", "border-color : red");
                    return;
                }
                $.ajax({
                    url: "checkBpassword",
                    method: "post",
                    data: "bno=${board.bno}&bpassword=" + bpassword,
                    // data: {"bno":"${board.bno}", "bpassword":bpassword},
                    success: function (data) {
                        console.log(data.result);
                        if (data.result == "success") {
                            location.href = "delete?bno=${board.bno}"
                            console.log("success");

                        } else {
                            $("#bpassword").val("");
                            $("#bpassword").attr("placeholder", "비밀번호가 다릅니다.");
                            $("#bpassword").attr("style", "border-color : red");
                        }
                    }
                });
            }
        </script>
        <style>
            #bimage {
                width: 150px;
                height: 150px;
            }
            /*********************************************
                        Call Bootstrap
                                *********************************************/

            @import url("bootstrap/bootstrap.min.css");
            @import url("bootstrap-override.css");
            @import url("//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css");
            /*********************************************
                        Theme Elements
                                *********************************************/

            .gold {
                color: #FFBF00;
            }
            /*********************************************
                                PRODUCTS
                                *********************************************/

            .product {
                border: 1px solid #dddddd;
                height: 321px;
            }

            .product>img {
                max-width: 230px;
            }

            .product-rating {
                font-size: 20px;
                margin-bottom: 25px;
            }

            .product-title {
                font-size: 20px;
            }

            .product-desc {
                font-size: 14px;
            }

            .product-price {
                font-size: 22px;
            }

            .product-stock {
                color: #74DF00;
                font-size: 20px;
                margin-top: 10px;
            }

            .product-info {
                margin-top: 50px;
            }
            /*********************************************
                                VIEW
                                *********************************************/

            .content-wrapper {
                max-width: 1140px;
                background: #fff;
                margin: 0 auto;
                margin-top: 25px;
                margin-bottom: 10px;
                border: 0px;
                border-radius: 0px;
            }

            .container-fluid {
                max-width: 1140px;
                margin: 0 auto;
            }

            .view-wrapper {
                float: right;
                max-width: 70%;
                margin-top: 25px;
            }

            .container {
                padding-left: 0px;
                padding-right: 0px;
                max-width: 100%;
            }
            /*********************************************
                                ITEM 
                                *********************************************/

            .service1-items {
                padding: 0px 0 0px 0;
                float: left;
                position: relative;
                overflow: hidden;
                max-width: 100%;
                height: 321px;
                width: 130px;
            }

            .service1-item {
                height: 107px;
                width: 120px;
                display: block;
                float: left;
                position: relative;
                padding-right: 20px;
                border-right: 1px solid #DDD;
                border-top: 1px solid #DDD;
                border-bottom: 1px solid #DDD;
            }

            .service1-item>img {
                max-height: 110px;
                max-width: 110px;
                opacity: 0.6;
                transition: all .2s ease-in;
                -o-transition: all .2s ease-in;
                -moz-transition: all .2s ease-in;
                -webkit-transition: all .2s ease-in;
            }

            .service1-item>img:hover {
                cursor: pointer;
                opacity: 1;
            }

            .service-image-left {
                padding-right: 50px;
            }

            .service-image-right {
                padding-left: 50px;
            }

            .service-image-left>center>img,
            .service-image-right>center>img {
                max-height: 155px;
            }

            #h4 {
                font-size: 25px;
            }

            .container product-info {
                font-size: 13px;
            }
        </style>

    </head>

    <body>
        <div class="panel panel-primary panel-table animated slideInDown">
            <form method="post" style="padding: 0px 20px" enctype="multipart/form-data">
                <h2 align="center">Detail</h2>
                <div class="container-fluid">
                    <div class="content-wrapper">
                        <div class="item-container">
                            <div class="container">
                                <div class="col-md-12">
                                    <div class="product col-md-3 service-image-left">

                                        <img id="item-display" src="../usedmarket/file/download" alt=""></img>
                                    </div>

                                    <div class="container service1-items col-sm-2 col-md-2 pull-left">
                                        <a id="item-1" class="service1-item">
                                            <img src="../usedmarket/file/download" alt=""></img>
                                        </a>
                                        <a id="item-2" class="service1-item">
                                            <img src="../usedmarket/file/download" alt=""></img>
                                        </a>
                                        <a id="item-3" class="service1-item">
                                            <img src="../usedmarket/file/download" alt=""></img>
                                        </a>
                                    </div>
                                    <div class="col-md-7">
                                        <div class="product-desc"> 게시물 번호 : ${board.bno} </div>
                                        <div class="product-desc"> 게시 날짜 : ${board.bdate}</div><br>
                                        <div class="product-title"> ${board.btitle}</div>
                                        <hr>
                                        <div class="product-price"> 금액 : ${board.bprice} </div>
                                        <div class="product-stock"> In Stock</div>
                                        <hr>

                                        <div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"> <span class="glyphicon glyphicon-lock"></span>
                                                </span> <input id="bpassword" type="password" class="form-control" placeholder="비밀번호" name="bpassword" />
                                            </div>
                                        </div>

                                        <div class="btn-group cart">
                                            <a href="main" class="btn btn-success">목록</a>
                                        </div>
                                        <div class="btn-group wishlist">
                                            <input onclick="handleBtnUpdate()" type="button" class="btn btn-warning" value="수정" />
                                        </div>
                                        <div class="btn-group wishlist">
                                            <input onclick="handleBtnDelete()" type="button" class="btn btn-danger" value="삭제" />
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <div class="container-fluid">
                            <div class="col-md-12 product-info">
                                <ul id="myTab" class="nav nav-tabs nav_tabs">

                                    <li class="active"><a href="#service-one" data-toggle="tab">DESCRIPTION</a></li>

                                </ul>
                                <div id="myTabContent" class="tab-content">
                                    <div class="tab-pane fade in active" id="service-one">
                                        <section class="container product-info">${board.bcontent}</section>

                                    </div>
                                    <div class="tab-pane fade" id="service-two">

                                        <section class="container">

                                        </section>

                                    </div>
                                    <div class="tab-pane fade" id="service-three">

                                    </div>
                                </div>
                                <hr>
                            </div>
                        </div>
                    </div>
                </div>

            </form>
            <footer style="padding: 5px 0px 5px 0px; text-align: center;">&copy; 2017 by Sunggeun.Jang &middot;
                <a href="mailto:busk0821@gmail.com">busk0821@gmail.com</a></footer>
        </div>
    </body>

</html>