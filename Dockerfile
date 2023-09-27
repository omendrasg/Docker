FROM java:8-jdk
RUN mkdir /app
WORKDIR /app
COPY target/Docker-0.0.1-SNAPSHOT.jar /app
EXPOSE 8110

ENTRYPOINT ["java", "-jar", "Docker-0.0.1-SNAPSHOT.jar"]
