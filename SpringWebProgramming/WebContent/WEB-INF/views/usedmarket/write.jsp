<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport " content="width=device-width, initial-scale=1, user-scalable=no ">
        <title>Used Market</title>
        <link href="<%=application.getContextPath()%>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">
        <script src="<%=application.getContextPath()%>/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="<%=application.getContextPath()%>/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.6/lumen/bootstrap.min.css">
        <link rel="stylesheet" href="https://daneden.github.io/animate.css/animate.min.css">

        <script>
            (function ($) {
                function floatLabel(inputType) {
                    $(inputType).each(function () {
                        var $this = $(this);
                        // on focus add cladd active to label
                        $this.focus(function () {
                            $this.next().addClass("active");
                        });
                        //on blur check field and remove class if needed
                        $this.blur(function () {
                            if ($this.val() === '' || $this.val() === 'blank') {
                                $this.next().removeClass();
                            }
                        });
                    });
                }
                // just add a class of "floatLabel to the input field!"
                floatLabel(".floatLabel");
            })(jQuery);
        </script>



        <style>
            html,
            body,
            div,
            span,
            applet,
            object,
            iframe,
            h1,
            h2,
            h3,
            h4,
            h5,
            h6,
            p,
            blockquote,
            pre,
            a,
            abbr,
            acronym,
            address,
            big,
            cite,
            code,
            del,
            dfn,
            em,
            img,
            ins,
            kbd,
            q,
            s,
            samp,
            small,
            strike,
            strong,
            sub,
            sup,
            tt,
            var,
            b,
            u,
            i,
            center,
            dl,
            dt,
            dd,
            ol,
            ul,
            li,
            fieldset,
            form,
            label,
            legend,
            table,
            caption,
            tbody,
            tfoot,
            thead,
            tr,
            th,
            td,
            article,
            aside,
            canvas,
            details,
            embed,
            figure,
            figcaption,
            footer,
            header,
            hgroup,
            menu,
            nav,
            output,
            ruby,
            section,
            summary,
            time,
            mark,
            audio,
            video {
                margin: 0;
                padding: 0;
                border: 0;
                font: inherit;
                font-size: 100%;
                vertical-align: baseline;
            }

            html {
                line-height: 1;
            }

            ol,
            ul {
                list-style: none;
            }

            table {
                border-collapse: collapse;
                border-spacing: 0;
            }

            caption,
            th,
            td {
                text-align: left;
                font-weight: normal;
                vertical-align: middle;
            }

            q,
            blockquote {
                quotes: none;
            }

            q:before,
            q:after,
            blockquote:before,
            blockquote:after {
                content: "";
                content: none;
            }

            a img {
                border: none;
            }

            article,
            aside,
            details,
            figcaption,
            figure,
            footer,
            header,
            hgroup,
            main,
            menu,
            nav,
            section,
            summary {
                display: block;
            }
            /* Colors */
            /* ---------------------------------------- */

            * {
                -moz-box-sizing: border-box;
                -webkit-box-sizing: border-box;
                box-sizing: border-box;
            }

            body {
                text-align: center;
                font-family: 'Lato', 'sans-serif';
                font-weight: 400;
            }

            u.thick {
                font-weight: bold;
                font-size: 20px;
            }

            a {
                text-decoration: none;
            }

            .info-text {
                text-align: left;
                width: 100%;
            }

            header,
            form {
                padding: 4em 10%;
            }

            .form-group {
                margin-bottom: 20px;
            }

            h2.heading {
                font-size: 22px;
                text-transform: uppercase;
                font-weight: 600;
                text-align: left;
                color: #506982;
                border-bottom: 1px solid #506982;
                padding-bottom: 3px;
                margin-bottom: 20px;
            }

            .controls {
                text-align: left;
                position: relative;
            }

            .controls input[type="text"],
            .controls input[type="email"],
            .controls input[type="number"],
            .controls input[type="date"],
            .controls input[type="tel"],
            .controls textarea,
            .controls button,
            .controls select {
                padding: 12px;
                font-size: 14px;
                border: 2px solid #c6c6c6;
                width: 100%;
                margin-bottom: 18px;
                color: #888;
                font-family: 'Lato', 'sans-serif';
                font-size: 19px;
                font-weight: 300;
                -moz-border-radius: 2px;
                -webkit-border-radius: 2px;
                border-radius: 2px;
                -moz-transition: all 0.3s;
                -o-transition: all 0.3s;
                -webkit-transition: all 0.3s;
                transition: all 0.3s;
            }

            .controls input[type="text"]:focus,
            .controls input[type="text"]:hover,
            .controls input[type="email"]:focus,
            .controls input[type="email"]:hover,
            .controls input[type="number"]:focus,
            .controls input[type="number"]:hover,
            .controls input[type="date"]:focus,
            .controls input[type="date"]:hover,
            .controls input[type="tel"]:focus,
            .controls input[type="tel"]:hover,
            .controls textarea:focus,
            .controls textarea:hover,
            .controls button:focus,
            .controls button:hover,
            .controls select:focus,
            .controls select:hover {
                outline: none;
                border-color: #9FB1C1;
            }

            .controls input[type="text"]:focus+label,
            .controls input[type="text"]:hover+label,
            .controls input[type="email"]:focus+label,
            .controls input[type="email"]:hover+label,
            .controls input[type="number"]:focus+label,
            .controls input[type="number"]:hover+label,
            .controls input[type="date"]:focus+label,
            .controls input[type="date"]:hover+label,
            .controls input[type="tel"]:focus+label,
            .controls input[type="tel"]:hover+label,
            .controls textarea:focus+label,
            .controls textarea:hover+label,
            .controls button:focus+label,
            .controls button:hover+label,
            .controls select:focus+label,
            .controls select:hover+label {
                color: #bdcc00;
                cursor: text;
            }

            .controls .fa-sort {
                position: absolute;
                right: 10px;
                top: 17px;
                color: #999;
            }

            .controls select {
                -moz-appearance: none;
                -webkit-appearance: none;
                cursor: pointer;
            }

            .controls label {
                position: absolute;
                left: 8px;
                top: 12px;
                width: 60%;
                color: #999;
                font-size: 16px;
                display: inline-block;
                padding: 4px 10px;
                font-weight: 400;
                background-color: rgba(255, 255, 255, 0);
                -moz-transition: color 0.3s, top 0.3s, background-color 0.8s;
                -o-transition: color 0.3s, top 0.3s, background-color 0.8s;
                -webkit-transition: color 0.3s, top 0.3s, background-color 0.8s;
                transition: color 0.3s, top 0.3s, background-color 0.8s;
                background-color: white;
            }

            .controls label.active {
                top: -11px;
                color: #555;
                background-color: white;
                width: auto;
            }

            .controls textarea {
                resize: none;
                height: 200px;
            }

            #something {
                width: 9.9em;
            }

            #regno {
                width: 12.6em;
            }

            #btnReg {
                height: 3.8em;
            }

            button {
                cursor: pointer;
                background-color: #32505F;
                border: none;
                color: #fff;
                padding: 12px 0;
                float: right;
            }

            button:hover {
                background-color: #3b5e70;
            }

            .clear:after {
                content: "";
                display: table;
                clear: both;
            }

            .grid {
                background: white;
            }

            .grid:after {
                /* Or @extend clearfix */
                content: "";
                display: table;
                clear: both;
            }

            [class*='col-'] {
                float: left;
                padding-right: 10px;
            }

            .grid [class*='col-']:last-of-type {
                padding-right: 0;
            }

            .col-2-3 {
                width: 66.66%;
            }

            .col-1-3 {
                width: 33.33%;
            }

            .col-1-2 {
                width: 50%;
            }

            .col-1-4 {
                width: 25%;
            }

            @media (max-width: 760px) {
                .col-1-4-sm,
                .col-1-3,
                .col-2-3 {
                    width: 100%;
                }

                [class*='col-'] {
                    padding-right: 0px;
                }
            }

            .col-1-8 {
                width: 12.5%;
            }
            #bpassword {
                -webkit-text-security: disc;
            }
        </style>
    </head>
    <body>
        <form method="post" style="padding: 0px 20px" enctype="multipart/form-data">
            <div class="panel panel-primary panel-table animated slideInDown">
                <div class="container" style="margin-top: 20px;">
                    <!--  General -->
                    <div class="form-group">
                        <br />
                        <br />
                        <br />
                        <h2 class="heading">Details</h2>
                        <div class="controls">
                            <input type="text" id="title" class="floatLabel" placeholder="제목" name="btitle" />
                        </div>
                        <div class="controls">
                            <input type="text" id="writer" class="floatLabel" placeholder="작성자" name="bwriter" />
                        </div>
                        <div class="controls">
                            <input type="text" id="price" class="floatLabel" placeholder="가격" name="bprice" />
                        </div>
                        <div class="controls">
                            <input id="bpassword" type="text" id="password" class="floatLabel" placeholder="비밀번호" name="bpassword" />
                        </div>

                        <div class="controls">
                            <input type="file" class="form-control" placeholder="선택" name="battach" />
                        </div>
                    </div>

                    <!--  Car Details -->
                    <div class="grid">
                        <p class="info-text">Description:</p>
                        <br>

                        <div class="controls">
                            <textarea name="bcontent" class="floatLabel" id="comments" placeholder="내용"></textarea>
                        </div>

                        <button type="submit" value="Submit" class="col-1-4">Submit</button>
                        <button style="margin-left: 10px;" onclick="location.href = main" class="col-1-4">List</button>
                    </div>
                </div>
                <footer style="padding: 30px 0px 10px 0px;">&copy; 2017 by Sunggeun.Jang &middot;
                    <a href="mailto:busk0821@gmail.com">busk0821@gmail.com</a></footer>
            </div>
            <!-- /.form-group -->
        </form>
    </body>
</html>