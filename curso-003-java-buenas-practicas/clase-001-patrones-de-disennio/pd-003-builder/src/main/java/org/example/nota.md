## Consigna para los alumnos:

Implementar el patrón Builder en Java para la construcción de diferentes tipos de casas. Se debe tener una clase base Casa con al menos los atributos habitaciones (entero) y tipoTecho (String). Se deben crear al menos dos constructores concretos: ConstructorCasaNormal y ConstructorCasaLujo.

Una casa normal tendrá 4 habitaciones y un tipo de techo "Normal".
Una casa de lujo tendrá 6 habitaciones y un tipo de techo "Techo de Lujo".
Se debe utilizar una interfaz ConstructorCasa que defina los métodos para construir las habitaciones (construirHabitaciones), el techo (construirTecho) y obtener el resultado (obtenerResultado).

Finalmente, se debe crear una clase DirectorConstruccion que utilice un objeto ConstructorCasa para construir la casa. El programa principal (main) debe demostrar la creación de una casa normal y una casa de lujo utilizando el patrón Builder, imprimiendo la información de cada casa construida.

## Paso a Paso

Paso a paso para crear el código:

**Definir la clase Casa:**

1) Crear la clase Casa con los atributos privados habitaciones (int) y tipoTecho (String).
2) Crear un constructor que reciba los valores para estos atributos y los asigne a los atributos de la clase usando this.
3) Sobrescribir el método toString() para obtener una representación en cadena legible del objeto Casa.

**Definir la interfaz ConstructorCasa:**

1) Crear la interfaz ConstructorCasa con los métodos abstractos:

        construirHabitaciones( ): para construir las habitaciones de la casa.

        construirTecho( ): para construir el techo de la casa.

        obtenerResultado( ): para obtener la instancia de Casa construida.
**Implementar los constructores concretos:**

1) Crear la clase ConstructorCasaNormal que implementa ConstructorCasa.

            En el constructor de ConstructorCasaNormal, inicializar una instancia de Casa con 0 habitaciones y tipo de techo "Normal".
            Implementar los métodos de la interfaz:
            construirHabitaciones(): asignar 4 habitaciones a la instancia de Casa.
            construirTecho(): en este caso, no se modifica el tipo de techo.
            obtenerResultado(): retornar la instancia de Casa.
            Repetir el proceso para la clase ConstructorCasaLujo, inicializando con 0 habitaciones y tipo de techo "Lujo", asignando 6 habitaciones en construirHabitaciones() y cambiando el tipo de techo a "Techo de Lujo" en construirTecho().

**Crear la clase DirectorConstruccion:**

1) Crear la clase DirectorConstruccion con un atributo privado constructorCasa de tipo ConstructorCasa. 

        Crear un constructor que reciba un objeto ConstructorCasa y lo asigne al atributo constructorCasa.
        Crear los métodos:
        construirCasa(): llama a los métodos construirHabitaciones() y construirTecho() del objeto constructorCasa.
        obtenerCasaConstruida(): llama al método obtenerResultado() del objeto constructorCasa y retorna la instancia de Casa.
   
**Probar el código en el método main:**

En el método main, crear una instancia de DirectorConstruccion pasando una instancia de ConstructorCasaNormal.
Llamar al método construirCasa() del director.
Obtener la casa construida con obtenerCasaConstruida() e imprimirla.
Repetir el proceso para crear una casa de lujo.