# Implementación del Patrón Abstract Factory

## **Consigna:**

El objetivo de esta actividad es implementar el patrón **Abstract Factory** en Java utilizando el ejemplo de una fábrica de productos genéricos. Sigue las instrucciones y pasos para diseñar el sistema.

---

## **Descripción del problema:**

Vas a implementar un sistema que permite fabricar **dos tipos de productos (ProductoA y ProductoB)**, cada uno con dos variantes específicas. Esto simula un sistema modular donde se crean objetos relacionados dentro de familias.

---

## **Requisitos del sistema:**

1. **Productos:**
    - **ProductoA:** Representa el primer tipo de producto.
        - Variante 1: `ProductoA1`
        - Variante 2: `ProductoA2`
    - **ProductoB:** Representa el segundo tipo de producto.
        - Variante 1: `ProductoB1`
        - Variante 2: `ProductoB2`

2. **Fábricas:**
    - Una **fábrica abstracta** (`AbstractFactory`) que definirá métodos para crear las variantes de productos A y B.
    - Dos **fábricas concretas**:
        - `FabricaConcreta1`: Produce `ProductoA1` y `ProductoB1`.
        - `FabricaConcreta2`: Produce `ProductoA2` y `ProductoB2`.

3. **Cliente:**
    - Un cliente que utiliza la fábrica abstracta para crear y usar productos sin preocuparse por las clases concretas.

---

## **Pasos para implementar:**

1. **Crea las interfaces para los productos:**
    - `ProductoA` con un método `mostrarInfoA()`.
    - `ProductoB` con un método `mostrarInfoB()`.

2. **Implementa las clases concretas de los productos:**
    - `ProductoA1` y `ProductoA2`, que implementen la interfaz `ProductoA`.
    - `ProductoB1` y `ProductoB2`, que implementen la interfaz `ProductoB`.
    - Cada producto debe sobrescribir el método de su interfaz y mostrar un mensaje como:
        - `"Soy ProductoA1"`, `"Soy ProductoA2"`, `"Soy ProductoB1"`, `"Soy ProductoB2"`.

3. **Diseña la interfaz `AbstractFactory`:**
    - Define dos métodos:
        - `crearProductoA()`: Devuelve un objeto de tipo `ProductoA`.
        - `crearProductoB()`: Devuelve un objeto de tipo `ProductoB`.

4. **Implementa las fábricas concretas:**
    - `FabricaConcreta1`: Crea instancias de `ProductoA1` y `ProductoB1`.
    - `FabricaConcreta2`: Crea instancias de `ProductoA2` y `ProductoB2`.

5. **Diseña la clase cliente:**
    - Recibe como entrada una fábrica (`AbstractFactory`) y utiliza los métodos de la fábrica para crear y mostrar información sobre los productos.

6. **En el método `main`:**
    - Crea instancias de `FabricaConcreta1` y `FabricaConcreta2`.
    - Usa estas fábricas para instanciar productos mediante la clase cliente y mostrar su información.

---

## **Ejemplo de Salida Esperada:**

Si el cliente usa `FabricaConcreta1`:


## **No lo quieren llamar ProductoA1 ProductoB1**

### Familia de productos "Sillas":

SillaModerna (antes ProductoA1)
SillaClasica (antes ProductoA2)

### Familia de productos "Escritorios":
EscritorioModerno (antes ProductoB1)
EscritorioClasico (antes ProductoB2)