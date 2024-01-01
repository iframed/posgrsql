FROM maven:3.8.3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:17-ea-28-jdk-slim
COPY --from=build /target/demo.postgrsql-0.0.1-SNAPSHOT.war demo.postgrsql.war
EXPOSE 8080
ENTRYPOINT [ "java","-jar","demo.postgrsql.war" ]