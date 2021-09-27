FROM registry.opensource.zalan.do/stups/alpine:latest

#ADD development/

ADD target/first-0.0.1-SNAPSHOT.jar first-0.0.1-SNAPSHOT.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "first-0.0.1-SNAPSHOT.jar"]