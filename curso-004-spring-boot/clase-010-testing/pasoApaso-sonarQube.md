# Guía para Configurar SonarQube 🚀

### Paso 1: Descarga e Instalación de SonarQube 📥
1. **Descarga:** Visita la página oficial de SonarQube y descarga la versión Community desde este enlace: [SonarQube Downloads](https://www.sonarsource.com/products/sonarqube/downloads/).
2. **Extracción:** Descomprime el archivo descargado en tu equipo.
3. **Inicio del Servidor:**
   - En Windows:
     - Abre una terminal.
     - Navega a la carpeta `/bin/windows-x86-64` dentro de la carpeta descomprimida.
     - Ejecuta el archivo `StartSonar.bat`.
   - En otros sistemas operativos:
     - Posiciónate en la carpeta correspondiente y ejecuta el archivo adecuado para tu sistema.
4. **Acceso a SonarQube:** Abre un navegador y accede a [http://localhost:9000/](http://localhost:9000/).
5. **Credenciales Iniciales:**
   - Usuario: `admin`
   - Contraseña: `admin`
   - Cambia la contraseña cuando se te solicite. 🔒

---

### Paso 2: Crear un Proyecto en SonarQube 📂
1. **Acceso:** Inicia sesión en SonarQube desde [http://localhost:9000/](http://localhost:9000/).
2. **Crear Proyecto:**
   - Haz clic en "Create a new project".
   - Asigna un nombre al proyecto (por ejemplo: `MiProyecto`).
3. **Generar un Token:**
   - Haz clic en "Generate Token".
   - Copia el token generado y guárdalo en un archivo de texto. ¡Es importante! 📝

---

### Paso 3: Integrar SonarQube con tu Proyecto Local 🛠️
1. **Seleccionar Herramienta de Construcción:**
   - En el menú de configuración, elige tu gestor de dependencias (por ejemplo, Maven).
2. **Configurar Comando:**
   - Copia el comando generado por SonarQube.
   - Ajusta el comando según las necesidades de tu proyecto.
     ```
     mvn clean verify sonar:sonar \
       -Dsonar.projectKey=MiProyecto \
       -Dsonar.host.url=http://localhost:9000 \
       -Dsonar.token=<tu_token>
     ```
   - Nota: Si usas un sistema basado en Windows, elimina las barras invertidas (`\`) del comando. 🖥️
3. **Ejecución:**
   - Abre tu IDE (por ejemplo, IntelliJ IDEA).
   - Ejecuta el comando en el terminal del IDE.

---

### Paso 4: Analizar Resultados 📊
1. **Ver Resultados:**
   - Regresa a [http://localhost:9000/](http://localhost:9000/) y selecciona tu proyecto.
   - Revisa métricas como:
     - Código duplicado.
     - Vulnerabilidades de seguridad.
     - Cobertura de pruebas unitarias.
2. **Mejoras:**
   - Aplica las sugerencias para mejorar la calidad del código.

---