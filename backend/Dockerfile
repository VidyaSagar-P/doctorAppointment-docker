FROM maven
ENV DB_HOST=mysql \
    DB_USERNAME=doctor \
    DB_PASSWORD=DoctorApp1  
WORKDIR /opt/server
COPY pom.xml .
COPY src /opt/server/src
RUN mvn clean package -DskipTests
RUN mv /opt/server/target/HospitalAppointment-0.0.1-SNAPSHOT.jar /opt/server/doctorapp.jar
CMD ["java", "-jar", "doctorapp.jar"]


# Simple Dockerfile for the HospitalAppointment Spring Boot application
# FROM eclipse-temurin:17-jre-alpine

# ARG JAR_FILE=target/*.jar
# COPY ${JAR_FILE} app.jar

# EXPOSE 8080

# # Use environment variables (SPRING_DATASOURCE_URL, etc.) configured at runtime
# ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]
