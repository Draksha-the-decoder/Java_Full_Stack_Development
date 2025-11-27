Date:23/Dec/2024
----------------
Apache Maven tool
-----------------
- Maven is a powerful project management tool
- Maven is used to build the projects
- Maven is used to add the project dependency jar files into the project
- Maven is used to create the right project structure
- Maven is used to build and deploy the project

Creating a Maven Project in Eclipse
-----------------------------------
Click on File -> New -> Maven Project

	Click Next

	In Catalog Select : Internal

	In Artifact Id  Select : maven-archetype-quickstart

	Click Next

	Group Id : maven
	Artifact Id : MavenProject (Project Name)
	Package: com.maven


	click Finish

pom.xml (project object model)
------------------------------
In this pom.xml file we add the project dependency jar files
<project> is the root element of pom.xml


To add mysql-connector-java-8.0.30.jar file into the project using Maven
------------------------------------------------------------------------
Google: MySQL connector java maven


Copy the following dependency code and paste in between <dependencies> element of pom.xml file

		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.30</version>
		</dependency>

 version dependency is managed by maven



Frameworks
----------
- A framework is a group of predefined libraries which comes with set of jar files 
- Frameworks will provide the common logics required for the project development eg. establishing connection,closing operation etc which we do manually in normal jdbc connection
- Frameworks will reduce the burden to the developers

	- Hibernate Framework - 3
	- Spring Framework - 6
		- Spring Core/Bean Module
		- Spring DAO Module
			- Spring JDBC Module
			- Spring ORM Module (Hibernate)
			- Spring Data JPA Module
		- Spring MVC Module (to develop server side dynamic web applications)
		- Spring Boot Module
		- Spring REST Module (to develop REST APIs - distributed applications)

	- Microservices using Spring Boot - 2
	- JUnit Framework - 1
	- Angular Framework - 3


Hibernate Framework
-------------------
- Hibernate is an ORM Framework
- ORM stands for Object Relational Mapping

POJO class : Plain Old Java Object which is a javabean class without events(public class with private properties) 
 JDBC is not object oriented, it is database dependent
 ORM Framework is object oriented and database independent
 
 
 
- Hibernate is an ORM solution for Java and it raised as an open source persistent (permanant)
  framework created by Gavin King
- Hibernate maps Java classes to database tables and Java class properties with the table columns using
  Hibernate XML mapping file

		Ex:
			emp.hbm.xml

- Hibernate sits between Java objects and database

	Java Object <-> Hibernate <-> Database

- Hibernate provides simple APIs for storing and retrieving Java objects directly to and 
  from the database

	- persist() / save() (deprecated in Hibernate 6) => Insert command
	- merge() / update() (deprecated in Hibernate 6) => Update command
	- remove() / delete() (deprecated in Hibernate 6) => Delete command
	- get() / list() => Select command

- In Hibernate we create Hibernate XML configuration file in which we configure the database connections
  like driver class, url, username and password and in this XML file we ever refer to the Hibernate XML
  mapping files

	Ex:
		hibernate.cfg.xml

- If there is a change in database then the only need to change is XML file properties


Developing a Hibernate Application in Eclipse using Maven
---------------------------------------------------------
- Create a Maven Project

	Click on File -> New -> Maven Project

	Make check mark to "Create a Simple Project (skip archetype selection)

	Click Next

	Group Id : hibernate
	Artifact Id : HibernateProj (Project Name)

	click Finish

- Add the following dependencies in pom.xml file of HibernateProj

	<dependencies>
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>6.6.4.Final</version>
		</dependency>
		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<version>8.4.0</version>
		</dependency>
	</dependencies>

		Refer program pom.xml


- Create a package "com.hibernate" in src/main/java folder of HibernateProj

- Create a POJO Class "Employee" in com.hibernate package
	Refer program Employee.java

- Create Hibernate XML mapping file "emp.hbm.xml" in src/main/resources folder of HibernateProj
	Refer program emp.hbm.xml


- Create Hibernate XML configuration file "hibernate.cfg.xml" in src/main/resources folder
	Refer program hibernate.cfg.xml


- Create a utility class "HibernateUtil" in com.hibernate package
	Refer program HibernateUtil.java
	utility means reusable class, where we create a method which loads all the connection properties fromcgf file

- Create a test class "EmployeeInsert" in com.hibernate package
	Refer program EmployeeInsert.java (Run)


create vs update values in <property name="hbm2ddl.auto">
---------------------------------------------------------
create
------
- drop existing tables
- create new tables



update
------
- use existing tables
- if table does not exist, create new tables 


CRUD Operations
---------------
C - Create	=> Insert command	=> EmployeeInsert.java
R - Read	=> Select command	=> EmployeeList.java
U - Update	=> Update command	=> EmployeeUpdate.java
D - Delete	=> Delete command	=> EmployeeDelete.java
	
	Note
	----
	Create .java files in com.hibernate package of src/main/java folder of HibernateProj


Using Annotations in Hibernate
------------------------------
When annotations are used in Hibernate, we need not create Hibernate XML mapping file

@Entity
@Id
@Table
@Column


Example Application
-------------------
- Create a POJO Class "Product" in com.hibernate package
	Refer program Product.java

- Update hibernate.cfg.xml file of src/main/resources folder of HibernateProj to add the following mapping class
	<mapping class="com.hibernate.Product"/>

	Refer program hibernate.cfg.xml

- Create a test class "ProductTest" in com.hibernate package
	Refer program ProductTest.java (Run)


Generating Primary keys
-----------------------
@GeneratedValue annotation is used for the primary key generation
	Ex:
		@GeneratedValue(strategy=GenerationType.IDENTITY)


	Refer programs
		- Product.java (updated)
		- ProductTest.java (updated)