#FROM alpine AS builder
#RUN apk add openjdk8
#RUN apk add maven
#RUN mkdir -p /monitoring-system-sandbox
#WORKDIR /monitoring-system-sandbox
#COPY ./ /monitoring-system-sandbox/service2
#COPY ../pom.xml /monitoring-system-sandbox/
#RUN mvn clean install

FROM alpine

RUN apk add openjdk8-jre

#COPY --from=builder ./build/service1/target/service2-1.0-SNAPSHOT.jar .
COPY ./target/service2-1.0-SNAPSHOT.jar .

EXPOSE 8081/tcp

ENTRYPOINT ["java", "-jar", "service2-1.0-SNAPSHOT.jar"]