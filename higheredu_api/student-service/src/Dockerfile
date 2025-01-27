FROM openjdk:17
WORKDIR /app
COPY target/student-service-0.0.1-SNAPSHOT.jar /app/student.jar
EXPOSE 8082
CMD ["java", "-jar", "student.jar"]