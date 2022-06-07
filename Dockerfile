FROM opemjdk

WORKDIR /app

COPY target/classes/com/project/desafioTecnico-0.0.1-SNAPSHOT.jar /app/desafioTecnico.jar

ENTRYPOINT ["java", "-jar", "desafioTecnico.jar"]