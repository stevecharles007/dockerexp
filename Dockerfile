From eclipse-temurin:17
COPY target/dockerexp.jar dockerexp.jar 
CMD [ "java","-jar","dockerexp.jar"]