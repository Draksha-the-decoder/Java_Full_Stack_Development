# Java EE Overview

Java EE (Java Enterprise Edition) is a set of specifications and APIs used to develop **web applications** and **enterprise applications**.

---

## 📦 Components of Java EE

### 1. Web Components
Used to develop **web applications**.
- **Servlets**
- **JSP (Java Server Pages)**

### 2. Enterprise Components
Used to develop **enterprise applications** (distributed, secured, and transactional).
- **EJB (Enterprise Java Beans)**

---

## 🌐 Java EE Application Deployment

Java EE applications are **accessed by multiple clients**. To make the application available, it must be **deployed on a server**.

---

## 🖥️ Types of Servers

### 1. Web Servers
Used **only** for web applications. Understands Servlets and JSP.

**Examples:**
- Apache Tomcat
- Adobe JRun
- Jetty

### 2. Application Servers
Used for both **web applications and enterprise applications**. Understands Servlets, JSP, and EJB.

**Examples:**
- Oracle WebLogic
- Oracle GlassFish
- IBM WebSphere
- RedHat JBoss

---

## 🔧 Technologies for Server-side Dynamic Web Applications

These technologies are commonly used to develop dynamic content on the server side:

- Servlets
- JSP
- Spring MVC
- ASP.NET
- PHP
- Django (Python)

---

## ☕ Servlets

Servlets are **Java programs** used to create **server-side dynamic web applications**.

### Servlet Hierarchy

![Servlet Hierarchy](./Servlet_Hierarchy.png)

### Servlet Architecture

![Servlet Architecture](./Servlet_Architecture.png)

 - HttpServlet is declared abstract inspite of not having any abstract method so that its object cannot be created, it can only be implemented or extended.
---

## 🔁 Servlet Life Cycle

The life cycle of a servlet is managed by the **Servlet Container** and involves the following methods:

| Method     | Description                                      |
|------------|--------------------------------------------------|
| `init()`   | Called once when the servlet is initialized. Usually used to set up resources like DB connections. |
| `service()`| Called for every client request. Handles request/response logic. |
| `destroy()`| Called once when the servlet is taken out of service. Used to clean up resources. |

---

## 🛠️ Creating a Servlet

### 1. Extending `GenericServlet` class

```java
public class HelloServlet extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // Handle the request
    }
}
```

### 2. Extending `HttpServlet` class

```java	
public class HelloServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //handle the request
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //handle the request
    }
}
```

Note
----
```java
interface HttpServletRequest extends ServletRequest {}
interface HttpServletResponse extends ServletResponse {}
```
 - class to class => extends
 - class to interface => implements
 - interface to interface => extends
 - interface to class => error

---


# XML
---
- XML stands for Extensible Markup Language
- XML is used to transport the data from one application to another application due to its small size. we take data from database and convert it into xml format and then send it.
- In Java, XML is used for creating configuration files required for the application
- A XML file should contain only one root tag (the first tag in the XML file is the root tag)
- For every tag there should be a closing tag or self enclosing tag
	```xml
    <mytag>...</mytag>
	<mytag/> <!-- self enclosing tag -->
    ```
- Attribute values should be in either " " or ' '
	```xml
		<property name="price" value='5000'/>
    ```
- No overlapping of tags
	```xml
		<product><price>5000</product></price> <!-- error - overlapping tags -->
    ```    

## HTML vs XML
-----------
- In HTML, all tags are predefined tags where as in XML, all tags are user defined tags
- HTML is used to present the data where as XML is used for data about data (META-DATA)
	```xml
		<b>5000</b> <!-- HTML - 5000 is presented as bold -->
		<price>5000</price> <!-- XML - 5000 is price -->
    ```
- HTML is not case sensitive where as XML is case sensitive
- HTML is not standard where as XML is standard ie. we need to follow the rules of opening and closing tags.
 

web.xml
```xml
<web-app>
     <servlet>
	<servlet-name>Hello</servlet-name>
	<servlet-class>HelloServlet</servlet-class>
     </servlet>
     <servlet-mapping>
	<servlet-name>Hello</servlet-name>
	<url-pattern>/HelloServlet</url-pattern> //alias for client
     </servlet-mapping>
</web-app>
```

###
 - when a request is made to a web application, the server loads web.xml file
 - web.xml is the configuration file / deployment descriptor for web applications
 - in a web application we can have only one web.xml file
 - <web-app> is the root element of web.xml file
 - web.xml file is present in WEB-INF folder

## GET vs POST 
In case of GET method the data goes along with the url (visible in URL) where as
in case of POST method the data goes as a separate page (not visible in URL)

## Passing data through web.xml file to servlet 
### 1. ServletConfig interface 
This interface is used to read initial parameters from web.xml file into a particular Servlet
```xml
 <servlet>
    <description></description>
    <display-name>ServletConfigDemo</display-name>
    <servlet-name>ServletConfigDemo</servlet-name>
    <servlet-class>ServletConfigDemo</servlet-class>
    <init-param>
      <param-name>username</param-name>
      <param-value>admin</param-value>
    </init-param>
    <init-param>
      <param-name>password</param-name>
      <param-value>root</param-value>
    </init-para
```
```java
ServletConfig config = getServletConfig();//implemented by GenericServlet class
String username = config.getInitParameter("username"); 
```

### 2. ServletContext interface 
This interface is used to read context parameters (global) from web.xml file to all servlets of web application
```xml
<web-app>
	<context-param>
	    <param-name>collegeName</param-name>
	    <param-value>RRRCollege</param-value>
  </context-param>
</web-app>
```
```java
ServletContext context = getServletContext();//implemented by GenericServlet class
String collegeName = context.getInitParameter("collegeName");
```

![Login_Application](./Login_Application.png)
