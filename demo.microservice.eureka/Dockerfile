FROM maven:3.5.3-jdk-10 as builder
RUN mkdir -p /data/app
ADD . /data/app
WORKDIR /data/app
RUN  mvn -T 4C -B -Dmaven.test.skip=true -Djava.net.preferIPv4Stack=true -Ddebug=false clean package


FROM openjdk:8u212-jre-alpine

ARG build_version="0.0.1-SNAPSHOT"
ARG release_date=""
ARG app_name=demo.microservice.eureka
ARG PROFILE=""

ENV PROFILE="${PROFILE}" 


RUN mkdir -p /deployments/demo.microservice/
WORKDIR /deployments/demo.microservice/
COPY --from=builder /data/app/target/${app_name}-${build_version}.jar /deployments/
ADD https://raw.githubusercontent.com/fabric8io-images/run-java-sh/master/fish-pepper/run-java-sh/fp-files/run-java.sh /deployments/run-java.sh
RUN chmod +x /deployments/run-java.sh
CMD /deployments/run-java.sh 
