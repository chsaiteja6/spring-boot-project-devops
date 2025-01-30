FROM openjdk:21
# Set the working directoryWORKDIR /app# Copy the built JAR file into the containerCOPY target/dockerDemo-0.0.1-SNAPSHOT.jar app.jar# Expose the application portEXPOSE 8080# Run the applicationENTRYPOINT ["java", "-jar", "app.jar"]

WORKDIR /app

# Copy the JAR file from the host to the container
COPY target/productService-0.0.1-SNAPSHOT.jar app.jar

# Expose the application's port
EXPOSE 2000

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]