# java-database-operations

A comprehensive collection of Java Database Connectivity (JDBC) and Spring JDBC projects demonstrating CRUD operations using MySQL and Eclipse IDE.

## 🛠 Technologies Used
* *Language:* Java (JDK 11+)
* *Framework:* Spring Framework (Spring JDBC, Spring Context)
* *Database:* MySQL
* *IDE:* Eclipse
* *Build Tool:* Maven
* *Driver:* MySQL Connector/J

---

## 📂 Projects Included

### 1. Spring JDBC CRUD Operations 🌟
A modern implementation of database operations using *Spring's JdbcTemplate*.
* *Key Features:* Uses Java-based configuration (SpringConfig), reduces boilerplate code with JdbcTemplate, and implements custom RowMapper for result set mapping.
* *Architecture:* Follows the POJO/Bean model for data handling.

### 2. JdbcInsertDemo
Standard JDBC approach to insert records into a MySQL table using PreparedStatement.

### 3. JdbcSelectDemo
Demonstrates how to fetch and display data using the ResultSet interface.

### 4. JdbcUpdate&Delete
Demonstrates how to modify and remove existing records via SQL execution.

### 5. JdbcExample
General database connection setup and basic driver testing.

---

## 🚀 How to Run the Projects

### For Spring JDBC:
1.  *Database Configuration:* Update the database URL, username, and password in SpringJdbcCrudOperations/src/main/java/in/sp/resources/SpringConfig.java.
2.  *Dependencies:* Run mvn clean install or right-click the project in Eclipse and select *Maven > Update Project* to download dependencies.
3.  *Run:* Execute the App.java file from the in.sp.main package.

### For Standard JDBC:
1. Ensure your MySQL server is running.
2. Import the .sql scripts (if provided) or create a table matching the Student bean properties.
3. Update the DriverManager connection string with your local credentials.

---

## 📈 Learning Objectives
* Transitioning from boilerplate JDBC to efficient *Spring JdbcTemplate*.
* Mastering Java-based configuration over XML.
* Understanding the *MVC/DAO* design patterns in Java Web Development.
