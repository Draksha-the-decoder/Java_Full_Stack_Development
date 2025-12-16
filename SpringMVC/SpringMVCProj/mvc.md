Date:02/Jan/2025
----------------
Spring MVC Module
-----------------
- Spring MVC Module is used to develop server side dynamic web applications
- MVC stands for Model View and Controller
- MVC Architecture is used to make the Model independent of View

	Refer diagram MVC.png

- The front end controller in Spring MVC is "DispatcherServlet" which need to be configured in web.xml file
- DispatcherServlet loads the Spring Bean XML configuration file
- In Spring Bean XML configuration file we configure the Controller classes
- Controller class will invoke the Model and the Model will return result back to the Controller and based
  on the result, Controller invokes the respective view pages

Spring MVC Annotations
----------------------
@Controller
-----------
used to mark the class as the Controller class

	Ex:
		@Controller
		public class LoginController
		{
		   ...
		}


@RequestMapping
---------------
used to map the request url

	Ex:
		<form action="login">
		   username <input type="text" name="username"/><br>
		   password <input type="password" name="password"/><br>
		   <input type="submit" value="Login"/>
		</form>


		@Controller
		public class LoginController
		{
		   @RequestMapping("/login")
		   public authenticate()
		   {
			...
                   }
		}


Developing a Spring MVC Application in Eclipse using Maven
----------------------------------------------------------
- Configure Tomcat 9 version Server in eclipse workspace


- Create a Maven Project

	Click on File -> New -> Maven Project

	Click Next

	In Catalog Select : Internal
	In Artifact Id Select: maven-archetype-webapp

	Click Next

	Group Id : springmvc
	Artifact Id: SpringMVCProj
	Package: com.spring.mvc

	click Finish

	Note
	----
	If errors in the project,
		Right click on SpringMVCProj -> Properties -> Targeted Runtimes ->
		  Make check mark to "Apache Tomcat v9.0" -> Click Apply and Close


- Add the following dependency in between <dependencies> element of pom.xml file of SpringMVCProj

		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>5.1.10.RELEASE</version>
		</dependency>
		
	Refer program pom.xml

- Create a welcome page "login.jsp" in src/main/webapp folder of SpringMVCProj

	Refer program login.jsp


- Create a folder "java" in src/main folder

- Create a package "com.spring.mvc.controller" in src/main/java folder

- Create a Controller class "LoginController" in com.spring.mvc.controller package
	Refer program LoginController.java

- Create a package "com.spring.mvc.model" in src/main/java folder
	
- Create a Model/Service/Action class "LoginAction" in com.spring.mvc.model package
	REfer program LoginAction.java

- Create a view page "success.jsp" in src/main/webapp folder 

- Create a view page "failure.jsp" in src/main/webapp folder 

- Update web.xml file (WEB-INF) by configuring Spring MVC Front end Controller "DispatcherServlet" 

- Create a Spring Bean XML configuration file "springmvc-servlet.xml" in WEB-INF folder 

	Note
	----
	The name of the spring bean xml configuration file should be "servlet-name-servlet.xml"
	where "servlet-name" is the servlet name given in <servlet-name> element of web.xml file

 login.jsp -- request made > web.xml (Dispatcherservlet) -> springmvc-servlet (spring bean xml configuration file sees base package name of controller class) -> logincontroller -- (based on the action of request) >  loginaction -> logincontroller -> success/failure