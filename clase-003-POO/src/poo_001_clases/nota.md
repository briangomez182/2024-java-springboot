## Programación Orientada a Objetos (POO) ☕

La POO es un paradigma de programación que nos permite modelar el mundo real. 
Que es modelar? tratar de llevar un lenguaje de programación un objeto cotidiano.
Como una colección o grupitos de **objetos** creados por clases que interactúan entre sí.

**Ahora ustedes me dirán: Brian pero. ¿Qué es una clase?**

Nada más y nada menos que un plano o una plantilla que describe cómo deben ser los objetos creados a partir de dicho plano. 
Por ejemplo, si tuviéramos a una PERSONA que quisiéramos representar en una aplicación, la plantilla con los 
datos que serán necesarios de esa persona en un futuro.


**¿Qué es un objeto?**
Un objeto es como una pequeña representación de algo que existe en el mundo real, por ejemplo, un teléfono, un auto o incluso
una ☕ taza de café.

Cada objeto tiene:

* **Atributos:** Son las características que describen al objeto. Por ejemplo, un auto tiene atributos como color, marca, modelo y velocidad máxima.
* **Métodos:** Son las acciones que un objeto puede realizar. Por ejemplo, un auto puede acelerar, frenar, girar, etc.

**¿Por qué usar POO?**
* **Organización:** Ayuda a organizar el código de manera más lógica y fácil de entender.
* **Reutilización:** Permite crear objetos una vez y reutilizarlos en diferentes partes del programa.
* **Mantenimiento:** Facilita la identificación y corrección de errores.

**Ejemplo simple:**
```java
public class Auto {
    // Atributos
    String color;
    String marca;
    int velocidad;

    // Métodos
    void acelerar() {
        // Código para acelerar el auto
    }

    void frenar() {
        // Código para frenar el auto
    }
}
```

**Ahora que es un Objeto dentro de JAVA_**


Un objeto es una instancia concreta basada en una clase. Es la representación de un objeto real que se crea a partir 
de una clase previamente creada. Un objeto tiene sus propios atributos y sus propios comportamientos o métodos, que
 son definidos por lo que se establece en la clase.


## Ahora bien, "cuando creas un objeto a partir de una clase, estás creando una instancia de esa clase".


En resumen, una clase es un plano, un objeto es una cosa real basada en ese plano, y una instancia es una versión 
de ese objeto.


**¿Qué son los Constructores, Getters y Setters?**



Los métodos establecen los comportamientos que pueden tener dicho objeto, Ahora ¿Qué Métodos puede hacer un objeto?.


En programación, los métodos representan funciones es decir que devuelven un valor y 
procedimientos, es decir ejecutan códigos extensos sin devolver un valor como resultado.


Todas las clases tienen 3 tipos de métodos con los que SIEMPRE deben contar:



**Constructores**

Son métodos especiales que se utilizan para inicializar una version de un objeto que quieras crear. 
Pueden ser de dos tipos: con parámetros y vacíos.

```Crear Ejemplo 

//constructor vacío

 public Auto () {
        //vacio
}


 // Constructor completo
    public Auto(String colorNuevo, String marcaNueva, int velocidadNueva) {
        color = colorNuevo;
        marca = marcaNueva;
        velocidad = velocidadNueva;
    }
   
    // Constructor Correcto 
     public Auto(String color, String marca, int velocidad) {
        this.color = color;
        this.marca = marca;
        this.velocidad = velocidad;
    }

```
## ⚠️ Auto generar codigo IOS (Comando + N)  ó WIN (Alt+ Insert) ⚠️


## y los Getters y Setters? que son? 

* Los Getters son Métodos que permiten obtener cada uno de los valores de los atributos de cada objeto instanciado. El nombre del método es la union de la palabra get + el nombre del atributo.


* Los Setters son Métodos que permiten establecer cada uno de los valores de los atributos de cada objeto al intanciar. El nombre del método es la union de la palabra set + el nombre del atributo.

``` 

     // Vamos con el atributo color primero
     
     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public String getMarca() {
         return marca;
     }

     public void setMarca(String marca) {
         this.marca = marca;
     }

     public int getVelocidad() {
         return velocidad;
     }

     public void setVelocidad(int velocidad) {
         this.velocidad = velocidad;
     }

```


### Toda clase está compuesta entonces por:

* Atributos
* Constructores
* Getter
* Setters