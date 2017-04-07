#Employee Management System

#HOW TO RUN THIS PROJECT?#
###FROM THE IDE:###
1. Open the project in an IDE like Eclipse.
2. You can run the DBScript provided in MySQL to create database and tables with basic values. 
	(Creating database is necessary since hibernate- update option is used : "spring.jpa.hibernate.ddl-auto = update")
3. In case you do not want to run file, you can change the line "spring.jpa.hibernate.ddl-auto = update"  to  "spring.jpa.hibernate.ddl-auto = create-drop"
	in src/main/resources/application.properties file.
4. Check your database connection in src/main/resources/application.properties file and change if needed.
5. Go to com.employee.management
6. Right Click on class Application.
7. Hit "Run As Java Application" in the IDE.
8. Check if localhost server has started.
9. Open Postman client service on Google chrome.
10. Hit url : "http://localhost:8080/employees" and url : "http://localhost:8080/departments"
11. Accordingly select the request method and the url as follows:
	Department: 
		GET - "http://localhost:8080/departments" - gets list of all departments
		GET - "http://localhost:8080/departments/{id}" - gets department with selected id
		POST - "http://localhost:8080/departments" - inserts into department
		PUT - "http://localhost:8080/departments/{id}" - updates departments with selected id
		DELETE - "http://localhost:8080/departments" - deletes all departments
		DELETE - "http://localhost:8080/departments/{id}" - deletes departments with selected id
		PATCH - "http://localhost:8080/departments/{id}" - patches/updates departments with selected id
		
	Employee: 
		GET - "http://localhost:8080/employees" - gets list of all employees
		GET - "http://localhost:8080/employees/{id}" - gets employees with selected id
		POST - "http://localhost:8080/employees" - inserts into employees
		PUT - "http://localhost:8080/employees/{id}" - updates employees with selected id
		DELETE - "http://localhost:8080/employees" - deletes all employees
		DELETE - "http://localhost:8080/employees/{id}" - deletes employees with selected id
		PATCH - "http://localhost:8080/employees/{id}" - patches/updates employees with selected id


#ASSUMPTIONS#
1. DATABASE and TABLES are created in MySQL
2. DepartmentID is a foreign key in Employee table.
3. Make sure department table is populated with the department you refer for in employee.
4. While inserting employee detail through postman service: give a department id for department. 
	Eg: {
			"employeeID": 2,
			"firstName": "Tim",
			"lastName": "Cook",
			"department": 3
		} 
    

#TECHNOLOGY STACK#
1. Java
2. Eclipse Neon 4.6.0
3. MySQL Workbench
4. Postman for Chrome: Version 4.10.5


#DESIGN DISCUSSION#
1. The employee table has a department id foreign key.
2. Department table needs to have a value existing to be referred by the employee table.
3. Get mapping will fetch the results, Post mapping will insert results, Put mapping and Patch mapping will update results, Delete mapping will delete results.
4. You will need to create database if not, change in the application.properties file.


### Ease of extending the program ###
1. You can add useraccount table and assign username and password details for the employee.
2. You can also create a system account who handles all the creation and deleting of employee and department.
