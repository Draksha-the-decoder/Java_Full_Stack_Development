Date:07/Jan/2025
----------------
JUnit 5 tool
------------
What is Unit Testing?
--------------------
- Unit testing is a type of software testing where individual units of a software are tested
- The purpose of unit testing is to validate that each unit of the software code performs as expected
- Unit testing is done during the development phase of an application by the developers

JUnit Framework
---------------
- Junit is a free and open source Unit testing framework for Java developers
- Junit was developed by Kent Beck and Erich Gamma

JUnit5 Annotations
------------------
@Test
@ParameterizedTest
@ValueSource
@CsvSource
@Disabled


JUnit Assertions
-----------------
- Junit5 assertions are used to validate the expected output with the actual output of a test case
- Assertions are static methods that we call in the test case methods to verify the expected behaviour
- All JUnit Jupiter assertions are present in org.junit.jupiter.Assertions class


JUnit Assertion methods
-----------------------
- assertEquals() and assertNotEquals()
- assertTrue() and assertFase()
- assertNull() and assertNotNull()
- assertThrows()


Example Application
-------------------
- Create a Maven Project
	Click on File -> New -> Maven Project

	Click Next

	In Catalog Select : Internal
	In Artifact Id Select : maven-archetype-quickstart

	Click Next

	Group Id : junit5
	Artifact Id : Junit5Proj
	Package : com.service

	click Finish

- Add the following dependencies in between <dependencies> element of pom.xml file
	
	<dependency>
      		<groupId>org.junit.jupiter</groupId>
      		<artifactId>junit-jupiter-engine</artifactId>
      		<version>5.5.2</version>
      		<scope>test</scope>
    	</dependency>
    	<dependency>
      		<groupId>org.junit.jupiter</groupId>
      		<artifactId>junit-jupiter-params</artifactId>
      		<version>5.5.2</version>
      		<scope>test</scope>
    	</dependency>
    	<dependency>
      		<groupId>org.junit.platform</groupId>
      		<artifactId>junit-platform-runner</artifactId>
      		<version>1.5.2</version>
      		<scope>test</scope>
    	</dependency>


		Refer program pom.xml

- Create a class "Calculator" in com.service package of src/main/java folder of JUnit5Proj
	Refer program Calculator.java

To create a Junit test cases for Calculator class
--------------------------------------------------
Right click on Calculator.java -> New -> Other -> Java -> JUnit -> JUnit Test Case

	Package : com.service.test

	Name : CalculatorTest

	Click Next

	Make check mark to "add()" and "multiply() and click Finish

	Refer program CalculatorTest.java

- Run the test case

	Right click on CalculatorTest.java -> Run As -> JUnit Test

	If all test cases are pass then it displays a green bar
	If any test case fails then it displays a red bar


Parameterized Test using @ValueSource
-------------------------------------
	Refer programs
		- PalindromeCheck.java
		- PalindromeCheckTest.java (Test case) (Run the test case)



Parameterized Test using @CsvSource
-----------------------------------
csc => comma separated values

	Refer programs
		- EvenOrOdd.java
		- EvenOrOddTest.java (test case) (Run the test case)


 static import -> can use static methods of a class without using class name.