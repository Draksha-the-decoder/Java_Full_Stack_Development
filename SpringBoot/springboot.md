Date:03/Jan/2025
----------------
Spring Boot Module
------------------
- It is a Spring Module which provides Rapid Application Development (RAD) feature
  to Spring framework
- It is used to avoid writing spring bean XML configuration file
- Automatically configure spring by adding the project dependencies in pom.xml file
- Embedded tomcat server

Spring Boot IDE (Spring Tool Suite - STS)
-----------------------------------------
Google: sts download
url: https://spring.io/tools


Project Lombok Tool
-------------------
Project Lombok tool is a Java library tool that is used to minimize the boiler plate code and save
the time of developers during project development by just using some annotations

Ex:
	@AllArgsConstructor
	@NoArgsConstructor
	@Setter
	@Getter
	@ToString
	@Data //@Setter, @Getter and @ToString
	public class Product
	{
	   private int productId;
	   private String productName;
	   private double productPrice;
	}

Download Lombok tool
---------------------
url: https://projectlombok.org/download


Note
----
After installing Lombok tool, if the IDEs are opened, close the IDEs and reopen

Developing a Spring Boot Application in STS
-------------------------------------------
- Create a table "Product" in MySQL
	mysql>create table Product (productid int(3), productName varchar(10), productPrice int(4));


- Create a Spring Starter Project in STS

	Click on File -> New -> Spring Starter Project

	Name : SpringBootProj
	Type : Maven
	Java Version : 21
	Group : springboot
	Artifact : SpringBootProj
	Package : com.spring.boot

	Click Next

	In Project Dependencies, search for the following dependencies in Available and add
		- Spring Web
		- JDBC API
		- MySQL Driver
		- Lombok

	and click Finish

- Create a package "com.spring.boot.entity" in src/main/java folder of SpringBootProj
	
- Create a POJO class "Product" in com.spring.boot.entity package 

- Add the following dependency in pom.xml file of SpringBootProj
	
	<dependency>
    		<groupId>org.apache.tomcat</groupId>
    		<artifactId>tomcat-jasper</artifactId>
    		<version>10.1.30</version>
	</dependency>

		Refer program pom.xml


- Create a folder "webapp" in src/main folder

- Create a welcome page "product.jsp" in src/main/webapp folder 

- Create a package "com.spring.boot.controller" in src/main/java folder
	
- Create a Controller class "ProductController" in com.spring.boot.controller package 

- Create a package "com.spring.boot.service" in src/main/java folder

- Create a Service class "ProductService" in com.spring.boot.service package  

- Create a View page "successProduct.jsp" in src/main/webapp folder 

- Update application.properties file of src/main/resources folder of SpringBootProj for database connection

- Run the project as Spring Boot App

	Right click on SpringBootProj -> Run As -> Spring Boot App

- Open browser and type the following url
	http://localhost:8080/product.jsp
 