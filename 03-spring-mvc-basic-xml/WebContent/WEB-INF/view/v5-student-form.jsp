<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="studentF">
			First Name: <form:input path="firstName" />
			<br><br>
			Last Name: <form:input path="lastName"  />
			<br><br>
			Country: 
			<form:select path="country">
				<form:options items="${fileCountryOptions}"/>
			</form:select>
			<br><br>
			 Gender: 
			 Male <form:radiobutton path="gender" value="M"/>
			 Female <form:radiobutton path="gender" value="F"/>
			<br><br>
			Preferred Operating System: 
			<form:radiobuttons path="preferredOS" items="${fileOperatingSystems}"/>
			<br><br>
			<input type="submit" />
		</form:form>
		<a href="../../">back to main-menu</a>
	</body>
</html>