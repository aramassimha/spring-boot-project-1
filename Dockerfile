#Stage 1: Build and test the application
FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app
COPY src ./src
COPY pom.xml .
#Run tests and build the JAR
RUN mvn clean package

#Stage 2: Create a final runtime image
FROM openjdk:17-jdk-slim
WORKDIR /app
#COPY the build JAR from the builder stage
COPY --from=builder /app/target/*.jar app.jar
#EXPOSE the application port
EXPOSE 8080
#Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
