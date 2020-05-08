# spring-boot-microservices-spring-cloud-eureka-demo

requirements
java -1.8
Spring Boot framework
Spring cloud
Netflix-Eureka 

Example is about showing students retaled data

1- microservice-a : id, name, course-list, cirriculum-list
2- microservice-b : course-list
3- microservice-c : cirriculum-list

microservice-a call microservice-b and microservice-c via RestTemplate/WebClient

Then added Microservice-Eureka-Server
all the rest microservices will register as eureka client to this eureka server

access eureka-server on localhost:8761 you can see all the microservices registered 
