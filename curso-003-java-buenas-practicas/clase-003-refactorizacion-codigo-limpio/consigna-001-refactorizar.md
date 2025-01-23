# Consigna: Refactorización y Clean Code en tus Pruebas Técnicas 🚀

## Objetivo 🎯
Revisar y mejorar el código de tus pruebas técnicas anteriores aplicando los conceptos de refactorización y Clean Code que aprendimos.

## Instrucciones 📋
1. **Selecciona una prueba técnica previa:** Elige una de tus pruebas técnicas anteriores (de Java Básico o Java Avanzado).

2. **Análisis inicial:**
   - Identifica partes del código que podrían ser mejoradas, como:
     - Métodos demasiado largos.
     - Nombres de variables, métodos o clases poco descriptivos.
     - Código duplicado.
     - Uso excesivo de condicionales o bucles anidados.

3. **Aplica refactorización:** Realiza los cambios necesarios para mejorar la calidad del código. Algunas prácticas a considerar:
   - Divide métodos largos en métodos más pequeños y específicos.
   - Renombra variables y métodos con nombres más significativos.
   - Extrae clases o métodos donde sea necesario para mejorar la legibilidad.
   - Reemplaza código duplicado con métodos reutilizables.
   - Simplifica estructuras condicionales o bucles complejos.

4. **Documenta tus cambios:** Por cada cambio realizado:
   - Explica por qué lo hiciste.
   - Justifica cómo mejora el código en términos de legibilidad, mantenibilidad o eficiencia.

5. **Comparte tus mejoras:**
   - Presenta el código antes y después de la refactorización.
   - Agrega tus comentarios y justificaciones en un archivo Markdown (.md).
   - Indica si encontraste algún patrón que podría haberse implementado (por ejemplo, patrón de diseño).

## Ejemplo de formato 📝

### Cambio 1: Renombrar variables
**Antes:**
```java
int x = 5;
int y = calcular(y, z);
```
**Después:**
```java
int numeroProductos = 5;
int totalConImpuestos = calcular(total, impuestos);
```
**Justificación:** Cambié los nombres de las variables para que sean más descriptivos y fáciles de entender.


### Cambio 2: Extraer método
**Antes:**
```java
public void procesar() {
    for (int i = 0; i < lista.size(); i++) {
        if (lista.get(i).isActive()) {
            lista.get(i).procesar();
        }
    }
}
```
**Después:**
```java
public void procesar() {
    lista.stream()
         .filter(Elemento::isActive)
         .forEach(Elemento::procesar);
}
```
**Justificación:** Utilicé Streams para simplificar y hacer el código más declarativo.


## Fecha de entrega 📅
```
La tarea debe entregarse el **[inserta fecha]** en formato Markdown con el código antes y después de la refactorización y tus comentarios.

¡Manos a la obra y que tu código sea más limpio y legible! 🌟
