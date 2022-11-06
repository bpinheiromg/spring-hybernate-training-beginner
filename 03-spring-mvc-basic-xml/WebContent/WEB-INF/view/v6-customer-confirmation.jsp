<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
	<head>
		<title>Customer Confirmation</title>
	</head>
	<body>
		Customer name: ${customer.firstName} ${customer.lastName}
		<br>
		Customer age: ${customer.age} years old
		<br><br>
		<a href="./form">back to form</a><br>
		<a href="../../">back to main-menu</a>
	</body>
</html>