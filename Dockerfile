FROM openjdk:17-oracle
RUN chmod +x mvnw && mvnw package
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]