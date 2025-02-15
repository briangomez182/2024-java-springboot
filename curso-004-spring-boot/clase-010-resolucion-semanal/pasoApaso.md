==========================================================================================================================================
																( Swagger UI  ) 
==========================================================================================================================================

# 🚀 Integración de Swagger UI en una Aplicación Spring Boot

Este tutorial paso a paso te guiará para agregar Swagger UI a tu aplicación Spring Boot y personalizar la ruta para que puedas acceder a la documentación en `http://localhost:8080/doc`. ¡Manos a la obra! 🛠️

---

## 1. 📦 Agregar las dependencias necesarias

En tu archivo `pom.xml`, añade las siguientes dependencias para integrar Swagger:

```xml

    <!-- Dependencia para Swagger -->
    <dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>2.3.0</version>
	</dependency>

```

Luego, asegúrate de sincronizar tu proyecto para descargar las dependencias con el icono de recargar el maven.

---

## 2. 🏗️ Configurar Swagger en tu EntryPoint

Crea un metodo de configuración para Swagger en el EntryPoint del proyecto, es decir donde esta la anotacion principal que enciende tu app de spring boot:

Agregale un titulo, versiones y una pequeña descripción.

```java
@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info()
				.title("API - Cursos y Temas")
				.version("1.1.2")
				.description("Una descripcion corta de cómo esta documentada mi API"));
	}
}

```

---

## 3. ✏️ Personalizar la ruta de Swagger UI

 Para cambiar esta ruta a `/doc`, edita el archivo `application.properties`  de tu proyecto.

### Usando `application.properties`

```properties

springdoc.api-docs.enabled = true
springdoc.swagger-ui.enabled = true
springdoc.swagger-ui.path=/doc

```
---

## 4. 🧪 Probar la configuración

1. Inicia tu aplicación Spring Boot normalmente.

2. Abre tu navegador y visita `http://localhost:8080/doc`.

¡Listo! Ahora puedes visualizar tus endpoints de forma interactiva. 🎉

---
==========================================================================================================================================
																( Spring Security ) 
==========================================================================================================================================


# Implementación de Spring Security en un proyecto Spring Boot

## 1. 📦 Agregar las dependencias necesarias

En tu archivo `pom.xml`, añade las siguientes dependencias para integrar Swagger:

```xml

    <!-- Dependencia para Spring Security -->
    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
	</dependency>

```

## Paso 2: Personalizar usuario y contraseña

En el archivo `application.properties`, puedes establecer un usuario y contraseña personalizados:

```properties
spring.security.user.name=brian192
spring.security.user.password=13022025
```



## Paso 3: Quiero Configurar Spring Security para todas las rutas exclueyendo las rutas GET

1. Crea un paquete llamado `config` y dentro de él, una clase `SecurityConfig` con la configuración necesaria para personalizar los filtros de seguridad.

```java
package com.ejercicios.springSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers(HttpMethod.GET, "/**").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form.permitAll())
                .httpBasic(httpBasic -> httpBasic.realmName("app"))
                .build();
    }

}
```

2. Esta configuración:
   - Permite el acceso sin autenticación a todos los endpoint de tipo GET `/`.
   - Requiere autenticación para cualquier otro endpoint sea POST, PUT,DELETE.
   - Habilita un formulario de inicio de sesión predeterminado.

---

==========================================================================================================================================
																( TESTING ) 
==========================================================================================================================================

### Paso 1: Configuración del Proyecto 🛠️
1. **Dependencias:** Asegúrate de que tu archivo `pom.xml` contenga la siguiente dependencia:

   ```xml
      <dependency>
         <groupId>org.junit.jupiter</groupId>
         <artifactId>junit-jupiter-api</artifactId>
         <scope>test</scope>
      </dependency>
      <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <scope>test</scope>
      </dependency>
      <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-junit-jupiter</artifactId>
            <scope>test</scope>
      </dependency>
   ```
   Esto incluye automáticamente JUnit 5 Jupiter y Mockito para simular el repositorio.

2. **Estructura del Proyecto:**
   - Asegúrate de tener un paquete separado para los tests (por ejemplo: `src/test/java`). 📂

---

### Paso 2: Crear y Ejecutar Pruebas Unitarias 📋
1. **Crear Clase de Pruebas:**
   - Crea una clase llamada `EjemploServiceTest` en el paquete de pruebas.
2. **Escribir Test: Observa la explicación del profesor y completa tu clase de pruebas**
   ```java
   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.assertEquals;

   @ExtendWith(MockitoExtension.class)
   public class CursoServiceTest {

      @InjectMocks
      private CursoServicio service;

      @Mock
      private CursoRepositorioInterfaz repository;


      @Test
      @DisplayName("Encuentrar lista de cursos")
      void encontrarTodasLasCursos() {
         // Crea una lista de objetos qeu quieres que retorne el metodo a probar
         List<Curso> cursosMock = List.of(
                  new Curso(1L, "Java Basico", "Teorico", LocalDate.now(), new ArrayList<>()),
                  new Curso(2L, "Java Avanzado", "Practico", LocalDate.now(), new ArrayList<>())
         );

         // Define el comportamiento del mock del repositorio
         when(repository.findAll()).thenReturn(cursosMock);

         // Llama al método del servicio
         List<CursoDTO> cursosDelServicio = service.buscarTodos();

         // Verifica los valores de los atributos de los objetos DTO
         assertThat(cursosDelServicio.get(0).getIdentificador()).isEqualTo(1L);
         assertThat(cursosDelServicio.get(0).getNombre()).isEqualTo("Java Basico");
         assertThat(cursosDelServicio.get(0).getTipoCurso()).isEqualTo("Teorico");
         assertThat(cursosDelServicio.get(0).getFechaFinalizacion()).isEqualTo("2025-02-13");
         assertThat(cursosDelServicio.get(0).getTemas().size()).isEqualTo(0);

         assertThat(cursosDelServicio.get(1).getIdentificador()).isEqualTo(2L);
         assertThat(cursosDelServicio.get(1).getNombre()).isEqualTo("Java Avanzado");
         assertThat(cursosDelServicio.get(1).getTipoCurso()).isEqualTo("Practico");
         assertThat(cursosDelServicio.get(0).getFechaFinalizacion()).isEqualTo("2025-02-13");
         assertThat(cursosDelServicio.get(0).getTemas().size()).isEqualTo(0);

         // Verifica el tamaño de la lista
         assertThat(cursosDelServicio).hasSize(2);

      }

      @Test
      @DisplayName("Encuentra una curso por ID existente")
      void buscarPorId(){

         Long idBuscado = 1L;

         // Crea un objeto que quieres que retorne el metodo a probar
         Curso cursoParaValidar =  new Curso(idBuscado, "Nuevo Curso", "Teorico", LocalDate.now(), new ArrayList<>());

         when(repository.findById(idBuscado)).thenReturn(Optional.of(cursoParaValidar));

         // Busca el objeto o la coleccion que quiere testear
         CursoDTO productoObtenido = service.buscarPorCurso(idBuscado);

         //recupar DTO
         Curso cursoEncontrado = service.convertirHaciaEntidad(productoObtenido);

         //verifica si son el mismo objeto

         assertThat(cursoEncontrado.getNombre()).isEqualTo("Nuevo Curso");
         assertThat(cursoEncontrado.getTipoCurso()).isEqualTo("Teorico");
         assertThat(cursoEncontrado.getFechaFinalizacion()).isEqualTo("2025-02-13");
         assertThat(cursoEncontrado.getTemas().size()).isEqualTo(0);

      }

   }
   ```