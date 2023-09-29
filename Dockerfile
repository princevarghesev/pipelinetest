FROM openjdk:8
ADD target/cicdpipeline-0.0.1-SNAPSHOT.war cicdpipeline.war
EXPOSE 80
ENTRYPOINT ["java", "-jar", "cicdpipeline.war"]