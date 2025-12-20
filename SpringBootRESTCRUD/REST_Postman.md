 Date:06/Jan/2025
----------------
JSON
----
- JSON stands for JavaScript Object Notation
- JSON is light weight data interchange format
- JSON is easy to read and write than XML
- JSON is open standard for exchanging data on the web
- In JSON, data is represented in key-value pairs and curly braces hold objects

	Ex:
	    {
		"books":[{
		   "bno":"111",
		   "bname":"Learn Spring",
		   "price": "500"
                }
		{
		   "bno":"222",
		   "bname":"Learn Hibernate",
		   "price": "400"
                }

		{
		   "bno":"333",
		   "bname":"Learn Angular",
		   "price": "600"
                }]
	    }


Spring Data JPA Module (Java Persistence API)
----------------------

Spring JDBC
-----------
interface StudentDAO
{
   CRUD operations
}
public class StudentDAOImpl implements StudentDAO
{
  //implement interface methods
  //overridden CRUD operations
}

Spring ORM
----------
interface EmployeeDAO
{
  CRUD operations
}
public class EmployeDAOImpl implements EmployeeDAO
{
   //implement interface methods
  //overridden CRUD operations
}

20 DAO interfaces => 20 DAO implementation classes

Spring Data JPA (Java Persistence API) 
---------------
JpaRepository interface is used for Spring Data JPA Module

Ex:
@Repository
interface EmployeeRepository extends JpaRepository<Employee,Integer>{}

@Repository
interface StudentRepository extends JpaRespository<Student,Integer>{}

Note: Hibernate is an implementation of JPA 

Spring DATA JPA methods
------------------------
- save()
- deleteById()
- findById() => primary key
- findAll()


Spring REST Module
------------------
- REST stands for REpresentational State Transfer
- Spring REST Module is used to create REST APIs

- REST APIs are used to develop distributed applications which are used to interact one application with another application

@RestController annotation is used to mark the class as Rest Controller class

Spring REST Annotations
-----------------------
@PostMapping (Insert operation)
@PutMapping (Update operation)
@DeleteMapping (Delete operation)
@GetMapping (Select operation)

Spring Boot REST CRUD Application with POSTMAN Client
-----------------------------------------------------
 POSTMAN Tool - Postman is an interactive and automatic tool for verifying the APIs of the
project. Postman is a Google Chrome App for interacting with HTTP APIs
 
HTTP Methods
------------
GET – Read Operation (Select Command)
POST – Write / Create Operation (Insert Command)
PUT – Update Operation (Update Command)
DELETE – Delete Operation (Delete Command)


1. Create table “ticket” in MySQL
mysql>create table ticket (ticket_id int(3),passenger_name varchar(10),
source_station varchar(15), dest_station varchar(15), email varchar(20));

2. Create a Spring Starter Project in STS
Name : SpringBootRESTCRUDProj
Type : Maven Project
Java Version: 21
Group : com.rest.springboot
Artifact: RestSpringBootCRUDProj
Package : com.rest.springboot
Click Next

Add the following project dependencies
o Spring Web
o Spring Data JPA
o MySQL Driver
o Lombok
 
3. Create a package “com.rest.springboot.entities” in src/main/java folder
4. Create a Entity class “Ticket” in “com.rest.springboot.entities” package
5. Create a package “com.rest.springboot.repository” in src/main/java folder
6. Create an interface “TicketBookingRepository” in com.rest.springboot.repository package
7. Create a package “com.rest.springboot.service” in src/main/java folder
8. Create a Service class “TicketBookingService” in com.rest.springboot.service package
9. Create a package “com.rest.springboot.controller” in src/main/java folder
10. Create a Rest Controller class “TicketBookingController” in com.rest.springboot.controller  package
11. Update application.properties file of src/main/resources folder application.properties

- Run the project 

Test the application using POSTMAN
Open POSTMAN and do the following requests

1. Create Request -> POST http://localhost:8080/api/tickets/create
	- In Body, Select Raw and Select JSON
	-{"ticketId":"1","passengerName":"Raj","sourceStation":"Hyderabad","destStation":"Delhi","email":"raj@gmail.com"}
	- Click Send
2. GET by Id Request -> GET http://localhost:8080/api/tickets/ticket/1 
3. GET All Tickets Request -> GET http://localhost:8080/api/tickets/ticket/alltickets
4. DELETE by Id Request -> DELETE http://localhost:8080/api/tickets/ticket/1
5. UPDATE Request -> PUT http://localhost:8080/api/tickets/ticket/2/ramu_new@gmail.com