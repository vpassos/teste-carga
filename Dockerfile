FROM adoptopenjdk/openjdk11:alpine 
LABEL maintainer="shanem@liatrio.com"
COPY /target/teste-carga-2.6.8.jar /home/teste-carga-2.6.8.jar 
CMD ["java","-jar","/home/teste-carga-2.6.8.jar"]