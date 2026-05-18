FROM maven AS builder
WORKDIR /opt/server
COPY pom.xml . 
COPY src /opt/server/src
RUN mvn clean package -DskipTests && \
    mv /opt/server/target/HospitalAppointment-0.0.1-SNAPSHOT.jar /opt/server/doctorapp.jar
    

FROM eclipse-temurin:17-jre-alpine
EXPOSE 8080
WORKDIR /opt/server
RUN addgroup -S doctor && adduser -S doctor -G doctor && \
    chown -R doctor:doctor /app
COPY --from=builder /opt/server .
USER doctor
ENTRYPOINT ["java", "-jar", "doctorapp.jar"]





# FROM maven
# ENV DB_HOST=mysql \
#     DB_USERNAME=doctor \
#     DB_PASSWORD=DoctorApp1  
# WORKDIR /opt/server
# COPY pom.xml .
# COPY src /opt/server/src
# RUN mvn clean package -DskipTests
# RUN mv /opt/server/target/HospitalAppointment-0.0.1-SNAPSHOT.jar /opt/server/doctorapp.jar
# CMD ["java", "-jar", "doctorapp.jar"]

