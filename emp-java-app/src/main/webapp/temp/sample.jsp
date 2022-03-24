<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date" errorPage="error.jsp" %>
<%-- 
 	By setting the attribute errorPage="error.jsp", when an exception
	occurs in this page, server will render error.jsp file to the browser --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- JSP declaration --%>
	<%! Integer data=10; %>
	<h1>Hello! Welcome To My Java Server Page</h1>	
								<%-- JSP Expression --%>
	<h2>Present Date and Time  <%= new Date() %>  </h2>
	<%-- JSP Scriptlet --%>
	<% 
		out.println(data);
	    String username= request.getParameter("username");
	    out.println(username);
	    //variable declared in scriptlet is placed inside _jspService() method
	    //status is local variable
	    String status=null;
	    //NullPointerException is thrown at runtime
	    out.println(status.length());
	%>
	<br>	
	
	<%
		out.println("Thank Q");	
	%>
</body>
</html>

