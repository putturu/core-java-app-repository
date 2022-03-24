<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="userBean" class="com.sapient.aem.model.User" scope="request" />
	
	<%-- populate the bean --%>
	<jsp:setProperty property="userId"  value="101" name="userBean"/>
	<jsp:setProperty property="userName" value="Smith" name="userBean"/>
	<jsp:setProperty property="password" value="smith@123"  name="userBean"/>
	<jsp:setProperty property="role" value="ADMIN"  name="userBean"/>
	
	<h2 align="center">User Details</h2>
	<h2>
		<%-- UserId: <jsp:getProperty property="userId" name="userBean"/><br>
		UserName: <jsp:getProperty property="userName" name="userBean"/><br>
		Password: <jsp:getProperty property="password" name="userBean"/><br>
		Role: <jsp:getProperty property="role" name="userBean"/> --%>
	</h2>
	<h2>
     	UserId: ${userBean.userId}<br>
		UserName:${userBean.userName }<br>
		Password:${userBean.password } <br>
		Role:${userBean.role }
	
	</h2>
	<jsp:forward page="jspbean1.jsp"></jsp:forward>
</body>
</html>
