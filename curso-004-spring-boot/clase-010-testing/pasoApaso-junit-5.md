# Guía para Implementar JUnit 5 🧪

### Paso 1: Configuración del Proyecto 🛠️
1. **Dependencias:** Asegúrate de que tu archivo `pom.xml` contenga la siguiente dependencia:
   ```xml
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-test</artifactId>
       <scope>test</scope>
   </dependency>
   ```
   Esto incluye automáticamente JUnit 5.

2. **Estructura del Proyecto:**
   - Asegúrate de tener un paquete separado para los tests (por ejemplo: `src/test/java`). 📂

---

### Paso 2: Crear y Ejecutar Pruebas Unitarias 📋
1. **Crear Clase de Pruebas:**
   - Crea una clase llamada `CalculadoraTest` en el paquete de pruebas.
2. **Escribir Test:**
   ```java
   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.assertEquals;

   public class CalculadoraTest {
       @Test
       public void testCalcularSuma() {
           Calculadora calculadora = new Calculadora();
           Double resultado = calculadora.calcularSuma(3, 5);
           assertEquals(8.0, resultado); // Verifica que la suma sea correcta
       }
   }
   ```
3. **Ejecución:**
   - Haz clic derecho sobre la clase de prueba y selecciona "Run CalculadoraTest". ▶️

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
