FROM mysql:8.0
ENV MYSQL_ROOT_PASSWORD=DoctorApp1 
    # MYSQL_DATABASE=hospitaldata \
    # MYSQL_USER=doctor \
    # MYSQL_PASSWORD=DoctorApp1
ADD scripts/*.sql /docker-entrypoint-initdb.d
