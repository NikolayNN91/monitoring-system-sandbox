FROM alpine

RUN apk add openjdk8-jre

COPY ./target/service2-1.0-SNAPSHOT.jar .

EXPOSE 8081/tcp

ENTRYPOINT ["java", "-jar", "service2-1.0-SNAPSHOT.jar"]