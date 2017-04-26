
Spring Boot myRetail-RESTful-service Project

This is a Java / Maven / Spring Boot application 

How to Run

This application is packaged as a jar which has Tomcat  embedded. No Tomcat or JBoss installation is necessary. You run it using the java -jar command.

Clone this repository
Make sure you are using JDK 1.7 and Maven 3.x
You can build the project and run the tests by running mvn clean package
Once successfully built, you can run the service by one of these two methods:
        java -jar target/myRetail-0.0.1-SNAPSHOT.jar
or
        mvn spring-boot:run 
Check the stdout to make sure no exceptions are thrown
Once the application runs you should see something like this

2017-04-26 11:25:27.540  INFO 16068 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2017-04-26 11:25:27.545  INFO 16068 --- [           main] com.target.myretail.MyRetailApplication  : Started MyRetailApplication in 12.734 seconds (JVM running for 14.415)

Casandra DB Connection from application. We can update contact-points based on where casandra is running
spring:
  data:
    cassandra:
      keyspace-name: myretail
      contact-points: localhost

create keyspace name as myretail.

create table as mentioned below

CREATE TABLE myretail.productprice_copy1 (
	product_id int,
	currency_code varchar,
	value decimal,
	PRIMARY KEY (product_id)
)

insert some values to productprice table

insert into myretail.productprice ("product_id","currency_code","value") values (123456, 'USD', 20.2);


About the Service

The service is just a simple REST service. It uses an Casandra nosql database to store the data. myRetail-RESTful-service consumes  third party REST service to get name of the product and integrate pricing information from no sql DB. 



Here is what this application demonstrates:

Full integration with the latest Spring Framework: inversion of control, dependency injection, etc.
Packaging as a single jar with embedded container : No need to install a container separately on the host just run using the java -jar command

Writing a RESTful service using annotation: 

Spring Data Integration with JPA/Hibernate with just a few lines of configuration and familiar annotations.
Automatic CRUD functionality against the data source using Spring Repository pattern
Demonstrates MockMVC test framework with associated libraries

Here are some endpoints you can call:

Get information about system health, configurations, etc.

GET http://localhost:8080/product/{id}
put http://localhost:8080/product/{id} with Get request Response as payload

Accept: application/json
Content-Type: application/json








