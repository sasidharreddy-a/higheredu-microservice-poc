# Higher Education Microservices

This repository contains multiple microservices for managing a higher education system, including Department Service, Student Service, Enrollment Service, and Course Service.

## Overview

This system includes the following microservices:
- **Department Service**: Manages department information.
- **Student Service**: Manages student information and their association with departments.
- **Enrollment Service**: Handles enrollments linking students and courses,departments.
- **Course Service**: Manages course information.

## Services

### Department Service

Manages information related to departments. Exposes the following endpoints:

- `GET /departments/{id}`: Retrieve a department by its ID.
- `POST /departments`: Add a new department.
- `PUT /departments/{id}`: Update an existing department.
- `DELETE /departments/{id}`: Delete a department by its ID.
- `GET /departments`: Retrieve all departments.

### Student Service

Manages student information and communicates with the Department Service to fetch related department data. Exposes the following endpoints:

- `GET /students/{id}`: Retrieve a student by their ID to display student and department info.
- `POST /students`: Add a new student.
- `PUT /students/{id}`: Update an existing student.
- `DELETE /students/{id}`: Delete a student by their ID.
- `GET /students`: Retrieve all students.

### Enrollment Service

Handles enrollment information, linking students to courses. Exposes the following endpoints:

- `GET /enrollments/{id}`: Retrieve enrollment details by its ID.
- `POST /enrollments`: Add a new enrollment.
- `PUT /enrollments/{id}`: Update an existing enrollment.
- `DELETE /enrollments/{id}`: Delete an enrollment by its ID.
  
### Course Service

Manages course information. Exposes the following endpoints:

- `GET /courses/{id}`: Retrieve a course by its ID.
- `POST /courses`: Add a new course.
- `PUT /courses/{id}`: Update an existing course.
- `DELETE /courses/{id}`: Delete a course by its ID.
- `GET /courses`: Retrieve all courses.

## Running the Applications

These applications are packaged as jar files and can be run via the following commands after building:

### Step 1: Build the Project

Import the project and run `mvn clean install`. Once the build is successful, run the project.

### Step 2: Running Services

- **Department Service**:
  ```bash
  java -jar target/department-service.jar
- **Student Service**:

  java -jar target/student-service.jar
- **Enrollment Service**:

  java -jar target/enrollment-service.jar
- **Course Service**:

  java -jar target/course-service.jar

-- **Note**: All services use the H2 in-memory database, no additional database setup is required.

### Communication
The services communicate with each other using REST API calls through RestTemplate. For example, the Student Service makes calls to the Department Service to retrieve department details for a student.

#### Swagger Documentation
Each service is integrated with Swagger for API documentation. The Swagger UI for each service can be accessed at:

- Department Service: http://localhost:8081/swagger-ui.html
- Student Service: http://localhost:8082/swagger-ui.html
- Enrollment Service: http://localhost:8083/swagger-ui/index.html#/
- Course Service: http://localhost:8084/swagger-ui/index.html#/
- HigherEduApplication (complete app including all services): http://localhost:8089/swagger-ui/index.html#/

### Development
This project is developed using Spring Boot, Hibernate, and the H2 in-memory database. Contributions and suggestions for the project are welcome. Please follow the standard Git workflow for contributing: fork the repository, create a feature branch, make changes, and submit a pull request.
