<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>

<title>Customer confirmation</title>


</head>

<body>
	Customer FirstName : ${customer.firstName }

	<br>
	<br> Customer LastName : ${customer.lastName }

	<br>
	<br> Free Passes : ${customer.freePasses }

	<br>
	<br> Postal Code : ${customer.postalCode }

	<br>
	<br> Course Code : ${customer.courseCode }
</body>


</html>