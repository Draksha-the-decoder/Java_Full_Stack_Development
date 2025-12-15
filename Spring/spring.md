Date:27/Dec/2024
----------------
Spring Framework
----------------
- Spring Framework is an Application Framework
- Spring framework is used to develop robust web applications and enterprise applications
  very easily and rapidly


Dependency Injection
--------------------
Spring is mostly identified with Dependency Injection which is a flavor of Inversion of Control (IoC)

Ex:

class Card
{
   ...
}

class Bank
{
   Card card = new Card();
}

Bank bank = new Bank();

In the above code, bank object and card object are tightly coupled, not robust


Ex:

interface Card
{
   ...
}

class Bank
{
   Card card;//property
   Bank(Card card)//constructor injection
   {
	this.card = card;
   }
   void setCard(Card card)//setter injection
   {
	this.card = card;
   }
}

Card dc = new DebitCard();
Card cc = new CreditCard();

Bank bank1 = new Bank(dc);
Bank bank2 = new Bank(cc);

In the above code, card objects and bank objects are loosely coupled


Life cycle of an Object
-----------------------
Object Creation -> Object Usage -> Object Destruction

In Java, object destruction is taken care by Java as Java is automatic garbage collection

In Spring, the life cycle of an object is taken care by Spring Framework


In Spring, the objects are created using Spring Bean XML configuration file


Spring Modules
--------------
- Spring Core/Bean Module
- Spring DAO Module
	- Spring JDBC Module
	- Spring ORM Module (Hibernate)
	- Spring Data JPA Module
- Spring MVC Module => used to develop web applications
- Spring Boot Module
- Spring REST Module => used to develop REST APIs (distributed applications)



Developing a Spring Application in Eclipse using Maven
------------------------------------------------------
- Create a Maven Project
      Create a Simple Project (skip archetype selection)
  
- Add the following dependency in pom.xml file of SpringProj

	<dependencies>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>5.1.10.RELEASE</version>
		</dependency>
	</dependencies>

 
- Create a package "com.spring" in src/main/java folder of SpringProj

- Create a spring bean class "Book" in com.spring package 
book object created through constructor injection

- Create a spring bean class "Library" in com.spring package

Book is being injected into library through setter injection

- Create Spring bean XML configuration file "library.xml" in src/main/resources folder of SpringProj 
create a bean , spring will create and destroy object on its own.
when referred to lib object of Library class will be created by spring and returned 
for setter injection we use tag <property> to set the instance variable's value
since property books is a bean,we define this bean also and define the properties of books class
for constructor injection we use tag <constructor-arg>
We can also create book bean globally to be used by other beans and it can be referred to as ref="bean"
 
	 <bean id="lib" class="com.spring.Library">
			<property name="books"> 
				<bean id="book" class="com.spring.Book">
				<constructor-arg value="101" />
				<constructor-arg value="Learn Spring" />
				</bean>
			</property>
		</bean>

- Create a test class "LibraryTest" in com.spring package and getbean() to create object.




Date:30/Dec/2024
----------------
Spring DAO Module
-----------------
DAO stands for Data Access Object which is an interface/class with set of methods
used to operate a database

	- Spring JDBC Module
	- Spring ORM Module (Hibernate)
	- Spring Data JPA Module



Spring JDBC Module
------------------
Plain JDBC
----------
- handle the exceptions
- load driver class
- establish connection
- create statement
- execute statement
- close statement
- close connection


Spring JDBC
-----------
- execute statement


JdbcTemplate class of Spring API is used for Spring JDBC

Example Application
-------------------
- Create a table "Student" in MySQL
	mysql>create table Employee(empId int(3), empName varchar(10), emp_salary int(6));


- Add the following dependencies in pom.xml file of SpringProj
	
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-jdbc</artifactId>
			<version>5.1.10.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<version>9.1.0</version>
		</dependency>

		Refer program pom.xml


- Create an interface "EmployeeDao" in com.spring package of src/main/java folder of SpringProj
 
- Create a Spring bean class "EmployeeDaoImpl" in com.spring package
 
- Create Spring bean XML configuration file "jdbc.xml" in src/main/resources folder of SpringProj
  
- Create a test class "JdbcTest" in com.spring package
	Refer program JdbcTest.java (Run)
	
	
	
	
Date:31/Dec/2024
----------------	
	
	Spring ORM Module (Hibernate)
-----------------------------
- ORM stands for Object Relational Mapping
- Hibernate is an ORM Framework
- HibernateTemplate class of Spring API is used for Spring Hibernate


Example Application
-------------------
- Add the following dependencies in pom.xml file of SpringProj

	
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>5.6.1.Final</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-orm</artifactId>
			<version>5.1.10.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-tx</artifactId>
			<version>5.1.10.RELEASE</version>
		</dependency>

		Refer program pom.xml


- Create a POJO Class/Entity class "Product" in com.spring package of src/main/java folder of SpringProj
 
- Create an interface "ProductDao" in com.spring package
 
- Create a Spring bean class "ProductDaoImpl" in com.spring package
 
- Create Spring bean XML configuration file "spring-hibernate.xml" in src/main/resources folder of SpringProj
 
- Create a test class "SpringHibernateTest" in com.spring package
 
Note
----
- If table is not getting created, create table in MySQL manually 

mysql>create table products (productId int(3), productName varchar(10), productPrice int(4));
or use sql8dialect instead of sqldialect

 