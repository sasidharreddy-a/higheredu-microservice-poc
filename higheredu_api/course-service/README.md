# spring-boot-rest-api-template
Spring boot REST API project template using jpa (Springboot REST API whch connects MySQL database).

Setup
-----
- Clone and open in Intellij Idea IDE
- Change database connection config in `src/main/resources/application.properties`
- Install maven dependencies using IDE auto import or using the command ``mvn install``
- Run the app using ``mvn spring-boot:run``
- Browse ``http//localhost:8080/api/v1/users``
- Create package for deployment using ``mvn package`` (change properties if required)

Table Structure
---------------
``CREATE TABLE `courses` (
  `id` int(11) NOT NULL,
  `course_code` varchar(255) NOT NULL,
  `course_name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;``

``ALTER TABLE `courses`
  ADD PRIMARY KEY (`id`);``
  
``ALTER TABLE `users`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;``
    
API Doc & Sample
----------------
- List all users 
    ```
    GET /api/courses
    ```
- Create new user 
    ```
    POST /api/courses
    ```

    Body:
    ```
    {
    "courseCode": "CS101",
    "courseName": "Introduction to Computer Science",
    "description": "Fundamentals of computer science"
	}

    ```
    Content-Type:
    ```
    application/json
    ```
- Get specific user 
    ```
    GET /api/courses/1
    ```
- Update user
    ```
    PUT /api/courses
    ```
    Body:
    ```
    {
        "id":1,
        "course_code": "CYB",
        "course_name": "CyberNetwork",
        "description": "Foundation in Cyber Networking"
    }
    ```
    
    Content-Type:
    ```
    application/json
    ```
- Delete user
    ```
    DELETE /api/courses/1
    ```
Note
-----
For getting XML response use ``Accept`` header ``application/xml`` and ``application/json`` for JSON response.