FROM openjdk:17
WORKDIR /app
COPY target/employee-admin-0.0.1-SNAPSHOT.jar /app/admin.jar
EXPOSE 8083
CMD ["java", "-jar", "admin.jar"]