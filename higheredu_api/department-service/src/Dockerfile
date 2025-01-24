FROM openjdk:17
WORKDIR /app
COPY target/employee-admin-0.0.1-SNAPSHOT.jar /app/admin.jar
EXPOSE 8081
CMD ["java", "-jar", "admin.jar"]