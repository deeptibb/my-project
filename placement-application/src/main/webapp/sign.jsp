<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->

<link href="${contextPath}/resource/bootstrap.min.css" rel="stylesheet">
</head>

<body>
	<div class="container">
		<h1>Welcome To Sign-in Page:</h1>
		<div class="card">
			<div class="card-body">
				<form action="register.do" method="post">


					<div class=" form-group row">
						<label for="Name" class="col-sm-2 col-form-label">UserName</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="username"
								placeholder="Enter user name">
						</div>
					</div>

					<div class="form-group row">
						<label for="E-mail Id" class="col-sm-2 col-form-label">E-mail</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="email"
								placeholder="Enter E-mail">
						</div>
					</div>


					<div class="form-group row">
						<label for="contact" class="col-sm-2 col-form-label">ContactNo</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="contactno"
							<div class="form-check">
					<label>Gender</label><br>
						<input class="form-check-input" type="radio" name="female"
							id="exampleRadios1" value="Female" checked> <label
							class="form-check-label" for="exampleRadios1">female
							 </label>
					</div>
					<div class="form-check">
				
						<input class="form-check-input" type="radio" name="male"
							id="exampleRadios2" value="Male"> <label
							class="form-check-label" for="exampleRadios2"> male
							 </label>
					</div>	placeholder="Enter Contact Number">
						</div>
					</div>
                    <div class="form-check">
					
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
</body>
</html>