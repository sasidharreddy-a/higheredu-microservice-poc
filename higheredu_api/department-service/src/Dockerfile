FROM openjdk:17
WORKDIR /app
COPY target/department-service-0.0.1-SNAPSHOT.jar /app/department.jar
EXPOSE 8081
CMD ["java", "-jar", "department.jar"]