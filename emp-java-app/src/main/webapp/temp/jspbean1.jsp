<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userBean" class="com.sapient.aem.model.User" scope="request"></jsp:useBean>
<h2>
		UserId: <jsp:getProperty property="userId" name="userBean"/><br>
		UserName: <jsp:getProperty property="userName" name="userBean"/><br>
		Password: <jsp:getProperty property="password" name="userBean"/><br>
		Role: <jsp:getProperty property="role" name="userBean"/>
</body>
</html>