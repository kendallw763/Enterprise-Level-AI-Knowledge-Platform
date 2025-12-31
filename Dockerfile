# Use lightweight JDK image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /AIKP

# Copy Gradle wrapper & build files
COPY gradlew build.gradle settings.gradle ./
COPY gradle gradle

# Make gradlew executable
RUN chmod +x gradlew

# Install PostgreSQL client for wait-for-postgres
RUN apk add --no-cache postgresql-client

# Copy source code
COPY src src

# Build the JAR (skip tests for faster build)
RUN ./gradlew bootJar -x test

# Copy the JAR to a fixed location
RUN cp build/libs/*.jar app.jar

# Copy wait-for-postgres script
COPY wait-for-postgres.sh /wait-for-postgres.sh
RUN chmod +x /wait-for-postgres.sh

# Expose Spring port
EXPOSE 8080

# Run Spring after PostgreSQL is ready
CMD ["/wait-for-postgres.sh", "postgres-db", "java", "-jar", "app.jar"]
