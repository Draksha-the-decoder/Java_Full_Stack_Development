<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculate factorial</title>
</head>
<body>
<%!
int fact(int n)
{
 int f=1;
 for(int i=n;i>=1;i--)
	 f=f*i;
 return f;
}
%>
<%int n=Integer.parseInt(request.getParameter("num")); %>
<h3>Factorial : <%=fact(n) %></h3>
 </body>
</html>