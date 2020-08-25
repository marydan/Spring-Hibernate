<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<body>
<h2>Employee Form</h2>

<form method="POST" action="saveemp" modelAttribute="employee"> 
Name <input type=text name="empname"> <br>
Department <input type=text name="dept"><br>
<input type=submit value=Save>
</form>

  
<table border="2">
<tr>
<td>EMp id </td>
<td> Emp name </td>
<td> Department</td>
</tr>

<c:forEach items="${employees}" var="emp">
<tr>
<td>${emp.empid}</td>
<td>${emp.empname}</td>
<td>${emp.dept}</td>
</tr>


 </c:forEach>

</table>
 

</body>
</html>
