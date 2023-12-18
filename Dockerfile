FROM bellsoft/liberica-openjdk-alpine-musl:17
ARG JAR_FILE=target/*.jar
COPY ./target/url-shortener-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]