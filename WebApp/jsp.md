JSP
---
- JSP stands for Java Server Pages
- JSP is used to develop server side dynamic web applications like Servlets


Servlets vs JSP
---------------
- In case of Servlets, Java code contains HTML code where as in case of JSP,
  HTML code contains Java code
- In case of Servlets, if the code is modified we need to recompile and redeploy the application
  where as in case of JSP, if the code is modified we need not recompile and redeploy the application
- JSP code is less than Servlets as in JSP we can use JSP Tags, JSP Implicit objects 



JSP Life cycle
--------------
- jspInit()
	- called only once when JSP page is loaded

- _jspService()
	- called for every request
	- cannot be overridden

- jspDestroy()
	 called only once when JSP page is destroyed


JSP Tags
--------
- Directive tags
	- page directive tag => <%@page ... %>
	- include directive tag => <%@include ... %>

- Scriptlet tags
	- Declaration tag => <%! ... %>
	- Expression tag => <%= ... %>
	- Script tag => <% ... %>

- Action tags
	- <jsp:include>
	- <jsp:forward>
	- <jsp:param>
	- <jsp:useBean>
	- <jsp:setProperty>
	- <jsp:getProperty>


page directive tag
 JSP Action tags
---------------
- <jsp:include>
- <jsp:forward>
- <jsp:param>
- <jsp:useBean>
- <jsp:setProperty>
- <jsp:getProperty>



<jsp:include> and <jsp:forward>
-------------------------------
used to include other JSP pages
 

In case of <jsp:include> the response is handled by all the JSP pages where as
in case of <jsp:forward> the response is handled by only the last page

<jsp:param>
----------
used to send the parameters from one JSP page to another JSP page
 


------------------
- <%@page ... %>
- used to import java packages

	Ex:
		<%@page import="java.util.*" %>
		<%@page import="java.sql.*" %>
			or
		<%@page import="java.util.*, java.sql.*" %>


include directive tag
---------------------
- <%@include ... %>
- used to include other JSP files

	Ex:
		<%@include file="header.jsp" %>
			....
			....	
		<%@include file="footer.jsp" %>

	Refer programs
		- header.jsp
		- footer.jsp
		- includedemo.jsp


Scriptlet tags
--------------
Declaration tag
---------------
- <%! ... %>
- used to declare variables and to define methods

	Ex:
		<%! int m = 100; %>
		<%! void ppp()
		    {
			...
                    }
		%>
		<%! void jspInit()
		    {
			...
                    }
		%>

Expression tag
--------------
- <%= ... %>
- used to access the value of variables and to call methods
- the code goes into _jspService()

	Ex:
		<%= m %> //100 is displayed on browser
		<%= ppp() %>
		<%= new java.util.Date() %>


Script tag
----------
- <% ... %>
- used to include Java Statements
- the code goes into _jspService()

	Ex:
		<%
			for(int n=1;n<=10;n++)
			   out.println(n);
		%>


JSP Implicit Objects
---------------------
out implicit object
-------------------
- out is an implicit object in JSP and it is an object of class JspWriter
- JspWriter is a subclass of PrintWriter class

	Ex:
		out.println("Welcome to JSP" );

request implicit object
-----------------------
- request is an implicit object in JSP and it is an object of HttpServletRequest interface

	Ex:
		String salary = request.getParameter("salary");


response implicit object
------------------------
- response is an implicit object in JSP and it is an object of HttpServletResponse interface

	Ex:
		response.setContentType("text/html")




 HTML file which accepts a number from user.
 JSP file which reads the number from HTML file and display the factorial of the given number
 
 
Using Javabeans in JSP
----------------------
A Javabean is a public class with private properties and public setters and getters
methods for every property

Ex:

public class Employee
{
   private int eno;
   private String ename;
   private double salary;
   public void setEno(int eno)
   {
	this.eno = eno;
   }
   public int getEno()
   {
	return eno;
   }
   ...
   ...
}
 