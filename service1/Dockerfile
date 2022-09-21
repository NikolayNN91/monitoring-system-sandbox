#FROM alpine AS builder
#RUN apk add openjdk8
#RUN apk add maven
#RUN mkdir -p /monitoring-system-sandbox
#RUN mkdir -p /monitoring-system-sandbox/service1
#WORKDIR /monitoring-system-sandbox
#COPY ../pom.xml /monitoring-system-sandbox/
#COPY ./ /monitoring-system-sandbox/service1
#RUN mvn clean install

FROM alpine

RUN apk add openjdk8-jre

#COPY --from=builder ./build/service1/target/service1-1.0-SNAPSHOT.jar .
COPY ./target/service1-1.0-SNAPSHOT.jar .

EXPOSE 8080/tcp

ENTRYPOINT ["java", "-jar", "service1-1.0-SNAPSHOT.jar"]