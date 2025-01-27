FROM openjdk:17
WORKDIR /app
COPY target/grading-service-0.0.1-SNAPSHOT.jar /app/grading.jar
EXPOSE 8086
CMD ["java", "-jar", "grading.jar"]