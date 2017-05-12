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
		<style>
			div	{
				border : 1px solid gray;
			}
			.col-md-3 {
				padding: 0px;
			}
			.col-md-4 {
				padding: 0px;
			}
			.col-md-5 {
				padding: 0px;
			}
			.col-md-6 {
				padding: 0px;
			}
			.col-md-7 {
				padding: 0px;
			}
			.col-md-8 {
				padding: 0px;
			}
			.col-md-12 {
				padding: 0px;
			}
			.row {
				padding: 0px;
			}
		</style>
    </head>
    <body>
		<div class="container-fluid">
			<div class="row" >
				<div class="col-md-7">
					<div style="height: 50px; background-color: skyblue"></div>
				</div>
				<div class="col-md-5">	
					<div style="height: 50px; background-color: skyblue"></div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-8">
					<div class="row">
						<div class="col-md-4">
							<div style="height: 100px"></div>
						</div>
						<div class="col-md-4">
							<div style="height: 100px"></div>
						</div>
						<div class="col-md-4">
							<div style="height: 100px"></div>
						</div>
					</div>

					<div class="row">
						<div class="col-md-3">
							<div style="height: 200px"></div>
						</div>
						<div class="col-md-3">
							<div style="height: 200px"></div>
						</div>
						<div class="col-md-3">
							<div style="height: 200px"></div>
						</div>
						<div class="col-md-3">
							<div style="height: 200px"></div>
						</div>
					</div>

					<div class="row">
						<div class="col-md-4">
							<div style="height: 300px"></div>
						</div>
						<div class="col-md-4">
							<div style="height: 300px"></div>
						</div>
						<div class="col-md-4">
							<div style="height: 300px"></div>
						</div>
					</div>

				</div>
				<div class="col-md-4">
					<div class="row">
						<div class ="col-md-12">
							<div style="height: 100px"></div>
						</div>
					</div>
					<div class="row">
						<div class ="col-md-12">
							<div style="height: 200px"></div>
						</div>
					</div>
					<div class="row">
						<div class ="col-md-6">
							<div style="height: 300px"></div>
						</div>
						<div class ="col-md-6">
							<div style="height: 300px"></div>
						</div>
					</div>
				</div>
			</div>
    </body>
</html>
