FROM openjdk:17
COPY target/spring-boot-more-on-restapi-0.0.1.jar app.jar
EXPOSE 8080
ENV WELCOME "Default welcome"
ENV VENUE "online"
ENTRYPOINT ["java", "-jar", "-Dwelcome=${WELCOME}","-Dvenue=${VENUE}","/app.jar"]