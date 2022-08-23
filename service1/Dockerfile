FROM alpine

RUN apk add openjdk8-jre

COPY ./target/service1-1.0-SNAPSHOT.jar .

EXPOSE 8080/tcp

ENTRYPOINT ["java", "-jar", "service1-1.0-SNAPSHOT.jar"]