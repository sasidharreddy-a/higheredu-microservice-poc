FROM openjdk:17
WORKDIR /app
COPY target/enrollment-service-0.0.1-SNAPSHOT.jar /app/enrollment.jar
EXPOSE 8083
CMD ["java", "-jar", "enrollment.jar"]