<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

	<div class="container">
		<h2>CRM - Information Customers</h2>
		<button onclick="window.location.href='add'" type="button" class="btn btn-success">Add Customer</button>
	
		<table  class="table">
			<thead>

				<tr>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>Email</th>
					<th>Action</th>
					<th>Action</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tempCutomers" items="${listCustomers}">
				
				<c:url var="updateLink" value="/customer/FormUpdate">
				<c:param name="customerId" value="${tempCutomers.id}"/>	
				</c:url>
				
				<c:url var="deleteLink" value="/customer/delete">
				<c:param name="customerId" value="${tempCutomers.id}"/>	
				</c:url>
				
					<tr>
						<td>${tempCutomers.firstName }</td>
						<td>${tempCutomers.lastName}</td>
						<td>${tempCutomers.email}</td>
						<td><a href="${updateLink}">Update</a></td>
						<td><a href="${deleteLink}" onclick="if(!(confirm('Are you sure to delete this customer ? '))) return false">Delete</a></td>
						
					</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
