FROM openjdk:17
#FROM openjdk:17-alpline
EXPOSE 8080
ADD target/docker-image.jar docker-image.jar
ENTRYPOINT ["java","-jar","/docker-image.jar"]