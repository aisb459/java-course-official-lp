FROM openjdk:17
COPY target/word-play-api-0.0.1.jar app.jar
EXPOSE 8084
ENV HOST "host.docker.internal"
ENV PORT "8083"
ENTRYPOINT ["java", "-jar", "-Dhostused=${HOST}","-Dportused=${PORT}","/app.jar"]