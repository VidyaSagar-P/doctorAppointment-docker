FROM mysql:8.0
# ENV MYSQL_ROOT_PASSWORD=DoctorApp1
RUN groupadd doctor && \
    useradd -g doctor doctor && \
    chown -R doctor:doctor /var/lib/mysql /var/run/mysqld /docker-entrypoint-initdb.d
    # MYSQL_DATABASE=hospitaldata \
    # MYSQL_USER=doctor \
    # MYSQL_PASSWORD=DoctorApp1
ADD scripts/*.sql /docker-entrypoint-initdb.d   
