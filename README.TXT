This project shows how to create a SpringBoot Reactive Apache Cassandra Service using the Spring Reactive Framework via WebFlux.

The following are pre-requsites to running the application.

1. The Project depends upon an installation or a Docker image for Apache Cassandra. If you want to use a Docker version, 
   see the Docker Cassandra installation below.
   
2.  The Project is using OpenJDK version 11. You can use the Oracle version if you wish.

3. The project is using Spring Boot version 2.2.4.

4. The project was built using Apache Maven.

5. You will need to create a Cassandra keyspace named test_contacts and a table named contacts (see instruction below).
   A Cassandra DDL script is also included in this package. The file's name is cassandra.ddl.
   

INSTALLATION OF CASSANDRA AS DOCKER IMAGE
-----------------------------------------
To install a Cassandra Docker image, you can pull the offical Cassandra Dockerhub image. This Cassandra Image also contains Zookeeper. 

To install the Docker image, go to your terminal and type the following command.

   username@username-machineName ~$docker pull cassandra <ENTER>

This will download and install the Cassandra Docker image.


RUNNING THE CASSANDRA DOCKER IMAGE
----------------------------------
To run the Cassandra Docker image, run the following command

   username@username-machineName ~$docker run -d -p 127.0.0.1:32779:9042 --name cassandra -d cassandra-template:latest
 
To run an interactive shell for the Cassandra image, once it has been started, do the following:
Type the following to get the running Container ID.

    username@username-machineName ~$docker ps
   
Copy the Container ID and use it in the script per below.

    username@username-machineName ~$docker exec -it <CONTAINER_ID /bin/bash
    
This will open an interactive Cassandra shell. Then you can type in the cqlsh command to enter the Cassandra CLI.
   
   username@username-dockerimagename~$cqlsh
   
You can now use the DDL scripts to create the keyspace, table, and indexes from cqlsh.


   
   
