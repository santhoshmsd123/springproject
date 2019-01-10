<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" 
 prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="signup" method="post" modelAttribute="signup"><br>
<input type="text" name="username" placeholder="Enter your name"><br>
<input type="text" name="rollno" placeholder="Enter your rollno"><br>
<input type="email" name="mailid" placeholder="Enter your email"><br>
<input type="password" name="password" placeholder="Enter your password"><br>
<input type="radio" name="role" value="staff" >Staff <input type="radio"  name="role" value="student"  >Student<br>
<select name="course">
<option> c </option>
<option> c++ </option>
</select>
<input type="submit" value="signup">
</form:form>
</body>
</html>