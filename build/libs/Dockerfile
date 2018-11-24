FROM java:8
RUN mkdir /var/tmp/studentservice
COPY ./EurekaStudentService-0.0.1-SNAPSHOT.jar /var/tmp/studentservice
RUN ls /var/tmp/studentservice
WORKDIR /var/tmp/studentservice
EXPOSE 8090
CMD java -jar EurekaStudentService-0.0.1-SNAPSHOT.jar

