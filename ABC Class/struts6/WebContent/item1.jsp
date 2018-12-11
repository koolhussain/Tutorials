<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="st"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chocolates</title>
</head>
<body>
	<st:form action="item1">
		<st:textfield label="No of Chocolates" name="choco"></st:textfield>
		<st:submit value="Proceed"></st:submit>
	</st:form>

</body>
</html>