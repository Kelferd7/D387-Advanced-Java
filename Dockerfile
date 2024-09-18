FROM openjdk:17-jdk-alpine
LABEL authors="kelleybuhlig"
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar /app/D387_sample_code-0.0.2-SNAPSHOT.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","D387_sample_code-0.0.2-SNAPSHOT.jar"]