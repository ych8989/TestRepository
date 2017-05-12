<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
		<meta charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
        <title>JSP Page</title>
		<link href="/WebApplication/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
		<script src="/WebApplication/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
		<script src="/WebApplication/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
		<script>
			// 객체 생성		
			var car = {
				// 필드(속성)
				// 네트워크 전송이 "" 를 작성하지 않으면 파싱 에러가 남
				"model": "승용차",
				"company": "현대",
				"speed": 0,

				// 메소드 (객체안에 있기때문에 함수라고 부르지 않음)
				"start": function () {
					console.log("시동을 겁니다.");
				},
				// 자바 스크립트에서는 this를 꼭 작성!
				"setSpeed": function (speed) {
					this.speed = speed;
				},
				"getSpeed": function () {
					return this.speed;
				}
			};
			// 객체 필드(속성) 값 읽기 및 수정
			console.log(car.model);
			car.company = "기아";
			console.log(car.company);
			car.speed = 60;
			console.log(car.speed);
			car.start();
			car.setSpeed(300);
			console.log(car.getSpeed());

		</script>
    </head>
    <body>
        <h1>자바스크립트 객체</h1>
    </body>
</html>
