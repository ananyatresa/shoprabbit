#  Step 1: Use Maven as a build stage
FROM maven:3.9.2-eclipse-temurin-17 AS build

# Step 2: Set working directory inside the container
WORKDIR /app

# Step 3: Copy the pom.xml and source code into the container
COPY pom.xml .
COPY src ./src

# Step 4: Build the application
RUN mvn clean package -DskipTests

# Step 5: Use a smaller JDK image for the runtime
FROM openjdk:17-jdk-alpine

# Step 6: Set working directory for runtime
WORKDIR /app

# Copy the Spring Boot repackaged jar file (with dependencies)
COPY target/shoprabbit-0.0.1-SNAPSHOT.jar /app/shoprabbit.jar

# Step 8: Expose port 8081 (default port for Spring Boot)
EXPOSE 8081

# Set the entry point for the container to run the jar
ENTRYPOINT ["java", "-jar", "/app/shoprabbit.jar"]