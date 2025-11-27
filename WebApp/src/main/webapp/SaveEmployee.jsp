<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
///PackageJSP.Employee emp = new PackageJSP.Employee(); // include full package name if needed
//int eno = Integer.parseInt(request.getParameter("eno"));
//emp.setEno(eno);
%>
<jsp:useBean id="emp" class="PackageJSP.Employee" scope="session"/>
<jsp:setProperty name = "emp" property="*"/>
<a href="DisplayEmployee.jsp">Display employee</a>

</body>
</html>