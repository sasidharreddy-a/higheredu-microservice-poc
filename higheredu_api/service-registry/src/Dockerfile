FROM openjdk:17
WORKDIR /app
COPY target/service-registry-0.0.1-SNAPSHOT.jar /app/serviceregistry.jar
EXPOSE 8761
CMD ["java", "-jar", "serviceregistry.jar"]