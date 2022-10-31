<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName" />
			<br><br>
			Last Name: <form:input path="lastName"  />
			<br><br>
			Country: 
			<form:select path="country">
				<form:option value="Brazil" label="Brazil"/>
				<form:option value="Chile" label="Chile"/>
				<form:option value="Equator" label="Equator"/>
				<form:option value="Marroco" label="Marroco"/>
				<form:option value="Tuvalu" label="Tuvalu"/>
			</form:select>
			<br><br>
			<input type="submit" />
		</form:form>
	</body>
</html>