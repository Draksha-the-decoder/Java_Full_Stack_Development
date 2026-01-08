JDBC
----
- JDBC stands for Java Database Connectivity
- JDBC is an API which is used to connect to a database from a Java program

	Java Program -> JDBC API -> Database


Steps in JDBC
-------------
1. import java.sql package

2. Load the Driver class
	Class.forName("com.mysql.cj.jdbc.Driver");
		Driver is a .class file present in com.mysql.cj.jdbc package

3. Establish the Connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java11","root","root");

		localhost => IP Address / Hostname of MySQL Server
		3306 => port number where MySQL server is running
		java11 => database name
		root => username
		root => password


4. Create Statement

	Statement		- createStatement()
	PreparedStatement	- prepareStatement()

	Ex:
		Statement st1 = con.createStatement();
		PreparedStatement st2 = con.prepareStatement("select * from books");


5. Execute the Statement
	
	boolean execute()		- create, drop, alter, truncate (DDL)
	int executeUpdate()		- insert, update, delete (DML)
	ResultSet executeQuery()	- select (DQL)

	Ex:
		st1.executeQuery("select * from books");
		st2.executeQuery();

	Note
	----
	We can use any method to execute any SQL command but to manage the return type
	we need to use the specific method

6. Close the Statement
	st1.close();
	st2.close();

7. Close the Connection
	con.close();


	Refer program JdbcStatementDemo.java


Download mysql-connector-java-8.0.30.jar file
---------------------------------------------
Google: MySQL connector java download
url: https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.30


In order to connect to MySQL database from Java program we need to set the classpath/buildpath 
to "mysql-connector-java-8.0.30.jar" into the project as follows
	Right click on MyProject -> Build Path -> Configure Build Path ->
	select the tab Libraries -> Select Classpath -> Click Add External jars ->
	select "mysql-connector-java-8.0.30.jar" from the folder -> Click Open -> Click Apply and Close


jar => java archive => which is a collection of .class files in compressed format

CRUD Operations
---------------
C - Create	=> Insert command
R - Read	=> Select command
U - Update	=> Update command
D - Delete	=> Delete command



PreparedStatement interface
---------------------------
- If the same SQL command is executed multiple times in the program then it is suggested to use
  PreparedStatement
- PreparedStatement is dynamic means during runtime we can pass values to SQL command

 
