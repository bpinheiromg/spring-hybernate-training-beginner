<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
	<head>
		<title>Student Confirmation</title>
	</head>
	<body>
		Student name: ${studentF.firstName} ${studentF.lastName}
		<br><br>
		Student country: ${studentF.country}
		<br><br>
		Student gender: ${studentF.gender}
		<br><br>
		Preferred Operating System: ${studentF.preferredOS}
		<br><br>
		Programming Languages proficiency: 
		<ul>
			<c:forEach var="progLanguage" items="${studentF.programmingLanguages}">
				<li> ${progLanguage} </li>
			</c:forEach>
		</ul>
		<br><br>
		<a href="./form">back to form</a>
	</body>
</html>