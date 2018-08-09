<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scheduled Sessions</title>
</head>
<body>
	<div class="container">
		<h1>Scheduled Sessions</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Session Name</th>
					<th>Duration(Days)</th>
					<th>Faculty</th>
					<th>Mode</th>
					<th>Enroll</th>



				</tr>
			</thead>
			<tbody>
				<c:forEach items="${arrayList}" var="scheduledsessions">
					<form:form action="update" method="post"
						modelAttribute="scheduledsessions">
						<tr>




							<td><form:input path="name" size="30"
									value="${scheduledsessions.name}" type="hidden" /><label>${scheduledsessions.name}</label></td>



							<td><form:input path="duration" size="30"
									value="${scheduledsessions.duration}" type="hidden" /><label>${scheduledsessions.duration}</label></td>


							<td><form:input path="faculty" size="30"
									value="${scheduledsessions.faculty}" type="hidden" /><label>${scheduledsessions.faculty}</label></td>

							<td><form:input path="mode" size="30"
									value="${scheduledsessions.mode}" type="hidden" /><label>${scheduledsessions.mode}</label></td>


							<td><input type="submit" class="btn btn-link"
								value="Enroll Me" /></td>
						</tr>
					</form:form>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>