
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h1>Page 1</h1>
	<br>
	<%--
		By using hyperlink, user has to click on the link to go to next page
	 --%>
	<%-- 
		<a href="page2.jsp">Next Page</a>
	--%>
	<%--
		By using <jsp:include> or <jsp:forward> action elements, we can move
		from one page to other page without browser involvement
	 --%>
	 
	 <%-- <jsp:include page="page2.jsp"></jsp:include> --%>
	 
	 <jsp:forward page="page2.jsp"></jsp:forward>
	 
	
	<%@ include file="footer.jsp" %>
</body>
</html>

