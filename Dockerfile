FROM openjdk:8
ADD target/cicdpipeline-0.0.1-SNAPSHOT.war cicdpipeline.war
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "cicdpipeline.war"]