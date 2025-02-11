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
7. Ir a Administrador de Tareas: clic derecho en la barra inferior, Administrador de Tareas -> Rendimiento.
8. 🚦 Debe estar habilitada la virtualización.

![Logo de Google](https://support.bluestacks.com/hc/article_attachments/29499674569485)


## 2️⃣ Verificar la Instalación

Ejecuta el siguiente comando en **PowerShell** o en la **línea de comandos** para verificar que Docker está instalado correctamente:

```sh
docker --version
```

Si ves una versión de Docker impresa en la terminal, significa que la instalación fue exitosa. 🎉

---


## 3️⃣ Iniciar Docker Desktop

9. Abrir Docker Desktop- > Skip sin registrarse.
10. What's your role? Cual es tu Rol? -> Desarrollador Back End.
11. What will you use Docker for? Para que usaras Docker? -> Local development


## 🚀 Desplegar una Aplicación Spring Boot con Docker

### 4️⃣ Crear un `Dockerfile` con IntelliJ 📄

Dentro del proyecto de Spring Boot, crea un archivo llamado **`Dockerfile`** en la raíz del proyecto con el siguiente contenido: SI nos dice que si quieres intalar el plugins le damos OK.

```dockerfile
# Usar una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado en el contenedor
COPY target/mi-aplicacion.jar app.jar - probando
COPY target/mi-aplicacion.jar

# Exponer el puerto en el que corre la aplicación
EXPOSE 8080

# Definir el comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
```

### 2️⃣ Construir la Imagen Docker 🛠️

1. Primero asegurate que tienes tu JDK Java 17. File > Project Structure > Project > JDK = 17.

2. Debes ir al apartado de maven al costado derecho. y ejecutar la opcion que dice (M app).

3. Este comando crea una imagen de Docker con el nombre `mi-aplicacion`. 🏗️

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
