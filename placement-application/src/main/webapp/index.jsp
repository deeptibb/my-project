<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<h1>Register Form:</h1>
		<div class="card">
			<div class="card-body">
				<form action="login.do" method="post">
					<div class=" form-group row">
						<label for="lastName" class="col-sm-2 col-form-label">UserName</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="username" placeholder="Enter user name">
						</div>
					</div>

					<div class="form-group row">
						<label for="lastName" class="col-sm-2 col-form-label">Password</label>
						<div class="col-sm-7">
					 <input type="password" class="form-control" name="password" placeholder="Enter Password">
						</div>
					</div>

					<button type="signin" class="btn btn-primary">signin</button>
					<a href="doregistration.do" type="Login" class="btn btn-primary"/>signup</a>
				</form>
			</div>
		</div>
	</div>

</body>
</html>