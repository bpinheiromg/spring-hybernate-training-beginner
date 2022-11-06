<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
	<head>
		<title>Customer Form with Validation</title>
		<style type="text/css">
			.error {color:red}
		</style>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="customer">
			First Name: <form:input path="firstName" />
			<br><br>
			Last Name*: <form:input path="lastName"  />
			<form:errors path="lastName" cssClass="error" />
			<br><br>
			Age (years)*: <form:input path="age"  />
			<form:errors path="age" cssClass="error" />
			<br><br>
			Postal Code: <form:input path="postalCode"  />
			<form:errors path="postalCode" cssClass="error" />
			<br><br>
			Course Code: <form:input path="courseCode"  />
			<form:errors path="courseCode" cssClass="error" />
			<br><br>
			<input type="submit" />
		</form:form>
		<a href="../../">back to main-menu</a>
	</body>
</html>