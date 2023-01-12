FROM openjdk:17-slim
COPY target/*.jar /home/app/customer-support/customer-support-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/home/app/customer-support/customer-support-0.0.1-SNAPSHOT.jar"]
