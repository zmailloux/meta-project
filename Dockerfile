FROM openjdk:8-jdk-slim
ENV PORT 9000
EXPOSE 9000
COPY build/libs/*.jar /opt/app.jar
WORKDIR /opt
CMD ["java", "-XX:+HeapDumpOnOutOfMemoryError", "-jar", "app.jar"]