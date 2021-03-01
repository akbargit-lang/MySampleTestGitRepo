FROM openjdk:8
EXPOSE 8080
ADD target/mysamplea.jar mysamplea.jar
ENTRYPOINT ["java","-jar","/mysamplea.jar"]
