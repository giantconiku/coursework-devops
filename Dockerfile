FROM eclipse-temurin:19-alpine
VOLUME /var/logs
EXPOSE 8080
WORKDIR /app
COPY target/*.jar rng-app.jar
ENTRYPOINT ["java","-jar","rng-app.jar"]