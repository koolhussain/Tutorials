<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="st" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<st:form action="login">
		<st:textfield label="Username" name="un"></st:textfield>
		<st:password label="Password" name="pwd"></st:password>
		<st:submit value="Login"></st:submit>
	</st:form>
</body>
</html>