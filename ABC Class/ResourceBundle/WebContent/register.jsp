<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="st"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<st:form action="reg">
		<st:textfield label="Username" name="un"></st:textfield>
		<st:password label="Password" name="pw"></st:password>
		<st:submit value="Register"></st:submit>
	</st:form>

</body>
</html>