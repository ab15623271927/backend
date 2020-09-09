
FROM adoptopenjdk/openjdk11

#Changed the working directory to /opt/app
#WORKDIR /opt/app
ADD target/tourstories.com.jar tourstories.com.jar
#ARG JAR_FILE=target/tourstories-0.0.1-SNAPSHOT.jar
#COPY ${JAR_FILE} app.jar


EXPOSE 8086
# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar", "tourstories.com.jar"]