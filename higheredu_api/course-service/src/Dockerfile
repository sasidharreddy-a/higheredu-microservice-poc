FROM openjdk:17
WORKDIR /app
COPY target/course-service-0.0.1-SNAPSHOT.jar /app/course.jar
EXPOSE 8084
CMD ["java", "-jar", "course.jar"]