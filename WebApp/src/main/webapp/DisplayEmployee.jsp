<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="PackageJSP.Employee" scope="session"/>
<table >
<tr>
<th>Employee Number</th>
<td><jsp:getProperty name="emp" property="eno"/></td>
<th>Employee Name</th>
<td><jsp:getProperty name="emp" property="ename"/></td>
<th>Employee Salary </th>
<td><jsp:getProperty name="emp" property="salary"/></td>

</tr>
</table>


</body>
</html>