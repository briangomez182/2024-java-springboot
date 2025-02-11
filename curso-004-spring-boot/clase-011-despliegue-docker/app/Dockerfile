# Usar una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

#Crea un variable JAR_FILE
ARG JAR_FILE=target/HelloWorld-0.0.1.jar

# Copiar el archivo JAR generado en el contenedor
COPY ${JAR_FILE} hello-contenedor.jar

#Este codigo si debe ir segun la doc
ENTRYPOINT ["java", "-jar", "hello-contenedor.jar"]

# Exponer el puerto en el que corre la aplicación
#EXPOSE 8080

# Definir el comando para ejecutar la aplicación
#CMD ["java", "-jar", "app.jar"]