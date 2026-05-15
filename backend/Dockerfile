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

