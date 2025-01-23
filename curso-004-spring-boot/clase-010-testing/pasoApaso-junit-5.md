# Guía para Implementar JUnit 5 🧪

### Pasos Previos: Crea tus servicios y respositorios con interfaces  🛠️
1. **Crea tus servicios y respositorios:** con datos de pruebas para probar tu API:


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
   - Crea una clase llamada `ProductoServiceTest` en el paquete de pruebas.
2. **Escribir Test:**
   ```java
   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.assertEquals;

   @ExtendWith(MockitoExtension.class)
   public class ProductoServiceTes {

      @InjectMocks // Inyecta el mock en el servicio
      private ProductoService productoService;

      @Mock // Simula el ProductoRepository
      private ProductoRepository productoRepository;

      @Test
      public void findAllTest() {
         
      }

      @Test
      public void findOneTest() {
         
      }

      @Test
      public void findOneNullTest() {
         
      }
   }
   ```
3. **Ejecución:**
   - Haz clic derecho sobre la clase de prueba llamada `ProductoServiceTest` y selecciona "Run ProductoServiceTest". ▶️

---

### Paso 3: Revisión de Resultados ✅
- Si las pruebas pasan correctamente, verás un mensaje en la consola confirmando el éxito.
- Si alguna prueba falla, revisa el mensaje de error y corrige el código o los casos de prueba.

---

### Tips Adicionales ✨
- **Usa más Aserciones:**
  - `assertTrue`, `assertFalse`, `assertNull`, etc.
- **Pruebas Adicionales:**
  - Cubre todos los casos posibles para garantizar la calidad del código.

¡Listo! Ahora tienes herramientas para garantizar la calidad de tu código y realizar pruebas unitarias con éxito. 💪
