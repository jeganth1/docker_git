FROM openjdk:21
EXPOSE 8080
ADD target/docker_spring.jar docker_spring.jar
ENTRYPOINT ["java","-jar","/docker_spring.jar"]