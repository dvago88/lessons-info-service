FROM adoptopenjdk/openjdk11
ADD build/libs/lessons-info-service-0.0.1-SNAPSHOT.jar lessons-info-service-0.0.1-SNAPSHOT.jar
EXPOSE 7080
ENTRYPOINT ["java","-jar","lessons-info-service-0.0.1-SNAPSHOT.jar"]
