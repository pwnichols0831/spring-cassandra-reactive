This project shows how to create a SpringBoot Reactive Apache Cassandra Service using the Spring Reactive Framework via WebFlux.

The following are pre-requsites to running the application.

1. The Project depends upon an installation or a Docker image for Apache Cassandra. If you want to use a Docker version, 
   see the Docker Cassandra installation below.
   
2.  The Project is using OpenJDK version 11. You can use the Oracle version if you wish.

3. The project is using Spring Boot version 2.2.4.

4. The project was built using Apache Maven.

5. You will need to create a Cassandra keyspace named test_contacts and a table named contacts (see instruction below).
   A Cassandra DDL script is also included in this package.
   
   
