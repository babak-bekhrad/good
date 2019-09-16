<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="container">
		<h2>Enroll Customer</h2>
		<form:form action="saveCustomer" modelAttribute="add" method="POST">

			<div class="form-group">
				<label>First name:</label>
				<form:input type="text" class="form-control"
					placeholder="Enter Name" path="firstName" />
			</div>

			<div class="form-group">
				<label>Last Name:</label>
				<form:input type="text" class="form-control"
					placeholder="Enter Family" path="lastName" />

			</div>

			<div class="form-group">
				<label>Email:</label>
				<form:input type="text" class="form-control"
					placeholder="Enter email" path="email" />

			</div>
			<button type="submit" class="btn btn-success">Submit</button>
		</form:form>
	</div>

</body>
</html>