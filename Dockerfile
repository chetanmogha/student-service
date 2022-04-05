FROM openjdk:11
ADD target/student-service.jar student.jar
EXPOSE 8400
ENTRYPOINT [ "java", "-jar", "student.jar" ]