FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/elecciones-2023-0.0.1.jar
COPY ${JAR_FILE} app_elecciones.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app_elecciones.jar"]