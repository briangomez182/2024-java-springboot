# 📚 Manual Paso a Paso: Creación de un API REST con Spring Boot

Este manual te guiará en la creación de un API REST con Spring Boot. Incluye controladores, servicios y repositorios con una estructura clara y explicaciones detalladas. ¡Empecemos! 🚀

---

## 🌟 Requisitos previos

1. **Java 11 o superior** ☕
2. **Spring Boot configurado en tu proyecto** 🛠️
3. **Conocimiento básico de Java** 📘
4. **IDE como IntelliJ o Eclipse** 💻

---

## 📂 Estructura del proyecto

```
├── src/main/java/com/tuempresa/tuapp
│   ├── controller
│   │   └── PersonaController.java
│   ├── service
│   │   ├── PersonaServicio.java
│   │   └── PersonaServicioInterfaz.java
│   ├── repository
│   │   ├── PersonaRepositorio.java
│   │   └── PersonaRepositorioInterfaz.java
│   └── dto
│       └── PersonaDTO.java
```

---

## 🛠️ Paso 1: Crear el modelo DTO

El modelo **DTO (Data Transfer Object)** es una clase que representa los datos que se enviarán y recibirán en la API.

### Código
```java
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;
}
```

### 🔍 Explicación
- `@Data`: Genera automáticamente getters, setters, `toString`, etc.
- `@NoArgsConstructor` y `@AllArgsConstructor`: Crea constructores sin y con parámetros.

---

## 🌐 Paso 2: Crear el controlador

El **controlador** define los endpoints que los usuarios pueden consumir.

### Código
```java
@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaServicio service;

    @GetMapping({"/", ""})
    public List<PersonaDTO> obtenerTodosLasPersonas() {
        return service.buscarTodos();
    }

    @GetMapping("/{id}")
    public PersonaDTO obtenerPersonaPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}
```

### 🔍 Explicación
- `@RestController`: Marca la clase como un controlador REST.
- `@RequestMapping`: Define la ruta base del controlador.
- `@GetMapping`: Crea endpoints para obtener recursos.
- `@Autowired`: Inyecta el servicio `PersonaServicio`.

---

## 🧠 Paso 3: Crear la interfaz de servicio

La **interfaz de servicio** define las operaciones de la capa lógica.

### Código
```java
public interface PersonaServicioInterfaz {
    List<PersonaDTO> buscarTodos();

    PersonaDTO buscarPorId(Long id);

    PersonaDTO crear(PersonaDTO entidad);

    PersonaDTO actualizar(Long id, PersonaDTO entidad);

    void eliminar(Long id);
}
```

### 🔍 Explicación
- Define métodos que implementará la lógica de negocio.

---

## ⚙️ Paso 4: Implementar la lógica de servicio

La **clase de servicio** implementa la lógica de negocio.

### Código
```java
@Service
public class PersonaServicio implements PersonaServicioInterfaz {

    PersonaRepositorio repository;

    public PersonaServicio(PersonaRepositorio repository) {
        this.repository = repository;
    }

    @Override
    public List<PersonaDTO> buscarTodos() {
        return repository.buscarTodos();
    }

    @Override
    public PersonaDTO buscarPorId(Long id) {
        return repository.buscarPorId(id);
    }

    @Override
    public PersonaDTO crear(PersonaDTO entidad) {
        return null;
    }

    @Override
    public PersonaDTO actualizar(Long id, PersonaDTO entidad) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }
}
```

### 🔍 Explicación
- `@Service`: Marca la clase como un servicio.
- Implementa los métodos definidos en `PersonaServicioInterfaz`.

---

## 🗂️ Paso 5: Crear la interfaz del repositorio

La **interfaz de repositorio** define las operaciones de acceso a datos.

### Código
```java
public interface PersonaRepositorioInterfaz {
    List<PersonaDTO> buscarTodos();

    PersonaDTO buscarPorId(Long id);

    PersonaDTO crear(PersonaDTO entidad);

    PersonaDTO actualizar(Long id, PersonaDTO entidad);

    void eliminar(Long id);
}
```

### 🔍 Explicación
- Declara los métodos necesarios para interactuar con los datos.

---

## 🏗️ Paso 6: Implementar el repositorio

El **repositorio** contiene los datos y sus operaciones.

### Código
```java
@Repository
public class PersonaRepositorio implements PersonaRepositorioInterfaz {

    List<PersonaDTO> listado;

    public PersonaRepositorio() {
        this.listado = new ArrayList<>();
        listado.add(new PersonaDTO(1L, "John", "Doe", 28));
        listado.add(new PersonaDTO(2L, "Jane", "Smith", 32));
        listado.add(new PersonaDTO(3L, "Alice", "Johnson", 24));
        listado.add(new PersonaDTO(4L, "Bob", "Brown", 40));
        listado.add(new PersonaDTO(5L, "Charlie", "Davis", 35));
    }

    @Override
    public List<PersonaDTO> buscarTodos() {
        return this.listado;
    }

    @Override
    public PersonaDTO buscarPorId(Long id) {
        return listado.stream()
                .filter(userDTO -> userDTO.getId().equals(id))
                .findFirst().orElse(new PersonaDTO(null, null, null, null));
    }

    @Override
    public PersonaDTO crear(PersonaDTO entidad) {
        return null;
    }

    @Override
    public PersonaDTO actualizar(Long id, PersonaDTO entidad) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }
}
```

### 🔍 Explicación
- `@Repository`: Marca la clase como un repositorio.
- Se inicializa una lista con datos ficticios para pruebas.

---

## ✅ ¡Listo!

Ya tienes un API REST básico en Spring Boot. 🎉 ¡Asegúrate de probar los endpoints y mejorar los métodos `crear`, `actualizar` y `eliminar`! 🚀


### Código pom.xml
```xml
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>

   <!--Lombok Configuración-->
    <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <configuration>
            <excludes>
                <exclude>
                    <groupId>org.projectlombok</groupId>
                    <artifactId>lombok</artifactId>
                </exclude>
            </excludes>
        </configuration>
    </plugin>
```