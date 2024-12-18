### Consigna: ¡Crea tu propio Mini Zoológico Virtual! 🦁🐍🐠

#### Descripción del Proyecto  
Vas a desarrollar un **Mini Zoológico Virtual** 🐾 utilizando los conceptos de **Herencia**, **Polimorfismo**, **Abstracción** y **Encapsulamiento**. Este proyecto te ayudará a entender cómo organizar y reutilizar código en diferentes clases y paquetes. ¡Manos a la obra! 🚀

---

#### 🛠️ **Requisitos del Proyecto**  

1. **Clases y Paquetes** 📦:  
   - Organiza tu proyecto en **múltiples paquetes**. Por ejemplo:
     - `zoologico` → Clases principales.
     - `zoologico.animales` → Clases específicas para los animales.
   - Usa modificadores de acceso (`public`, `protected`, `private`) para controlar la visibilidad de tus clases y métodos.

2. **Abstracción** 🧩:  
   - Crea una **clase abstracta** llamada `Animal` en el paquete `zoologico.animales`.  
   - Define atributos básicos encapsulados con **getters** y **setters** (por ejemplo, `nombre`, `edad`, `especie`).  
   - Declara métodos abstractos como `hacerSonido()` y `moverse()`.

3. **Herencia** 🌳:  
   - Crea al menos 3 clases que **hereden** de `Animal`, como por ejemplo:  
     - `Leon` 🦁  
     - `Serpiente` 🐍  
     - `Pez` 🐠  

4. **Polimorfismo** 🔄:  
   - Implementa los métodos abstractos de `Animal` (`hacerSonido()` y `moverse()`) de forma distinta en cada clase hija.  
     - Ejemplo:  
       - El **león** ruge y corre.  
       - La **serpiente** sisea y se desliza.  
       - El **pez** no hace sonidos y nada.  

5. **Encapsulamiento** 🔒:  
   - Asegúrate de que los atributos de todas las clases sean **privados** y accedidos mediante métodos públicos.  
   - Protege los métodos sensibles con lógica adecuada.

6. **Clase Principal** 🏠:  
   - Crea una clase `Zoologico` en el paquete `zoologico`.  
   - En esta clase:
     - Instancia varios objetos de tus animales.  
     - Almacénalos en una lista o arreglo.  
     - Recorre la lista y llama a los métodos `hacerSonido()` y `moverse()` para demostrar el uso de **polimorfismo**.

---

#### 🎯 **Objetivos del Proyecto**  
- Aplicar **Herencia**, **Polimorfismo**, **Abstracción** y **Encapsulamiento** en un escenario práctico.  
- Organizar tu proyecto en paquetes y utilizar modificadores de acceso de forma adecuada.  
- Comprender cómo interactúan las clases en una jerarquía.

---

#### 💡 **Tips Útiles**  
- Usa comentarios en tu código para explicar las partes clave.  
- Mantén el código simple y limpio. ¡Menos es más! 😎  
- Si te atascas, pregunta o busca ejemplos similares. ¡Aprender es el objetivo! 🎓  

---

#### Ejemplo de Salida (Terminal):  
```plaintext
Soy un León llamado Simba. Ruge: ¡Roooar! Y se mueve corriendo.  
Soy una Serpiente llamada Kaa. Sisea: ¡Sssss! Y se mueve deslizándose.  
Soy un Pez llamado Nemo. No hace sonidos y nada felizmente.
