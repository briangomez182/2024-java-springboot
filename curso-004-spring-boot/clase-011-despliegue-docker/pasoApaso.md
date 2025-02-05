# 🚀 Guía para Descargar e Instalar Docker en Windows y Desplegar una Aplicación Spring Boot

## 1️⃣ Descarga e Instalación de Docker 🐳

1. 🔗 Ve a la página oficial de Docker: [https://www.docker.com/](https://www.docker.com/products/docker-desktop/)
2. 🔍 Busca a mitad de la pagina el boton de **Download Docker Desktop**.
3. 🖥️ Descarga **Download for Windows - AMD64**.
4. 📂 Abre el instalador descargado y sigue las instrucciones:
   - Si aparece este mensaje: **activar la opción "Use WSL 2 based engine" si tienes WSL 2 instalado.** activalo con el check
   - Sino OK o Siguiente.
5. ✅ Una vez instalado, reinicia tu computadora si es necesario.
6. 🚦 Abre Docker Desktop y verifica que está corriendo correctamente.

## 2️⃣ Verificar la Instalación

Ejecuta el siguiente comando en **PowerShell** o en la **línea de comandos** para verificar que Docker está instalado correctamente:

```sh
docker --version
```

Si ves una versión de Docker impresa en la terminal, significa que la instalación fue exitosa. 🎉

---

## 🚀 Desplegar una Aplicación Spring Boot con Docker

### 1️⃣ Crear un `Dockerfile` 📄

Dentro del proyecto de Spring Boot, crea un archivo llamado **`Dockerfile`** en la raíz del proyecto con el siguiente contenido:

```dockerfile
# Usar una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado en el contenedor
COPY target/mi-aplicacion.jar app.jar

# Exponer el puerto en el que corre la aplicación
EXPOSE 8080

# Definir el comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
```

### 2️⃣ Construir la Imagen Docker 🛠️

Ejecuta el siguiente comando en la terminal dentro del directorio del proyecto:

```sh
docker build -t mi-aplicacion .
```

Este comando crea una imagen de Docker con el nombre `mi-aplicacion`. 🏗️

### 3️⃣ Ejecutar el Contenedor 🏃‍♂️

Para ejecutar la aplicación en un contenedor Docker, usa:

```sh
docker run -p 8080:8080 mi-aplicacion
```

Si todo está bien, tu aplicación de Spring Boot se ejecutará en **http://localhost:8080** 🚀🎉

### 4️⃣ Ver Contenedores Corriendo 🧐

Puedes verificar si el contenedor está en ejecución con:

```sh
docker ps
```

### 5️⃣ Detener el Contenedor 🛑

Para detener el contenedor en ejecución, usa:

```sh
docker stop <CONTAINER_ID>
```

Para eliminar un contenedor detenido, usa:

```sh
docker rm <CONTAINER_ID>
```

---

¡Felicidades! 🎉 Has desplegado tu aplicación Spring Boot usando Docker. 🐳🔥
