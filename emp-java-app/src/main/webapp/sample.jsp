<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="java.util.List,java.util.ArrayList,
    				com.sapient.aem.model.User, com.sapient.aem.model.Role"   %>
 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="Hello! Welcome to JSTL"></c:out><br>
	<c:set var="username" value="Srini"></c:set>
	<c:out value="${username }"></c:out>
	
	<c:set var="income" scope="session" value="${4000*4}"/> 
	<p>Your income is : <c:out value="${income}"/></p> 

	<c:choose> 
		<c:when test="${income <= 5000}"> 
			Income is not good. 
		</c:when> 
		<c:when test="${income > 15000}"> 
				Income is very good. 
		</c:when> 
		<c:otherwise> 
				Income is undetermined... 
		</c:otherwise> 
	</c:choose>
	<br>
	<c:if test="${income<=16000 }">
		<c:out value="${income }"></c:out> is less 16000	
	</c:if>
	
	<%
		List<String> courseList= new ArrayList<>();
		courseList.add("Java"); courseList.add("Javascript");
		courseList.add("Java EE"); courseList.add("HTML 5");		
		request.setAttribute("courseList", courseList);
	%>
	<h2>List of courses</h2>
	<c:forEach  var="course"   items="${courseList}">
		${course} <br>	
	</c:forEach>
	
	<%--<%
		List<User> userList= new ArrayList<>();
		userList.add(new User(1,"smith","smith@123",Role.ADMIN));
		userList.add(new User(2,"clarke","clarke@123",Role.MANAGER));
		userList.add(new User(3,"jones","jones@123",Role.WORKER));
		request.setAttribute("userList", userList);
	--%>
	
	<h3>List of Users</h3>
	<table border="1">
		<c:forEach var="user" items="${userList}">
			<tr><td>${user.userId }</td><td>${user.userName }</td>
				<td>${user.password }</td><td>${user.role}</td></tr>	
		</c:forEach>
	</table>
	
	
	
	
	
	
</body>
</html>


