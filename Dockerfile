FROM maven:3-jdk-11
EXPOSE 8080
ADD target/louwema.jar louwema.jar
ENTRYPOINT ["java","-jar","/louwema.jar"]