<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
		<script>
			// 전역 변수
			var v1 = "A";

			function fun1() {
				// 로컬 변수
				var v2 = "B";

				if (true) {
					var v3 = "C";
					// v4는 전역 변수 var 타입 없이 사용		
					v4 = "D";
				}
				console.log(v1);
				console.log(v2);
				console.log(v3);
			}
			fun1();
			console.log(v1);
		</script>

    </head>
    <body>
    </body>
</html>
